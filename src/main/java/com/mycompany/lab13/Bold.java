
package com.mycompany.lab13;

/**
 *
 * @author 000728303
 */
public class Bold extends Decorator{
    
    public Bold(Font font){
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.print("Bold ");
    }
}
