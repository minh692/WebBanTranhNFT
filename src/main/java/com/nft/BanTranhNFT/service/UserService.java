package com.nft.BanTranhNFT.service;

import com.nft.BanTranhNFT.model.User;

import java.util.List;
import java.util.Optional;
public interface UserService {
    //Ham them User
    public User addUser(User user);

    //Ham chinh sua thong tin User
    public User updateUser(int id, User user);

    //Ham xoa User
    public boolean deleteUser(int id);

    //Ham lay ra danh sach User
    public List<User> getAllUser();

    //Ham lay ra 1 User
    public Optional<User> getOneUser(int id);
}
