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

    private String name;

    private String nickname;


    private String password;

    private double balance;

}
