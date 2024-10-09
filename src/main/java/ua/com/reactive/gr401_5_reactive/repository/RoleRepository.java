package ua.com.reactive.gr401_5_reactive.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr401_5_reactive.entity.Role;

public interface RoleRepository extends ReactiveCrudRepository<Role, Long> {

    @Query("SELECT * FROM roles WHERE id =:id")
    Mono<Role> findById(Long id);

//    Mono<Role> findById(Long id);

    @Query("SELECT rs.id, rs.name "+
    "FROM roles rs "+
    "JOIN roles_has_users rhu ON rs.id = rhu.role_id "+
    "JOIN users u ON rhu.user_id = u.id "+
    "WHERE u.id =:idd")
    Flux<Role> findByUserId(Long idd);


}
