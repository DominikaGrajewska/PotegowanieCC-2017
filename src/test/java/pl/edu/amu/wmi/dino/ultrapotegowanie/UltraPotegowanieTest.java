/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.ultrapotegowanie;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bikol
 */
public class UltraPotegowanieTest {
    
    public UltraPotegowanieTest() {
    }

    // Patryk Zywica
    @Test
    public void testPoteguj() {
        assertEquals("1", UltraPotegowanie.poteguj("1", "1"));
    }
    @Test
    public void testPoteguj2() {
        assertEquals("2", UltraPotegowanie.poteguj("2", "1"));
    }
    @Test
    public void testPoteguj3() {
        Random r = new Random();
        for(int i=0;i<1000;i++){
            int liczba = r.nextInt();
            assertEquals("1", UltraPotegowanie.poteguj(Integer.toString(liczba), "0"));
            
        }
    }
    /////////
    
    // Helena Galazka
    @Test
    public void testPoteguj4() {
        assertEquals("1.5", UltraPotegowanie.poteguj("1.5", "1"));
    }
    
    @Test
     public void testPoteguj5() {
        assertEquals("2.25", UltraPotegowanie.poteguj("1.5", "2"));
    }
     
    @Test
     public void testPoteguj6() {
        assertEquals("0.5", UltraPotegowanie.poteguj("2", "-1"));
    }
     
    /////////

    // Nikodem Pachala
     @Test
     public void testPoteguj20(){
         assertEquals("10000000000", UltraPotegowanie.poteguj("10", "10"));
     }
     
     @Test
     public void testPoteguj21(){
          assertEquals("1", UltraPotegowanie.poteguj("0", "0"));
     }
     
     @Test
     public void testPoteguj22(){
          assertEquals("-1.0", UltraPotegowanie.poteguj("-1", "-1"));
     }

    // Mikolaj Szumigalski testy dla dużych liczb i dla 0
     @Test
    public void testPotegujSzumi1() {
        assertEquals("1000000000000", UltraPotegowanie.poteguj("1000000", "2"));
    }
    
    @Test
     public void testPotegujSzumi2() {
        assertEquals("0.0000000000001", UltraPotegowanie.poteguj("1000000", "-2"));
    }
     
    @Test
     public void testPotegujSzumi3() {
        assertEquals("0", UltraPotegowanie.poteguj("0", "1000"));
       
     /////////
     /**
     * Mieczyslaw Krawiarz
     * 416098
     */
    
    @Test
     public void test0x() {
        assertEquals("16", UltraPotegowanie.poteguj("0x10", "0x1"));
    }
     
     @Test
     public void test0xGen1() {
         Random r = new Random();
         for(int i = 0; i < 100; i++){
             int licz = r.nextInt();
             assertEquals("1", UltraPotegowanie.poteguj(Integer.toString(licz), "0x0"));
         }
    }
     
     @Test
     public void test0xGen2() {
         Random r = new Random();
         for(int i = 0; i < 100; i++){
             int licz = r.nextInt();
             assertEquals("0", UltraPotegowanie.poteguj("0x0", Integer.toString(licz)));
         }
    }
}

