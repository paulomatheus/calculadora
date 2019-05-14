/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorahexadecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulomatheusdearaujosilva
 */
public class OperacoesTest {
    
    public OperacoesTest() {
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
     * Test of adicao method, of class Operacoes.
     */
    @Test
    public void testAdicao() {
        System.out.println("adicao");
        int a = 0;
        Operacoes instance = new Operacoes();
        int expResult = 0;
        int result = instance.adicao(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtracao method, of class Operacoes.
     */
    @Test
    public void testSubtracao() {
        System.out.println("subtracao");
        int b = 0;
        Operacoes instance = new Operacoes();
        int expResult = 0;
        int result = instance.subtracao(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divisao method, of class Operacoes.
     */
    @Test
    public void testDivisao() {
        System.out.println("divisao");
        int a = 0;
        int b = 0;
        Operacoes instance = new Operacoes();
        instance.divisao(a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacao method, of class Operacoes.
     */
    @Test
    public void testMultiplicacao() {
        System.out.println("multiplicacao");
        int a = 0;
        int b = 0;
        Operacoes instance = new Operacoes();
        instance.multiplicacao(a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resposta method, of class Operacoes.
     */
    @Test
    public void testResposta() {
        System.out.println("resposta");
        Operacoes instance = new Operacoes();
        instance.resposta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Operacoes.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Operacoes instance = new Operacoes();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
