package org.orbitalLogistic.maintenance.mappers;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.maintenance.dto.request.MaintenanceLogRequestDTO;
import org.orbitalLogistic.maintenance.dto.response.MaintenanceLogResponseDTO;
import org.orbitalLogistic.maintenance.entities.MaintenanceLog;
import org.orbitalLogistic.maintenance.entities.enums.MaintenanceStatus;
import org.orbitalLogistic.maintenance.entities.enums.MaintenanceType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:13:13+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class MaintenanceLogMapperImpl implements MaintenanceLogMapper {

    @Override
    public MaintenanceLogResponseDTO toResponseDTO(MaintenanceLog maintenanceLog, String spacecraftName, String performedByUserName, String supervisedByUserName) {
        if ( maintenanceLog == null && spacecraftName == null && performedByUserName == null && supervisedByUserName == null ) {
            return null;
        }

        Long id = null;
        Long spacecraftId = null;
        MaintenanceType maintenanceType = null;
        Long performedByUserId = null;
        Long supervisedByUserId = null;
        LocalDateTime startTime = null;
        LocalDateTime endTime = null;
        MaintenanceStatus status = null;
        String description = null;
        BigDecimal cost = null;
        if ( maintenanceLog != null ) {
            id = maintenanceLog.getId();
            spacecraftId = maintenanceLog.getSpacecraftId();
            maintenanceType = maintenanceLog.getMaintenanceType();
            performedByUserId = maintenanceLog.getPerformedByUserId();
            supervisedByUserId = maintenanceLog.getSupervisedByUserId();
            startTime = maintenanceLog.getStartTime();
            endTime = maintenanceLog.getEndTime();
            status = maintenanceLog.getStatus();
            description = maintenanceLog.getDescription();
            cost = maintenanceLog.getCost();
        }
        String spacecraftName1 = null;
        spacecraftName1 = spacecraftName;
        String performedByUserName1 = null;
        performedByUserName1 = performedByUserName;
        String supervisedByUserName1 = null;
        supervisedByUserName1 = supervisedByUserName;

        MaintenanceLogResponseDTO maintenanceLogResponseDTO = new MaintenanceLogResponseDTO( id, spacecraftId, spacecraftName1, maintenanceType, performedByUserId, performedByUserName1, supervisedByUserId, supervisedByUserName1, startTime, endTime, status, description, cost );

        return maintenanceLogResponseDTO;
    }

    @Override
    public MaintenanceLog toEntity(MaintenanceLogRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        MaintenanceLog.MaintenanceLogBuilder maintenanceLog = MaintenanceLog.builder();

        maintenanceLog.cost( request.cost() );
        maintenanceLog.description( request.description() );
        maintenanceLog.endTime( request.endTime() );
        maintenanceLog.maintenanceType( request.maintenanceType() );
        maintenanceLog.performedByUserId( request.performedByUserId() );
        maintenanceLog.spacecraftId( request.spacecraftId() );
        maintenanceLog.startTime( request.startTime() );
        maintenanceLog.supervisedByUserId( request.supervisedByUserId() );

        maintenanceLog.status( request.status() != null ? request.status() : org.orbitalLogistic.maintenance.entities.enums.MaintenanceStatus.SCHEDULED );

        return maintenanceLog.build();
    }
}
