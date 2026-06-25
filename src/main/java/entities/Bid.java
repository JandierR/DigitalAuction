package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36, columnDefinition = "VARCHAR(36)")
    private UUID id;

    @PositiveOrZero
    @NotNull
    @Column(length = 6)
    private double value;

    @ManyToOne
    @NotNull
    private User user;

}
