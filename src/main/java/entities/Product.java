package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36, columnDefinition = "VARCHAR(36)")
    private UUID id;

    @NotBlank(message= "Necesitas digitar un nombre")
    @Size(min= 3, max= 20) @NotNull
    private String name;

    @PositiveOrZero
    @NotNull
    @Column(length = 6)
    private double price;

    @NotBlank(message= "Necesitas digitar el estado del producto")
    @Size(min= 3, max= 40)
    private String state;

    @NotBlank(message= "Necesitas digitar una descripción")
    @Size(min= 3, max= 250)
    private String descrption;

}
