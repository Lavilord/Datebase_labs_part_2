package ua.lviv.iot.model.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
import java.time.LocalDate;

@Entity
@Table(name = "bank_account")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BankAccount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "money_amount", nullable = false)
    private Float moneyAmount;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "client_id", nullable = false)
    private Integer clientID;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount bankAccount= (BankAccount) o;
        return id != null && Objects.equals(id,bankAccount.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
