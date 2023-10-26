package com.celestial.mocking_explored;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class DataLoaderTest {

    @Test
    void loadData() {

        //arrange
        TextFileLoader tfl = new TextFileLoader();
        String fname = "C:\\tmp\\KeyboardHandler.java.txt";
        DataLoader dl = new DataLoader(tfl);
        int expectedResult = 1311;

        //act
        long noOfChars = dl.loadData(fname);

        //assert
        assertEquals(expectedResult, noOfChars);

    }

    @Test
    public void how_mocks_work(){
        // arrange
        ArrayList<String> names = new ArrayList<>();
        names.add("Dully");
        names.add("Bob");
        names.add("Johnny");
        int expectedResult = 3;

        //act

        int actualResult = names.size();

        //assert

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void how_mocks_work_with_mockito(){
        // arrange
        ArrayList<String> names = mock(ArrayList.class);
        names.add("Dully");
        names.add("Bob");
        names.add("Johnny");
        int expectedResult = 3;
        when(names.size()).thenReturn(3);
        //act

        int actualResult = names.size();

        //assert

        assertEquals(expectedResult,actualResult);
    }
}