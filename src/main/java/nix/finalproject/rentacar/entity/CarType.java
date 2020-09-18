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
@Table(name = "car_types")
public class CarType {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "body_type", nullable = false, length = 30)
    private String bodyType;

    @OneToMany(mappedBy = "carType")
    private Set<Car> cars;

    public CarType(Long id, String bodyType) {
        this.id = id;
        this.bodyType = bodyType;
    }
}
