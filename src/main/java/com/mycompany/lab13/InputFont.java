
package com.mycompany.lab13;

/**
 *
 * @author 000728303
 */
public class InputFont implements Font{
    
    private final String name;
    private final int size;

    public InputFont(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void print() {
         System.out.print(name + " " + size + " ");
    }
    
    
}
