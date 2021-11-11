/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab13;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 000728303
 */
public class InputFontTest{

    @Test
    public void testPrint1 () {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Font font = new InputFont("Wing Dings", 25);
        font.print();
        assertEquals("Wing Dings 25 ", out.toString());
    }
    
    @Test
    public void testPrint2 () {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Font font = new Bold(new InputFont("Times New Romen", 12));
        font.print();
        assertEquals("Times New Romen 12 Bold ", out.toString());
    }
    
    @Test
    public void testPrint3 () {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Font font = new Underline(new Strikethrough(new InputFont("Calibri" ,11)));
        font.print();
        assertEquals("Calibri 11 Strikethrough Underline ", out.toString());
    }
    
    @Test
    public void testPrint4 () {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Font font = new Bold(new Italic(new Underline(new InputFont("Arial", 100))));
        font.print();
        assertEquals("Arial 100 Underline Italic Bold ", out.toString());
    }
    
    @Test
    public void testPrint5 () {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Font font = new Italic(new Bold(new Strikethrough(new Underline(new InputFont("Freehand", 15)))));
        font.print();
        assertEquals("Freehand 15 Underline Strikethrough Bold Italic ", out.toString());
    }
}
