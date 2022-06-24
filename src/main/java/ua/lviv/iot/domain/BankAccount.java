package ua.lviv.iot.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "bank_account")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class BankAccount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "money_amount", nullable = false)
    private Float moneyAmount;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
    private Client client;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @OneToMany(mappedBy = "bankAccount", fetch = FetchType.LAZY)
    private Set<Transaction> transactions;

    @Override
    public String toString() {
        return "Bank Account{" +
                "id=" + id +
                ", money amount='" + moneyAmount + '\'' +
                ", creation date=" + creationDate +
                ", client=" + client.getId() +
                ", account number=" + accountNumber +
                '}';
    }

}
