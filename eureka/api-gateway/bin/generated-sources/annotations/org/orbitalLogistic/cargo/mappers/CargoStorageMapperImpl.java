package org.orbitalLogistic.cargo.mappers;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.cargo.dto.request.CargoStorageRequestDTO;
import org.orbitalLogistic.cargo.dto.response.CargoStorageResponseDTO;
import org.orbitalLogistic.cargo.entities.CargoStorage;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:12:54+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class CargoStorageMapperImpl implements CargoStorageMapper {

    @Override
    public CargoStorageResponseDTO toResponseDTO(CargoStorage cargoStorage, String storageUnitCode, String storageLocation, String cargoName, String lastCheckedByUserName) {
        if ( cargoStorage == null && storageUnitCode == null && storageLocation == null && cargoName == null && lastCheckedByUserName == null ) {
            return null;
        }

        Long id = null;
        Integer quantity = null;
        LocalDateTime storedAt = null;
        LocalDateTime lastInventoryCheck = null;
        if ( cargoStorage != null ) {
            id = cargoStorage.getId();
            quantity = cargoStorage.getQuantity();
            storedAt = cargoStorage.getStoredAt();
            lastInventoryCheck = cargoStorage.getLastInventoryCheck();
        }
        String storageUnitCode1 = null;
        storageUnitCode1 = storageUnitCode;
        String storageLocation1 = null;
        storageLocation1 = storageLocation;
        String cargoName1 = null;
        cargoName1 = cargoName;
        String lastCheckedByUserName1 = null;
        lastCheckedByUserName1 = lastCheckedByUserName;

        CargoStorageResponseDTO cargoStorageResponseDTO = new CargoStorageResponseDTO( id, storageUnitCode1, storageLocation1, cargoName1, quantity, storedAt, lastInventoryCheck, lastCheckedByUserName1 );

        return cargoStorageResponseDTO;
    }

    @Override
    public CargoStorage toEntity(CargoStorageRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        CargoStorage.CargoStorageBuilder cargoStorage = CargoStorage.builder();

        cargoStorage.lastCheckedByUserId( request.updatedByUserId() );
        cargoStorage.cargoId( request.cargoId() );
        cargoStorage.quantity( request.quantity() );
        cargoStorage.storageUnitId( request.storageUnitId() );

        cargoStorage.storedAt( java.time.LocalDateTime.now() );

        return cargoStorage.build();
    }
}
