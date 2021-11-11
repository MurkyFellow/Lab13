package com.mycompany.lab13;

/**
 *
 * @author 000728303
 */
public class Underline extends Decorator {

    public Underline(Font font) {
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.print("Underline ");
    }

}
