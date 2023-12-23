package ma.imadfaouzi.devoir.repositories;


import ma.imadfaouzi.devoir.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
//    User findUserByDate_Naissance(String date_Naissance);
}
