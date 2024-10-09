package ua.com.reactive.gr401_5_reactive.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    private Long id;
    private String name;

    private Set<RolesHasUsers> rolesHasUsersList = new HashSet<>();

    @Override
    public String getAuthority() {
        return name;
    }
}
