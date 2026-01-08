package br.eti.fmarques.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eti.fmarques.course.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping   
    public ResponseEntity<User> findALL() {
        User u = new User(1L, "Fabio Marques", "fmarques@fmarques.eti.br", "99999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}