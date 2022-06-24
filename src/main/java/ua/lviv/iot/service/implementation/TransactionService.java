package ua.lviv.iot.service.implementation;


import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Transaction;
import ua.lviv.iot.repository.TransactionRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class TransactionService extends AbstractService<Transaction> {
    private final TransactionRepository transactionRepository;

    @Override
    public JpaRepository<Transaction,Integer> getRepository(){return transactionRepository;}
}

