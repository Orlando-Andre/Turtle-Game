// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class peixeDourado extends Actor
{

    /**
     * Act - do whatever the peixeDourado wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-3);
        if (isAtEdge()) {
            MyWorld w = (MyWorld)getWorld();
            w.peixeDourado = w.peixeDourado + 1;
            w.removeObject(this);
        }
    }
}
