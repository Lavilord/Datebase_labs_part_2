package ua.lviv.iot.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "bank_account_id", nullable = false)
    private Integer bankAccountID;

    @Column(name = "transfer_amount", nullable = false)
    private Float transferAmount;

    @Column(name = "commission", nullable = false)
    private Float commission;

    @Column(name = "item_id", nullable = false)
    private Integer itemID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction transaction= (Transaction) o;
        return id != null && Objects.equals(id,transaction.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
