package org.orbitalLogistic.mission.mappers;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.mission.dto.request.MissionAssignmentRequestDTO;
import org.orbitalLogistic.mission.dto.response.MissionAssignmentResponseDTO;
import org.orbitalLogistic.mission.entities.MissionAssignment;
import org.orbitalLogistic.mission.entities.enums.AssignmentRole;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:13:16+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class MissionAssignmentMapperImpl implements MissionAssignmentMapper {

    @Override
    public MissionAssignmentResponseDTO toResponseDTO(MissionAssignment assignment, String missionName, String userName) {
        if ( assignment == null && missionName == null && userName == null ) {
            return null;
        }

        Long id = null;
        Long missionId = null;
        Long userId = null;
        LocalDateTime assignedAt = null;
        AssignmentRole assignmentRole = null;
        String responsibilityZone = null;
        if ( assignment != null ) {
            id = assignment.getId();
            missionId = assignment.getMissionId();
            userId = assignment.getUserId();
            assignedAt = assignment.getAssignedAt();
            assignmentRole = assignment.getAssignmentRole();
            responsibilityZone = assignment.getResponsibilityZone();
        }
        String missionName1 = null;
        missionName1 = missionName;
        String userName1 = null;
        userName1 = userName;

        MissionAssignmentResponseDTO missionAssignmentResponseDTO = new MissionAssignmentResponseDTO( id, missionId, missionName1, userId, userName1, assignedAt, assignmentRole, responsibilityZone );

        return missionAssignmentResponseDTO;
    }

    @Override
    public MissionAssignment toEntity(MissionAssignmentRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        MissionAssignment.MissionAssignmentBuilder missionAssignment = MissionAssignment.builder();

        missionAssignment.assignmentRole( request.assignmentRole() );
        missionAssignment.missionId( request.missionId() );
        missionAssignment.responsibilityZone( request.responsibilityZone() );
        missionAssignment.userId( request.userId() );

        missionAssignment.assignedAt( java.time.LocalDateTime.now() );

        return missionAssignment.build();
    }
}
