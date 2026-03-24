package com.mycompany.davidcarreroreal_prueba_ud4.ed;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * @author Ana González
 */
public class conversorTest {
    
    public conversorTest() {
    }
    /**
     * Test of main method, of class conversor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] argumentos = null;
        conversor.main(argumentos);
    }

    /**
     * Test of celsiusAFahrenheit method, of class conversor.
     */
    @Test
    public void testCelsiusAFahrenheit() {
        System.out.println("celsiusAFahrenheit");
        float celsius = 0.0f;
        float expResult = 32.0f;
        float result = conversor.celsiusAFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of fahrenheitACelsius method, of class conversor.
     */
    @Test
    public void testFahrenheitACelsius() {
        System.out.println("fahrenheitACelsius");
        float fahrenheit = 0.0f;
        float expResult = -17.777779f;
        float result = conversor.fahrenheitACelsius(fahrenheit);
        assertEquals(expResult, result, 0.0);

    }
    
}