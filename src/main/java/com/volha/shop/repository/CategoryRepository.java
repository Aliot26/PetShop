package com.volha.shop.repository;

import com.volha.shop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 *Created by olga on 09.05.2021
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}
