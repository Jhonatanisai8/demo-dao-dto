package com.isai.demo_dao_dto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isai.demo_dao_dto.dto.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {

    // listamos los usuarios
    public ResponseEntity<List<UserDto>> listUsers() {
        return null;
    }

    // obtenemos un usuario
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return null;
    }

    // creamos un usuario
    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return null;
    }

    // actualizamos un usuario
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserDto userDto) {
        return null;
    }

    // eliminamos un usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<UserDto> deleteUser(@PathVariable Long id) {
        return null;
    }
}
