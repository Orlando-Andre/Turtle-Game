// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class peixeAzul extends Actor
{

    /**
     * Act - do whatever the peixeAzul wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-4);
        if (isAtEdge()) {
            MyWorld w = (MyWorld)getWorld();
            w.peixeAzul = w.peixeAzul + 1;
            w.removeObject(this);
        }
    }
}
