package com.nft.BanTranhNFT.controller;

import com.nft.BanTranhNFT.model.User;
import com.nft.BanTranhNFT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestParam("id") int id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable("id") int id){
        return userService.deleteUser(id);
    }

    @GetMapping("/list")
    public List<User> getListUser(){
        return userService.getAllUser();
    }
}
