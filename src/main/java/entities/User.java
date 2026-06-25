package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private UUID id;



    //@NotBlank(message= "Necesitas digitar un nombre")
    //@Size(min= 3, max= 20)
    private String name;

    //@NotBlank(message= "Necesitas digitar un usuario")
    //@Size(min= 3, max= 20)
    private String nickname;


   //@NotBlank(message= "!Necesitas una contraseña¡")
    //@Size(min= 8, max= 20)
    private String password;

    //@PositiveOrZero
    private double balance;

}
