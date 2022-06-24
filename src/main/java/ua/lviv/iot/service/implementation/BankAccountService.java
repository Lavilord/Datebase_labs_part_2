package ua.lviv.iot.service.implementation;

        import lombok.AllArgsConstructor;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Service;
        import ua.lviv.iot.domain.BankAccount;
        import ua.lviv.iot.repository.BankAccountRepository;
        import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class BankAccountService extends AbstractService<BankAccount> {
    private final BankAccountRepository bankAccountRepository;

    @Override
    public JpaRepository<BankAccount, Integer> getRepository(){
        return bankAccountRepository;
    }
}