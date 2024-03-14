package jpa;

import User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<User,Long> {
    @Query("SELECT u.userId, u.emailId, u.firstName, u.lastName FROM usrusers u WHERE u.userId = 2926")
    List<Object[]> findUserDetailsById(Long userId);

}
