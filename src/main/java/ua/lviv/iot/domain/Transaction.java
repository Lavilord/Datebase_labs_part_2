package ua.lviv.iot.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "bank_account_id", referencedColumnName = "id", nullable = false)
    private BankAccount bankAccount;

    @Column(name = "transfer_amount", nullable = false)
    private Float transferAmount;

    @Column(name = "commission", nullable = false)
    private Float commission;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
    private Item item;


    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", bank account ='" + bankAccount + '\'' +
                ", transfer amount=" + transferAmount +
                ", commission ='" + commission + '\'' +
                ", item ='" + item + '\'' +
                '}';
    }
}
