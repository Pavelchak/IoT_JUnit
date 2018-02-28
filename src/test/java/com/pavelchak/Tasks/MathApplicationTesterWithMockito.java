package com.pavelchak.Tasks;

import org.junit.jupiter.api.*;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// @RunWith attaches a runner with the test class to initialize the test data
//@RunWith(JUnitPlatform.class)
public class MathApplicationTesterWithMockito {

    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;

    @Test
    public void testAdd() {
        //add the behavior of calc service to add two numbers
        when(calcService.add(10.0, 20.0)).thenReturn(30.00);

        //test the add functionality
       assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
    }

    @Test
    public void testMultiply() {
        CalculatorService serv = Mockito.mock(CalculatorService.class);
        MathApplication mathApp = new MathApplication(serv);

        //add the behavior of calc service to add two numbers
        when(serv.multiply(2, 5)).thenReturn(10.0);

        assertEquals(mathApp.multiply(2, 5), 10.0, 0);
    }

    @Test
    public void testSubtract(){
        //add the behavior of calc service to add two numbers
        when(calcService.subtract(30.0,10.0)).thenReturn(20.00);

        //test the add functionality
        assertEquals(mathApplication.subtract(30.0, 10.0),20.0,0);

        //verify the behavior
        verify(calcService).subtract(30.0, 10.0);
    }
}
