
package com.mycompany.lab13;

/**
 *
 * @author 000728303
 */
public class Strikethrough extends Decorator{
    
    public Strikethrough(Font font){
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.print("Strikethrough ");
    }
    
}
