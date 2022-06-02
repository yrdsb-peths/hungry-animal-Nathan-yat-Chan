import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * the world i play in
 * 
 * @author (nathan) 
 * @version (may 25)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Alligator alligator = new Alligator();
        addObject(alligator, 300, 350);
        
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 20, 20);
        
        createBanana();
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void createBanana()
    {
        Banana banana = new Banana();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, x, y);
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
