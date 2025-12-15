package org.orbitalLogistic.mission.clients.resilient;

import org.orbitalLogistic.mission.clients.SpacecraftDTO;
import org.orbitalLogistic.mission.clients.SpacecraftServiceClient;
import org.orbitalLogistic.mission.exceptions.SpacecraftServiceException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import feign.FeignException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class ResilientSpacecraftService {
    private final SpacecraftServiceClient spacecraftServiceApi;

    @CircuitBreaker(name = "spacecraftService", fallbackMethod = "getTransportStatusIdFallback")
    public SpacecraftDTO getSpacecraftById(Long id) {
        log.debug("Calling spacecraftService for id: {}", id);
        try {
            return spacecraftServiceApi.getSpacecraftById(id);
        } catch (FeignException.NotFound e) {
            throw new SpacecraftServiceException("spacecraftService '" + id + "' not found");
        }
    }

    public ResponseEntity<Long> getSpacecraftByIdFallback(String name, Throwable t) {
        log.error("FALLBACK getSpacecraftById! status: {}, error: {}", name, t.getClass().getSimpleName());
        throw new SpacecraftServiceException("Spacecraft service unavailable", t);
    }
}
