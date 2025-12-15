package org.orbitalLogistic.cargo.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.cargo.dto.request.CargoCategoryRequestDTO;
import org.orbitalLogistic.cargo.dto.response.CargoCategoryResponseDTO;
import org.orbitalLogistic.cargo.entities.CargoCategory;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:12:57+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class CargoCategoryMapperImpl implements CargoCategoryMapper {

    @Override
    public CargoCategoryResponseDTO toResponseDTO(CargoCategory category, String parentCategoryName, List<CargoCategoryResponseDTO> children, Integer level) {
        if ( category == null && parentCategoryName == null && children == null && level == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        Long parentCategoryId = null;
        String description = null;
        if ( category != null ) {
            id = category.getId();
            name = category.getName();
            parentCategoryId = category.getParentCategoryId();
            description = category.getDescription();
        }
        String parentCategoryName1 = null;
        parentCategoryName1 = parentCategoryName;
        List<CargoCategoryResponseDTO> children1 = null;
        List<CargoCategoryResponseDTO> list = children;
        if ( list != null ) {
            children1 = new ArrayList<CargoCategoryResponseDTO>( list );
        }
        Integer level1 = null;
        level1 = level;

        CargoCategoryResponseDTO cargoCategoryResponseDTO = new CargoCategoryResponseDTO( id, name, parentCategoryId, parentCategoryName1, description, children1, level1 );

        return cargoCategoryResponseDTO;
    }

    @Override
    public CargoCategory toEntity(CargoCategoryRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        CargoCategory.CargoCategoryBuilder cargoCategory = CargoCategory.builder();

        cargoCategory.description( request.description() );
        cargoCategory.name( request.name() );
        cargoCategory.parentCategoryId( request.parentCategoryId() );

        return cargoCategory.build();
    }
}
