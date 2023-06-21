package dio.webapi.controller;

import dio.webapi.model.UserModel;
import dio.webapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<UserModel> getUtilizadores() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{username}")
    public UserModel getOneUserByUserName(@PathVariable("username") String username) {
        return userRepository.findByUserName("hidelgio");
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {

        userRepository.deleteById(id);
    }

    @PostMapping("/users")
    public void postUser(@RequestBody UserModel user) {
        userRepository.save(user);
    }

    @PutMapping("/users")
    public void putUser(@RequestBody UserModel user) {
        userRepository.save(user);
    }

}
