// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class arraiaRapida extends Actor
{
    public GifImage arraiaRapida =  new GifImage("Arraia.gif");

    /**
     * Act - do whatever the arraiaRapida wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(arraiaRapida.getCurrentImage());
        move(-3);
        if (isAtEdge()) {
            MyWorld w = (MyWorld)getWorld();
            w.arraiaRapida = w.arraiaRapida + 1;
            w.removeObject(this);
        }
    }
}
