
package com.mycompany.lab13;

/**
 *
 * @author 000728303
 */
public abstract class Decorator implements Font {
    
    protected final Font font;
    
    public Decorator(Font font){
        this.font = font;
    }
}
