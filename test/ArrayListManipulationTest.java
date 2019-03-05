package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class ArrayListManipulationTest {

    ArrayListManipulation obj;
    @Before
    public void setUp() throws Exception {
        obj = new ArrayListManipulation();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void manipulateList() {
        List<String> list1 = asList("Apple", "Grape", "Melon", "Berry");
        List<String> list2 = asList("Apple", "Grape", "Mango", "Berry");
        assertEquals(list2,obj.manipulateList(list1,"Melon","Mango"));

        List<String> list3 = asList(null,"Apple");
        List<String> list4 = asList("Kiwi","Apple");
        assertEquals(list4,obj.manipulateList(list3,null,"Kiwi"));

        List<String> list5 = asList("Kiwi", "Grape");//element doesn't exist in array
        List<String> list6 = asList("Kiwi", "Grape");
        assertEquals(list6,obj.manipulateList(list5,"Orange","Guava"));

        List<String> list7 = asList("");//arrayString is empty
        List<String> list8 = asList("Kiwi");
        assertEquals(list8,obj.manipulateList(list7,"","Kiwi"));

        List<String> list9 = asList("Apple", "Grape", "Mango", "Berry");
        List<String> list10 = asList(null, "Grape", "Mango", "Berry");//replacingString is null
        assertEquals(list10,obj.manipulateList(list9,"Apple",null));
    }

    @Test
    public void emptyList() {
        List<String> list = new ArrayList<>();

        List<String> list1 = new ArrayList<String>(Arrays.asList(new String[]{"Apple","Grape","Melon","Berry"}));
        assertEquals(list,obj.emptyListNew(list1));

        List<String> list2 = new ArrayList<String>(Arrays.asList(new String[]{"",""}));
        assertEquals(list,obj.emptyListNew(list2));

        List<String> list3 = new ArrayList<String>(Arrays.asList(new String[]{"Apple"}));
        assertEquals(list,obj.emptyListNew(list3));

        List<String> list4 = new ArrayList<String>(Arrays.asList(new String[]{null,null,null}));
        assertEquals(list,obj.emptyListNew(list4));

    }
}
