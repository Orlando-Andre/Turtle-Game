// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    public int arraia = 3;
    public int arraiaRapida = 2;
    public int peixeColorido = 3;
    public int peixeDourado = 2;
    public int peixeAzul = 1;
    public int score = 0;
    public int vidas = 500;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(1200, 675, 1);
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        this.showText("Pontuação: " + score + " \n" + "Vidas: " + vidas, 100, 50);
        if (vidas == 0) {
            this.showText("GAME OVER" + "\n" + "Pontuação: " + score, 600, 300);
            Greenfoot.stop();
        }
        if (arraia > 0) {
            arraia a =  new arraia();
            addObject(a, 1289, Greenfoot.getRandomNumber(670));
            arraia = arraia - 1;
        }
        if (arraiaRapida > 0) {
            arraiaRapida arraiaR =  new arraiaRapida();
            addObject(arraiaR, 1289, Greenfoot.getRandomNumber(670));
            arraiaRapida = arraiaRapida - 1;
        }
        if (peixeColorido > 0) {
            peixeColorido pC =  new peixeColorido();
            addObject(pC, -15, Greenfoot.getRandomNumber(670));
            peixeColorido = peixeColorido - 1;
        }
        if (peixeDourado > 0) {
            peixeDourado pD =  new peixeDourado();
            addObject(pD, 1289, Greenfoot.getRandomNumber(670));
            peixeDourado = peixeDourado - 1;
        }
        if (peixeAzul > 0) {
            peixeAzul pA =  new peixeAzul();
            addObject(pA, 1289, Greenfoot.getRandomNumber(670));
            peixeAzul = peixeAzul - 1;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        tartaruga tartaruga =  new tartaruga();
        addObject(tartaruga, 73, 325);
    }
}
