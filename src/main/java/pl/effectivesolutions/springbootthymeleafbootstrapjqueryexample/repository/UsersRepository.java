package pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.model.User;

/**
 * Created by Tomasz Sokół on 2019-03-20.
 */
public interface UsersRepository extends JpaRepository<User, Long> {
}
