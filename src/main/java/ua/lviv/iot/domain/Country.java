package ua.lviv.iot.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "country")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Country {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private Set<City> cities;

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private Set<Item> items;

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
