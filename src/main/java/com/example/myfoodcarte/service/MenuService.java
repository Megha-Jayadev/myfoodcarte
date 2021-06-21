package com.example.myfoodcarte.service;

import com.example.myfoodcarte.dto.MenuDto;
import com.example.myfoodcarte.model.MenuModel;
import com.example.myfoodcarte.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    MenuRepository menuRepository;

    public MenuDto createMenu(MenuDto menuDto){
        MenuModel response = menuRepository.save(MenuModel.convertDtoToDao(menuDto));
        MenuDto result = MenuDto.convertDaoToDto(response);
        return result;

    }
}
