package org.orbitalLogistic.mission.mappers;

import javax.annotation.processing.Generated;
import org.orbitalLogistic.mission.dto.request.SpacecraftMissionRequestDTO;
import org.orbitalLogistic.mission.dto.response.SpacecraftMissionResponseDTO;
import org.orbitalLogistic.mission.entities.SpacecraftMission;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:13:16+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class SpacecraftMissionMapperImpl implements SpacecraftMissionMapper {

    @Override
    public SpacecraftMissionResponseDTO toResponseDTO(SpacecraftMission spacecraftMission, String spacecraftName, String missionName) {
        if ( spacecraftMission == null && spacecraftName == null && missionName == null ) {
            return null;
        }

        Long id = null;
        Long spacecraftId = null;
        Long missionId = null;
        if ( spacecraftMission != null ) {
            id = spacecraftMission.getId();
            spacecraftId = spacecraftMission.getSpacecraftId();
            missionId = spacecraftMission.getMissionId();
        }
        String spacecraftName1 = null;
        spacecraftName1 = spacecraftName;
        String missionName1 = null;
        missionName1 = missionName;

        SpacecraftMissionResponseDTO spacecraftMissionResponseDTO = new SpacecraftMissionResponseDTO( id, spacecraftId, spacecraftName1, missionId, missionName1 );

        return spacecraftMissionResponseDTO;
    }

    @Override
    public SpacecraftMission toEntity(SpacecraftMissionRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        SpacecraftMission.SpacecraftMissionBuilder spacecraftMission = SpacecraftMission.builder();

        spacecraftMission.missionId( request.missionId() );
        spacecraftMission.spacecraftId( request.spacecraftId() );

        return spacecraftMission.build();
    }
}
