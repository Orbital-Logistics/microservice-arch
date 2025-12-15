package org.orbitalLogistic.spacecraft.mappers;

import javax.annotation.processing.Generated;
import org.orbitalLogistic.spacecraft.dto.request.SpacecraftTypeRequestDTO;
import org.orbitalLogistic.spacecraft.dto.response.SpacecraftTypeResponseDTO;
import org.orbitalLogistic.spacecraft.entities.SpacecraftType;
import org.orbitalLogistic.spacecraft.entities.enums.SpacecraftClassification;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:13:19+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class SpacecraftTypeMapperImpl implements SpacecraftTypeMapper {

    @Override
    public SpacecraftTypeResponseDTO toResponseDTO(SpacecraftType spacecraftType) {
        if ( spacecraftType == null ) {
            return null;
        }

        Long id = null;
        String typeName = null;
        SpacecraftClassification classification = null;
        Integer maxCrewCapacity = null;

        id = spacecraftType.getId();
        typeName = spacecraftType.getTypeName();
        classification = spacecraftType.getClassification();
        maxCrewCapacity = spacecraftType.getMaxCrewCapacity();

        SpacecraftTypeResponseDTO spacecraftTypeResponseDTO = new SpacecraftTypeResponseDTO( id, typeName, classification, maxCrewCapacity );

        return spacecraftTypeResponseDTO;
    }

    @Override
    public SpacecraftType toEntity(SpacecraftTypeRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        SpacecraftType.SpacecraftTypeBuilder spacecraftType = SpacecraftType.builder();

        spacecraftType.classification( request.classification() );
        spacecraftType.maxCrewCapacity( request.maxCrewCapacity() );
        spacecraftType.typeName( request.typeName() );

        return spacecraftType.build();
    }
}
