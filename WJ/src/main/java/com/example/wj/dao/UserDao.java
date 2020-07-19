package com.example.wj.dao;

import com.example.wj.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Enzo Cotter on 2020/6/28.
 */
public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
