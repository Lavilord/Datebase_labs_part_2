package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {
}

