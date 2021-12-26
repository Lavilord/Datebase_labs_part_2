package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.TransactionDTO;
import ua.lviv.iot.domain.Transaction;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class TransactionMapper implements AbstractMapper<Transaction, TransactionDTO> {
    @Override
    public TransactionDTO map(Transaction transaction){
        return TransactionDTO.builder()
                .id(transaction.getId())
                .bankAccountId(transaction.getBankAccount().getId())
                .commission(transaction.getCommission())
                .itemId(transaction.getItem().getId())
                .transferAmount(transaction.getTransferAmount())
                .build();
    }
}
