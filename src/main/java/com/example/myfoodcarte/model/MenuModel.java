package com.example.myfoodcarte.model;

import com.example.myfoodcarte.dto.MenuDto;
import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="menu")
@ToString
public class MenuModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="menu_name")
    private String menu_name;
    @Column(name="menu_type")
    private String menu_type;
    @Column(name="starts_on")
    private Time starts_on;
    @Column(name="ends_on")
    private Time ends_on;
    @Column(name="price")
    private float price;

    public static MenuModel convertDtoToDao(MenuDto menuDto){
        MenuModel menuModel = new MenuModel();
        menuModel.setMenu_name(menuDto.getMenu_name());
        menuModel.setMenu_type(menuDto.getMenu_type());
        menuModel.setStarts_on(menuDto.getStarts_on());
        menuModel.setEnds_on(menuDto.getEnds_on());
        menuModel.setPrice(menuModel.getPrice());

        return menuModel;

    }

}
