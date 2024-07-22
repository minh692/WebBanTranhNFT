package com.nft.BanTranhNFT.service.impl;

import com.nft.BanTranhNFT.model.User;
import com.nft.BanTranhNFT.repository.UserRepository;
import com.nft.BanTranhNFT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        if(user != null){
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUser(int id, User user) {
        if(user != null){
            User user1 = userRepository.getById(id);
            if(user1 != null){
                user1.setUserName(user.getUserName());
                user1.setUserPassword(user.getUserPassword());
                user1.setUserEmail(user.getUserPassword());
                user1.setPhone(user.getPhone());
                user1.setRole(user.getRole());
                return userRepository.save(user1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        if(id >=1){
            User user = userRepository.getById(id);
            if(user != null){
                userRepository.delete(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getOneUser(int id) {
        return userRepository.findById(id);
    }
}
