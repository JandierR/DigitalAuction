package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36, columnDefinition = "VARCHAR(36)")
    private UUID id;


    @NotBlank(message= "Necesitas digitar un nombre")
    @Size(min= 3, max= 20)
    private String name;

    @NotBlank(message= "Necesitas digitar un usuario")
    @Size(min= 3, max= 20)
    private String nickname;


   @NotBlank(message= "!Necesitas una contraseña¡")
    @Size(min= 8, max= 20)
    private String password;

    @PositiveOrZero
    @NotNull
    @Column(length = 6)
    private double balance;

}
