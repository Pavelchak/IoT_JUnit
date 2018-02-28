package com.pavelchak.Tasks;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.*;

//@RunWith(Parameterized.class)

public class SampleTestWithRunner {
    private static int count = 0;
//    @Parameterized.Parameter(0)
//    public int value1;
//    @Parameterized.Parameter(1)
//    public int in;
//    @Parameterized.Parameter(2)
//    public int result;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Count beforeClass is : " + count);
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("Count before is : " + count);
    }

    @AfterEach
    public void afterTest() {
        System.out.println("Count after is : " + count);
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("Count AfterClass is : " + count);
    }

//    @Test
//    public void test7AddToValue1() {
//        count++;
//        Sample sample = new Sample("AA");
//        sample.setValue1(value1);
//        int value = sample.addToValue1(in);
//        assertEquals(value, result);
//    }

//    @Parameterized.Parameters
//@ParameterizedTest
//@ValueSource
//    public static Collection<Object[]> getTestData(){
//        return Arrays.asList(new Object[][]{
//                {1,5,6},{2,3,5},{10,20,30},{1,2,5}
//        });
//    }

}
