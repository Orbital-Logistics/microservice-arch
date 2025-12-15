package org.orbitalLogistic.inventory.mappers;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.orbitalLogistic.inventory.dto.request.InventoryTransactionRequestDTO;
import org.orbitalLogistic.inventory.dto.response.InventoryTransactionResponseDTO;
import org.orbitalLogistic.inventory.entities.InventoryTransaction;
import org.orbitalLogistic.inventory.entities.enums.TransactionType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-10T20:13:07+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class InventoryTransactionMapperImpl implements InventoryTransactionMapper {

    @Override
    public InventoryTransactionResponseDTO toResponseDTO(InventoryTransaction transaction, String cargoName, String fromStorageUnitCode, String toStorageUnitCode, String fromSpacecraftName, String toSpacecraftName, String performedByUserName) {
        if ( transaction == null && cargoName == null && fromStorageUnitCode == null && toStorageUnitCode == null && fromSpacecraftName == null && toSpacecraftName == null && performedByUserName == null ) {
            return null;
        }

        Long id = null;
        TransactionType transactionType = null;
        Long cargoId = null;
        Integer quantity = null;
        Long fromStorageUnitId = null;
        Long toStorageUnitId = null;
        Long fromSpacecraftId = null;
        Long toSpacecraftId = null;
        Long performedByUserId = null;
        LocalDateTime transactionDate = null;
        String reasonCode = null;
        String referenceNumber = null;
        String notes = null;
        if ( transaction != null ) {
            id = transaction.getId();
            transactionType = transaction.getTransactionType();
            cargoId = transaction.getCargoId();
            quantity = transaction.getQuantity();
            fromStorageUnitId = transaction.getFromStorageUnitId();
            toStorageUnitId = transaction.getToStorageUnitId();
            fromSpacecraftId = transaction.getFromSpacecraftId();
            toSpacecraftId = transaction.getToSpacecraftId();
            performedByUserId = transaction.getPerformedByUserId();
            transactionDate = transaction.getTransactionDate();
            reasonCode = transaction.getReasonCode();
            referenceNumber = transaction.getReferenceNumber();
            notes = transaction.getNotes();
        }
        String cargoName1 = null;
        cargoName1 = cargoName;
        String fromStorageUnitCode1 = null;
        fromStorageUnitCode1 = fromStorageUnitCode;
        String toStorageUnitCode1 = null;
        toStorageUnitCode1 = toStorageUnitCode;
        String fromSpacecraftName1 = null;
        fromSpacecraftName1 = fromSpacecraftName;
        String toSpacecraftName1 = null;
        toSpacecraftName1 = toSpacecraftName;
        String performedByUserName1 = null;
        performedByUserName1 = performedByUserName;

        InventoryTransactionResponseDTO inventoryTransactionResponseDTO = new InventoryTransactionResponseDTO( id, transactionType, cargoId, cargoName1, quantity, fromStorageUnitId, fromStorageUnitCode1, toStorageUnitId, toStorageUnitCode1, fromSpacecraftId, fromSpacecraftName1, toSpacecraftId, toSpacecraftName1, performedByUserId, performedByUserName1, transactionDate, reasonCode, referenceNumber, notes );

        return inventoryTransactionResponseDTO;
    }

    @Override
    public InventoryTransaction toEntity(InventoryTransactionRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        InventoryTransaction.InventoryTransactionBuilder inventoryTransaction = InventoryTransaction.builder();

        inventoryTransaction.cargoId( request.cargoId() );
        inventoryTransaction.fromSpacecraftId( request.fromSpacecraftId() );
        inventoryTransaction.fromStorageUnitId( request.fromStorageUnitId() );
        inventoryTransaction.notes( request.notes() );
        inventoryTransaction.performedByUserId( request.performedByUserId() );
        inventoryTransaction.quantity( request.quantity() );
        inventoryTransaction.reasonCode( request.reasonCode() );
        inventoryTransaction.referenceNumber( request.referenceNumber() );
        inventoryTransaction.toSpacecraftId( request.toSpacecraftId() );
        inventoryTransaction.toStorageUnitId( request.toStorageUnitId() );
        inventoryTransaction.transactionDate( request.transactionDate() );
        inventoryTransaction.transactionType( request.transactionType() );

        return inventoryTransaction.build();
    }
}
