package src.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import src.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User , Long>{
    User findUserByUserName(String username);
}
