import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Alligator extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            move (5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move (-5);
        }
        eat();
    }
    public void eat()
    {
        if(isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBanana();
            world.increaseScore();
        }
    }   
}

