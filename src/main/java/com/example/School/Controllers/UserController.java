package com.example.School.Controllers;
import com.example.School.Entities.User;
import com.example.School.Repositories.UserRepository;
import com.example.School.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class UserController {
    private final UserRepository userRepository;
    private final UserService userService;

    @Autowired
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }
    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody User user) {
        userService.createUser(user);
        return new ResponseEntity<>("User Created", HttpStatus.OK);
        }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody User user, Model model) {
        String username = user.getEmail();
        String password = user.getHashedPassword();

        if(!emailExists(username)){
            return new ResponseEntity<>("Username does not exist", HttpStatus.UNAUTHORIZED);
        }

        String storedPassword = userService.getHashedPasswordByEmail(username);

       boolean passwordExists = userService.verifyPassword(password, storedPassword);

       if(!passwordExists){
           return new ResponseEntity<>("Invalid Password", HttpStatus.UNAUTHORIZED);
       }
       return new ResponseEntity<>("Successful Login", HttpStatus.OK);
    }

    public boolean emailExists(String email) {
        User user = userRepository.findUserByEmail(email);
        if (user == null) {
            return false;
        }
        return true;
    }
}