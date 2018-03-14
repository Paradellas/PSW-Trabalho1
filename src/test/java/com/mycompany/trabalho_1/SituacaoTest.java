/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paradellas
 */
public class SituacaoTest {
    
    /**
     * Teste para verificar reprovação pela frequência.
     */
    @Test
    public void testNotaFinal() {
        System.out.println("notaFinal");
        float Frequência = 74.9F;
        float M1 = 10F;
        float PF = 0F;
        Situacao instance = new Situacao();
        String expResult = "Reprovado";
        String result = instance.notaFinal(Frequência, M1, PF);
        assertEquals(expResult, result);
        
    }
    /**
     * Teste para verificar aprovação na media normal.
     */
    @Test
    public void testNotaFinal1() {
        System.out.println("notaFinal");
        float Frequência = 75;
        float M1 = 7F;
        float PF = 0F;
        Situacao instance = new Situacao();
        String expResult = "Aprovado";
        String result = instance.notaFinal(Frequência, M1, PF);
        assertEquals(expResult, result);
        
    }
    /**
     * Teste para verificar aprovação na media final.
     */
    @Test
    public void testNotaFinal2() {
        System.out.println("notaFinal");
        float Frequência = 75F;
        float M1 = 6F;
        float PF = 4F;
        Situacao instance = new Situacao();
        String expResult = "Aprovado";
        String result = instance.notaFinal(Frequência, M1, PF);
        assertEquals(expResult, result);
        
    }
    /**
     * Teste para verificar reprovação pela media normal.
     */
    @Test
    public void testNotaFinal4() {
        System.out.println("notaFinal");
        float Frequência = 75F;
        float M1 = 2.9F;
        float PF = 0.0F;
        Situacao instance = new Situacao();
        String expResult = "Reprovado";
        String result = instance.notaFinal(Frequência, M1, PF);
        assertEquals(expResult, result);
        
    }
    /**
     * Teste para verificar reprovação pela media final.
     */
    @Test
    public void testNotaFinal5() {
        System.out.println("notaFinal");
        float Frequência = 75F;
        float M1 = 5F;
        float PF = 2F;
        Situacao instance = new Situacao();
        String expResult = "Reprovado";
        String result = instance.notaFinal(Frequência, M1, PF);
        assertEquals(expResult, result);
        
    }
}