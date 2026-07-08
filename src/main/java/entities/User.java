package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36, columnDefinition = "VARCHAR(36)")
    private UUID id;


    @NotBlank(message = "Enter a name")
    @Size(min = 3, max = 20)
    private String name;

    @NotBlank(message = "Enter a nickname for the User")
    @Size(min = 3, max = 20)
    private String nickname;


    @NotBlank(message = "Enter a password")
    private String passwordHash;

    @PositiveOrZero
    @NotNull
    @Column(precision = 6, scale = 2)
    private BigDecimal balance;

}
