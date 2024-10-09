package ua.com.reactive.gr401_5_reactive.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import ua.com.reactive.gr401_5_reactive.entity.User;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Long> {

//    Mono<User> findByUsername(String username);

    @Query("SELECT id, username, password FROM users WHERE username = :username")
    Mono<User> findByUsername(String username);

}
