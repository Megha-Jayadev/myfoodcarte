package com.example.myfoodcarte.dto;

import com.example.myfoodcarte.model.MenuModel;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MenuDto {
    private int id;
    private String menu_name;
    private String menu_type;
    private Time starts_on;
    private Time ends_on;
    private float price;

    public static MenuDto convertDaoToDto(MenuModel menuModel){
        return new MenuDto().builder()
                .id(menuModel.getId())
                .menu_name(menuModel.getMenu_name())
                .menu_type(menuModel.getMenu_type())
                .starts_on(menuModel.getStarts_on())
                .ends_on(menuModel.getEnds_on())
                .price(menuModel.getPrice()).build();
    }
}
