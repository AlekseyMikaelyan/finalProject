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
@Table(name = "engine_types")
public class EngineType {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type", nullable = false, length = 30)
    private String type;

    @Column(name = "engine_capacity", nullable = false, length = 30)
    private String engineCapacity;

    @OneToMany(mappedBy = "engineType")
    private Set<Car> cars;

    public EngineType(Long id, String type, String engineCapacity) {
        this.id = id;
        this.type = type;
        this.engineCapacity = engineCapacity;
    }
}
