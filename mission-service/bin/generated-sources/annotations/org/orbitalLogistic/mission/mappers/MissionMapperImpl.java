package org.orbitalLogistic.mission.mappers;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.mission.dto.request.MissionRequestDTO;
import org.orbitalLogistic.mission.dto.response.MissionResponseDTO;
import org.orbitalLogistic.mission.entities.Mission;
import org.orbitalLogistic.mission.entities.enums.MissionPriority;
import org.orbitalLogistic.mission.entities.enums.MissionStatus;
import org.orbitalLogistic.mission.entities.enums.MissionType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:13:16+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class MissionMapperImpl implements MissionMapper {

    @Override
    public MissionResponseDTO toResponseDTO(Mission mission, String commanderName, String spacecraftName, Integer assignedCrewCount) {
        if ( mission == null && commanderName == null && spacecraftName == null && assignedCrewCount == null ) {
            return null;
        }

        Long id = null;
        String missionCode = null;
        String missionName = null;
        MissionType missionType = null;
        MissionStatus status = null;
        MissionPriority priority = null;
        Long commandingOfficerId = null;
        Long spacecraftId = null;
        LocalDateTime scheduledDeparture = null;
        LocalDateTime scheduledArrival = null;
        if ( mission != null ) {
            id = mission.getId();
            missionCode = mission.getMissionCode();
            missionName = mission.getMissionName();
            missionType = mission.getMissionType();
            status = mission.getStatus();
            priority = mission.getPriority();
            commandingOfficerId = mission.getCommandingOfficerId();
            spacecraftId = mission.getSpacecraftId();
            scheduledDeparture = mission.getScheduledDeparture();
            scheduledArrival = mission.getScheduledArrival();
        }
        String commanderName1 = null;
        commanderName1 = commanderName;
        String spacecraftName1 = null;
        spacecraftName1 = spacecraftName;
        Integer assignedCrewCount1 = null;
        assignedCrewCount1 = assignedCrewCount;

        MissionResponseDTO missionResponseDTO = new MissionResponseDTO( id, missionCode, missionName, missionType, status, priority, commandingOfficerId, commanderName1, spacecraftId, spacecraftName1, scheduledDeparture, scheduledArrival, assignedCrewCount1 );

        return missionResponseDTO;
    }

    @Override
    public Mission toEntity(MissionRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        Mission.MissionBuilder mission = Mission.builder();

        mission.commandingOfficerId( request.commandingOfficerId() );
        mission.missionCode( request.missionCode() );
        mission.missionName( request.missionName() );
        mission.missionType( request.missionType() );
        mission.priority( request.priority() );
        mission.scheduledArrival( request.scheduledArrival() );
        mission.scheduledDeparture( request.scheduledDeparture() );
        mission.spacecraftId( request.spacecraftId() );

        mission.status( MissionStatus.PLANNING );

        return mission.build();
    }
}
