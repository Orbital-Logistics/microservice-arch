package org.orbitalLogistic.mission.clients.resilient;

import org.orbitalLogistic.mission.clients.UserDTO;
import org.orbitalLogistic.mission.clients.UserServiceClient;
import org.orbitalLogistic.mission.exceptions.UserServiceException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import feign.FeignException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class ResilientUserService {
    private final UserServiceClient userServiceApi;

    @CircuitBreaker(name = "userService", fallbackMethod = "getUserByIdFallback")
    public UserDTO getUserById(Long id) {
        log.debug("Calling user-service for userId: {}", id);
        try {
            return userServiceApi.getUserById(id);
        } catch (FeignException.NotFound e) {
            e.printStackTrace();
            throw new UserServiceException("User with ID " + id + " not found");
        }
    }

    public UserDTO getUserByIdFallback(Long id, Throwable t) {
        log.error("FALLBACK getUserById! userId: {}, error: {}", id, t.getClass().getSimpleName());

        if (!(t instanceof UserServiceException && t.getMessage().contains("not found"))) {
            throw new UserServiceException("User service unavailable", t);
        }
        throw (UserServiceException) t;
    }

    @CircuitBreaker(name = "userService", fallbackMethod = "userExistsFallback")
    public Boolean userExists(Long id) {
        log.debug("Calling user-service for userId: {}", id);
        try {
            return userServiceApi.userExists(id);
        } catch (FeignException.NotFound e) {
            e.printStackTrace();
            throw new UserServiceException("User with ID " + id + " already exists");
        }
    }

    public UserDTO userExistsFallback(Long id, Throwable t) {
        log.error("FALLBACK userExists! userId: {}, error: {}", id, t.getClass().getSimpleName());

        if (!(t instanceof UserServiceException && t.getMessage().contains("exists"))) {
            throw new UserServiceException("User service unavailable", t);
        }
        throw (UserServiceException) t;
    }
}
