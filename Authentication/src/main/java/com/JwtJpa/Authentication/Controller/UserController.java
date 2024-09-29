package com.JwtJpa.Authentication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JwtJpa.Authentication.Entity.UserEntity;
import com.JwtJpa.Authentication.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return this.userService.addUser(user);
    }

    @GetMapping("/user")
    public List<UserEntity> getAllUser() {
        return this.userService.getAllUser();
    }

    @GetMapping("user/{id}")
    public UserEntity getUserById(@PathVariable("id") Integer id) {
        return this.userService.getUserById(id);
    }

    @PutMapping("/update-user/{id}")
    public String updateUserbyId(@PathVariable("id") Integer id,
                                 @RequestBody String firstName,
                                 @RequestBody String lastName,
                                 @RequestBody String address,
                                 @RequestBody String pincode,
                                 @RequestBody String c_number,
                                 @RequestBody String ref_number) {
        String message = null;
        String s = this.userService.updateUser(id, firstName, lastName, address, pincode, c_number, ref_number);
        if (!s.isEmpty()) {
            message = "Record update successfully  " + s;
        } else {
            message = "Record Not found!! Please check Entered Id....." + id.toString();
        }
        return message;
    }

    @DeleteMapping("delete-user/{id}")
    public String delelteUserById(@PathVariable("id") Integer id) {
        String message = "";
        String s = this.userService.deleteUserById(id);
        message = s;
        return message;
    }



}
