package com.example.myfoodcarte.repository;

import com.example.myfoodcarte.model.MenuModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuModel, Integer> {

}
