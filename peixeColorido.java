// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class peixeColorido extends Actor
{

    /**
     * Act - do whatever the peixeColorido wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (isAtEdge()) {
            MyWorld w = (MyWorld)getWorld();
            w.peixeColorido = w.peixeColorido + 1;
            w.removeObject(this);
        }
    }
}
