package com.online.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.shopping.model.UserData;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserData, String> {

}
