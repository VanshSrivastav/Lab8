package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import kotlin.random.FallbackThreadLocalRandom;

public class CustomListTest {
    private CustomList list;
/**
 * create a mocklist for my citylist
 * @return
 */

public CustomList MockCityList(){
    list = new CustomList(null,new ArrayList<>());
    return list;
}

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Los Santos", "CA");
        list.addCity(city);
        assertEquals(list.hasCity(city), true);
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Spokane", "WA");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(list.hasCity(city), false);


    }

    @Test
    public void countCityTest(){
        list = MockCityList();
        City city = new City("Scranton", "PA");
        list.addCity(city);
        assertEquals(list.getCount(), 1);
    }


}