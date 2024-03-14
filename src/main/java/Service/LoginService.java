package Service;

import User.User;
import jpa.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private UserJpaRepository userRepository;

    public List<Object[]> getUserDetailsById(Long userId) {

        return userRepository.findUserDetailsById(userId);
    }
}

