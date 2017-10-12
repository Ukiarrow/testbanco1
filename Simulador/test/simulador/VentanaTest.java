/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eliana
 */
public class VentanaTest {

    public VentanaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }



    /**
     * Test of segundoMes method, of class Ventana.
     */
    @Test
    public void testSegundoMes() {
        System.out.println("segundoMes");
        String mes1 = "ENERO";
        String mes2 = "ENERO";
        int mes1index = 1;
        int mes2index = 1;
        Ventana instance = new Ventana();
        // TODO review the generated test code and remove the default call to fail.
        boolean expResult = false;
        boolean result = instance.segundoMes(mes1, mes2, mes1index, mes2index);
        try {
            assertEquals(expResult, result);
            System.out.println("··········································");
        } catch (Exception e) {

            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");

        }
    }
/**
     * Test of validarMonto method, of class Ventana.
     */
     @Test
      public void testRenta() {
        System.out.println("Renta");
        String renta = "400000-799999";
        Ventana instance = new Ventana();
        // TODO review the generated test code and remove the default call to fail.
        boolean expResult = true;
        boolean result = instance.renta(renta);
        try {
            assertEquals(expResult, result);
            System.out.println("··········································");
        } catch (Exception e) {

            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");

        }
    }
    /**
     * Test of validarMonto method, of class Ventana.
     */
    @Test
    public void testValidarMonto() {
        System.out.println("validarMonto");
        String valor = "2000000";
        Ventana instance = new Ventana();
        boolean expResult = true;
        boolean result = instance.validarMonto(valor);
        try {
            assertEquals(expResult, result);
            System.out.println("··········································");
        } catch (Exception e) {

            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");

        }
    }

}
