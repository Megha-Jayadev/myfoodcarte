package com.example.myfoodcarte.controller;

import com.example.myfoodcarte.dto.MenuDto;
import com.example.myfoodcarte.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("api/v1/")
public class MenuController {

    @Autowired
    MenuService menuService;

    @PostMapping("menuCreate")
    public ResponseEntity<MenuDto> createMenu(@RequestBody MenuDto menuDto){
        MenuDto save = menuService.createMenu(menuDto);
        if(Objects.nonNull(save))
            return new ResponseEntity<>(save, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
