package com.nft.BanTranhNFT.repository;

import com.nft.BanTranhNFT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
