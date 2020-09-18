package nix.finalproject.rentacar.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_name", nullable = false, length = 30)
    private String brandName;

    @OneToMany(mappedBy = "brand")
    private Set<Car> cars;

    public Brand(Long id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }
}
