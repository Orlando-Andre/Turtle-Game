// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class arraia extends Actor
{
    public GifImage arraia =  new GifImage("Arraia.gif");

    /**
     * Act - do whatever the arraia wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(arraia.getCurrentImage());
        move(-2);
        if (isAtEdge()) {
            MyWorld w = (MyWorld)getWorld();
            w.arraia = w.arraia + 1;
            w.removeObject(this);
        }
    }
}
