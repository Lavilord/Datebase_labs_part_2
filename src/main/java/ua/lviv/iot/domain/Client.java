package ua.lviv.iot.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "age")
    private Integer age;

    @Column(name = "passport_number", nullable = false)
    private String passportNumber;

    @Column(name = "zip")
    private String zip;

    @ManyToOne
    @JoinColumn(name = "street_id", referencedColumnName = "id", nullable = false)
    private Street street;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private Set<BankAccount> bankAccounts;



    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last name=" + lastname +
                ", middle name ='" + middleName + '\'' +
                ", age='" + age + '\'' +
                ", passport number='" + passportNumber + '\'' +
                ", zip='" + zip + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
