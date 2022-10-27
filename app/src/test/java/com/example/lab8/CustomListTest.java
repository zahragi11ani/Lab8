package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    void testHasCities() {
        list = MockCityList();
        City city = new City("Vancouver", "BC");
        list.add(city);
        assertTrue(list.hasCity(city));
        City city2 = new City("Victoria", "BC");
        assertFalse(list.hasCity(city2));
    }}

   /* @Test
    void testDelete() {
        list = MockCityList();
        City city = new City("Calgary", "Alberta");
        list.add(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
        assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(city);
        });
    }

    @Test
    void testCountCities() {
        list = MockCityList();
        Assert.assertEquals(list.getCount(), list.countCities());
    }
}
*/