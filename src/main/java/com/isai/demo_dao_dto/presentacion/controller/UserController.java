package com.isai.demo_dao_dto.presentacion.controller;

import java.util.List;

import com.isai.demo_dao_dto.presentacion.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isai.demo_dao_dto.service.interfaces.IUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    // listamos los usuarios
    @GetMapping
    public ResponseEntity<List<UserDto>> listUsers() {
        return new ResponseEntity<>(userService.listUsers(),
                HttpStatus.OK);
    }

    // obtenemos un usuario
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUserById(id),
                HttpStatus.OK);
    }

    // creamos un usuario
    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.createUser(userDto),
                HttpStatus.CREATED);
    }

    // actualizamos un usuario
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.updateUser(id, userDto),
                HttpStatus.CREATED);
    }

    // eliminamos un usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted successfully",
                HttpStatus.NO_CONTENT);
    }
}
