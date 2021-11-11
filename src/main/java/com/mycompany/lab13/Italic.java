package com.mycompany.lab13;

/**
 *
 * @author 000728303
 */
public class Italic extends Decorator {

    public Italic(Font font) {
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.print("Italic ");
    }

}
