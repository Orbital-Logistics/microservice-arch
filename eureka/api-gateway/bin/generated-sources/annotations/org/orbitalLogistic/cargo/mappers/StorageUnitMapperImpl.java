package org.orbitalLogistic.cargo.mappers;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.cargo.dto.request.StorageUnitRequestDTO;
import org.orbitalLogistic.cargo.dto.response.StorageUnitResponseDTO;
import org.orbitalLogistic.cargo.entities.StorageUnit;
import org.orbitalLogistic.cargo.entities.enums.StorageTypeEnum;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:12:56+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class StorageUnitMapperImpl implements StorageUnitMapper {

    @Override
    public StorageUnitResponseDTO toResponseDTO(StorageUnit storageUnit, BigDecimal availableMassCapacity, BigDecimal availableVolumeCapacity, Double massUsagePercentage, Double volumeUsagePercentage) {
        if ( storageUnit == null && availableMassCapacity == null && availableVolumeCapacity == null && massUsagePercentage == null && volumeUsagePercentage == null ) {
            return null;
        }

        Long id = null;
        String unitCode = null;
        String location = null;
        StorageTypeEnum storageType = null;
        BigDecimal totalMassCapacity = null;
        BigDecimal totalVolumeCapacity = null;
        BigDecimal currentMass = null;
        BigDecimal currentVolume = null;
        if ( storageUnit != null ) {
            id = storageUnit.getId();
            unitCode = storageUnit.getUnitCode();
            location = storageUnit.getLocation();
            storageType = storageUnit.getStorageType();
            totalMassCapacity = storageUnit.getTotalMassCapacity();
            totalVolumeCapacity = storageUnit.getTotalVolumeCapacity();
            currentMass = storageUnit.getCurrentMass();
            currentVolume = storageUnit.getCurrentVolume();
        }
        BigDecimal availableMassCapacity1 = null;
        availableMassCapacity1 = availableMassCapacity;
        BigDecimal availableVolumeCapacity1 = null;
        availableVolumeCapacity1 = availableVolumeCapacity;
        Double massUsagePercentage1 = null;
        massUsagePercentage1 = massUsagePercentage;
        Double volumeUsagePercentage1 = null;
        volumeUsagePercentage1 = volumeUsagePercentage;

        StorageUnitResponseDTO storageUnitResponseDTO = new StorageUnitResponseDTO( id, unitCode, location, storageType, totalMassCapacity, totalVolumeCapacity, currentMass, currentVolume, availableMassCapacity1, availableVolumeCapacity1, massUsagePercentage1, volumeUsagePercentage1 );

        return storageUnitResponseDTO;
    }

    @Override
    public StorageUnit toEntity(StorageUnitRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        StorageUnit.StorageUnitBuilder storageUnit = StorageUnit.builder();

        storageUnit.location( request.location() );
        storageUnit.storageType( request.storageType() );
        storageUnit.totalMassCapacity( request.totalMassCapacity() );
        storageUnit.totalVolumeCapacity( request.totalVolumeCapacity() );
        storageUnit.unitCode( request.unitCode() );

        storageUnit.currentMass( new BigDecimal( "0" ) );
        storageUnit.currentVolume( new BigDecimal( "0" ) );

        return storageUnit.build();
    }
}
