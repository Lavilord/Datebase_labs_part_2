package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.BankAccountDTO;
import ua.lviv.iot.domain.BankAccount;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class BankAccountMapper implements AbstractMapper<BankAccount, BankAccountDTO> {
    @Override
    public BankAccountDTO map(BankAccount bankAccount){
        return BankAccountDTO.builder()
                .id(bankAccount.getId())
                .accountNumber(bankAccount.getAccountNumber())
                .clientId(bankAccount.getClient().getId())
                .creationDate(bankAccount.getCreationDate())
                .moneyAmount(bankAccount.getMoneyAmount())
                .build();
    }
}

