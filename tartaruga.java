// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class tartaruga extends Actor
{

    /**
     * Act - do whatever the tartaruga wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
    }

    /**
     * 
     */
    public void mover()
    {
        if (Greenfoot.isKeyDown("space")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        MyWorld w = (MyWorld)getWorld();
        if (isTouching(peixeColorido.class)) {
            removeTouching(peixeColorido.class);
            w.peixeColorido = w.peixeColorido + 1;
            w.score = w.score + 1;
        }
        if (isTouching(peixeDourado.class)) {
            removeTouching(peixeDourado.class);
            w.peixeDourado = w.peixeDourado + 1;
            w.score = w.score + 2;
        }
        if (isTouching(peixeAzul.class)) {
            removeTouching(peixeAzul.class);
            w.peixeAzul = w.peixeAzul + 1;
            w.score = w.score + 3;
        }
        if (isTouching(arraia.class) || isTouching(arraiaRapida.class)) {
            w.vidas = w.vidas - 1;
        }
    }
}
