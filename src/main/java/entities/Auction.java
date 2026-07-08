package entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36, columnDefinition = "VARCHAR(36)")
    private UUID id;

    @NotBlank(message= "Necesitas digitar una descripción")
    @Size(min= 3, max= 250)
    private  String description;

    @NotNull
    private ArrayList<User> lUser;

    @NotNull
    private  ArrayList<Bid> lBid;

    @OneToOne
    private Product product;

    @NotNull
    @ManyToOne
    private  User Awardee;

    @NotNull
    private LocalDateTime finalDate;
}
