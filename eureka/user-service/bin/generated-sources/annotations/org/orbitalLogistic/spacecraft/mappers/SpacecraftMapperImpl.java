package org.orbitalLogistic.spacecraft.mappers;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.spacecraft.dto.request.SpacecraftRequestDTO;
import org.orbitalLogistic.spacecraft.dto.response.SpacecraftResponseDTO;
import org.orbitalLogistic.spacecraft.entities.Spacecraft;
import org.orbitalLogistic.spacecraft.entities.enums.SpacecraftClassification;
import org.orbitalLogistic.spacecraft.entities.enums.SpacecraftStatus;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:13:19+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class SpacecraftMapperImpl implements SpacecraftMapper {

    @Override
    public SpacecraftResponseDTO toResponseDTO(Spacecraft spacecraft, String spacecraftTypeName, SpacecraftClassification classification, BigDecimal currentMassUsage, BigDecimal currentVolumeUsage) {
        if ( spacecraft == null && spacecraftTypeName == null && classification == null && currentMassUsage == null && currentVolumeUsage == null ) {
            return null;
        }

        Long id = null;
        String registryCode = null;
        String name = null;
        BigDecimal massCapacity = null;
        BigDecimal volumeCapacity = null;
        SpacecraftStatus status = null;
        String currentLocation = null;
        if ( spacecraft != null ) {
            id = spacecraft.getId();
            registryCode = spacecraft.getRegistryCode();
            name = spacecraft.getName();
            massCapacity = spacecraft.getMassCapacity();
            volumeCapacity = spacecraft.getVolumeCapacity();
            status = spacecraft.getStatus();
            currentLocation = spacecraft.getCurrentLocation();
        }
        String spacecraftTypeName1 = null;
        spacecraftTypeName1 = spacecraftTypeName;
        SpacecraftClassification classification1 = null;
        classification1 = classification;
        BigDecimal currentMassUsage1 = null;
        currentMassUsage1 = currentMassUsage;
        BigDecimal currentVolumeUsage1 = null;
        currentVolumeUsage1 = currentVolumeUsage;

        SpacecraftResponseDTO spacecraftResponseDTO = new SpacecraftResponseDTO( id, registryCode, name, spacecraftTypeName1, classification1, massCapacity, volumeCapacity, status, currentLocation, currentMassUsage1, currentVolumeUsage1 );

        return spacecraftResponseDTO;
    }

    @Override
    public Spacecraft toEntity(SpacecraftRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        Spacecraft.SpacecraftBuilder spacecraft = Spacecraft.builder();

        if ( request.currentLocation() != null ) {
            spacecraft.currentLocation( request.currentLocation() );
        }
        else {
            spacecraft.currentLocation( "Orbital Station Alpha" );
        }
        spacecraft.massCapacity( request.massCapacity() );
        spacecraft.name( request.name() );
        spacecraft.registryCode( request.registryCode() );
        spacecraft.spacecraftTypeId( request.spacecraftTypeId() );
        spacecraft.volumeCapacity( request.volumeCapacity() );

        spacecraft.status( org.orbitalLogistic.spacecraft.entities.enums.SpacecraftStatus.DOCKED );

        return spacecraft.build();
    }
}
