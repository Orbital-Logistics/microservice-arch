package org.orbitalLogistic.cargo.mappers;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.cargo.dto.request.CargoRequestDTO;
import org.orbitalLogistic.cargo.dto.response.CargoResponseDTO;
import org.orbitalLogistic.cargo.entities.Cargo;
import org.orbitalLogistic.cargo.entities.enums.CargoType;
import org.orbitalLogistic.cargo.entities.enums.HazardLevel;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:12:56+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class CargoMapperImpl implements CargoMapper {

    @Override
    public CargoResponseDTO toResponseDTO(Cargo cargo, String cargoCategoryName, Integer totalQuantity) {
        if ( cargo == null && cargoCategoryName == null && totalQuantity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        BigDecimal massPerUnit = null;
        BigDecimal volumePerUnit = null;
        CargoType cargoType = null;
        HazardLevel hazardLevel = null;
        if ( cargo != null ) {
            id = cargo.getId();
            name = cargo.getName();
            massPerUnit = cargo.getMassPerUnit();
            volumePerUnit = cargo.getVolumePerUnit();
            cargoType = cargo.getCargoType();
            hazardLevel = cargo.getHazardLevel();
        }
        String cargoCategoryName1 = null;
        cargoCategoryName1 = cargoCategoryName;
        Integer totalQuantity1 = null;
        totalQuantity1 = totalQuantity;

        CargoResponseDTO cargoResponseDTO = new CargoResponseDTO( id, name, cargoCategoryName1, massPerUnit, volumePerUnit, cargoType, hazardLevel, totalQuantity1 );

        return cargoResponseDTO;
    }

    @Override
    public Cargo toEntity(CargoRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        Cargo.CargoBuilder cargo = Cargo.builder();

        cargo.cargoCategoryId( request.cargoCategoryId() );
        cargo.cargoType( request.cargoType() );
        cargo.hazardLevel( request.hazardLevel() );
        cargo.massPerUnit( request.massPerUnit() );
        cargo.name( request.name() );
        cargo.volumePerUnit( request.volumePerUnit() );

        cargo.isActive( true );

        return cargo.build();
    }
}
