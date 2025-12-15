package org.orbitalLogistic.inventory.mappers;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.inventory.dto.request.CargoManifestRequestDTO;
import org.orbitalLogistic.inventory.dto.response.CargoManifestResponseDTO;
import org.orbitalLogistic.inventory.entities.CargoManifest;
import org.orbitalLogistic.inventory.entities.enums.ManifestPriority;
import org.orbitalLogistic.inventory.entities.enums.ManifestStatus;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:13:07+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class CargoManifestMapperImpl implements CargoManifestMapper {

    @Override
    public CargoManifestResponseDTO toResponseDTO(CargoManifest manifest, String spacecraftName, String cargoName, String storageUnitCode, String loadedByUserName, String unloadedByUserName) {
        if ( manifest == null && spacecraftName == null && cargoName == null && storageUnitCode == null && loadedByUserName == null && unloadedByUserName == null ) {
            return null;
        }

        Long id = null;
        Long spacecraftId = null;
        Long cargoId = null;
        Long storageUnitId = null;
        Integer quantity = null;
        LocalDateTime loadedAt = null;
        LocalDateTime unloadedAt = null;
        Long loadedByUserId = null;
        Long unloadedByUserId = null;
        ManifestStatus manifestStatus = null;
        ManifestPriority priority = null;
        if ( manifest != null ) {
            id = manifest.getId();
            spacecraftId = manifest.getSpacecraftId();
            cargoId = manifest.getCargoId();
            storageUnitId = manifest.getStorageUnitId();
            quantity = manifest.getQuantity();
            loadedAt = manifest.getLoadedAt();
            unloadedAt = manifest.getUnloadedAt();
            loadedByUserId = manifest.getLoadedByUserId();
            unloadedByUserId = manifest.getUnloadedByUserId();
            manifestStatus = manifest.getManifestStatus();
            priority = manifest.getPriority();
        }
        String spacecraftName1 = null;
        spacecraftName1 = spacecraftName;
        String cargoName1 = null;
        cargoName1 = cargoName;
        String storageUnitCode1 = null;
        storageUnitCode1 = storageUnitCode;
        String loadedByUserName1 = null;
        loadedByUserName1 = loadedByUserName;
        String unloadedByUserName1 = null;
        unloadedByUserName1 = unloadedByUserName;

        CargoManifestResponseDTO cargoManifestResponseDTO = new CargoManifestResponseDTO( id, spacecraftId, spacecraftName1, cargoId, cargoName1, storageUnitId, storageUnitCode1, quantity, loadedAt, unloadedAt, loadedByUserId, loadedByUserName1, unloadedByUserId, unloadedByUserName1, manifestStatus, priority );

        return cargoManifestResponseDTO;
    }

    @Override
    public CargoManifest toEntity(CargoManifestRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        CargoManifest.CargoManifestBuilder cargoManifest = CargoManifest.builder();

        cargoManifest.cargoId( request.cargoId() );
        cargoManifest.loadedAt( request.loadedAt() );
        cargoManifest.loadedByUserId( request.loadedByUserId() );
        cargoManifest.manifestStatus( request.manifestStatus() );
        cargoManifest.priority( request.priority() );
        cargoManifest.quantity( request.quantity() );
        cargoManifest.spacecraftId( request.spacecraftId() );
        cargoManifest.storageUnitId( request.storageUnitId() );
        cargoManifest.unloadedAt( request.unloadedAt() );
        cargoManifest.unloadedByUserId( request.unloadedByUserId() );

        return cargoManifest.build();
    }
}
