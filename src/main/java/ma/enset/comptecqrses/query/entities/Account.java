package ma.enset.comptecqrses.query.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.comptecqrses.commonapi.enums.AccountStatus;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Account {
    @Id
    private String id;
    private double balance;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private String currency;
    @OneToMany(mappedBy = "account")
    private Collection<Operation> operations;

}
