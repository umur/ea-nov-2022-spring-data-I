package lab3.controller;

import lab3.models.unidirectional.UniUser;
import lab3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<UniUser> getUsers(){
        return new ResponseEntity(this.userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UniUser> getUserById(@PathVariable String id){
        UniUser user = this.userService.getUserById(id);
        if(user != null)
            return new ResponseEntity<>(user, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<String> addUser(UniUser u){
        UniUser user = this.userService.saveUser(u);
        if(user != null)
            return new ResponseEntity<>("successfully added user", HttpStatus.OK);
        else
            return new ResponseEntity<>("unable to add user", HttpStatus.BAD_REQUEST);
    }

    @PutMapping
    public ResponseEntity updateUserById(@RequestBody UniUser u){
        UniUser user = this.userService.saveUser(u);
        if(user != null)
            return new ResponseEntity<>(user, HttpStatus.OK);
        else
            return new ResponseEntity<>("unable to update user", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable String id){
        this.userService.deleteUserById(id);
        return new ResponseEntity<>("user deleted", HttpStatus.OK);
    }
}
