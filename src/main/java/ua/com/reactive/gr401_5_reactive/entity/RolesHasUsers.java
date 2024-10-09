package ua.com.reactive.gr401_5_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "roles_has_users")
public class RolesHasUsers {

    @Id
    private Long id;

    private Long role_id;
    private Long user_id;

}
