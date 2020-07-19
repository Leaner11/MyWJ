package com.example.wj.dao;

import com.example.wj.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryDao extends JpaRepository<Category, Integer> {

}
