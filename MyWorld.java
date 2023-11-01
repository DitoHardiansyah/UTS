import greenfoot.*; 

public class MyWorld extends World
{
    public boolean GAMEOVER=false;
    private int mscore=0;
    private Score score;
    public MyWorld()
    {    
        super(600, 400, 1,false); 

        Kepala kepala=new Kepala();
        addObject(kepala,100,200);

        Ular ular=new Ular();
        addObject(ular,kepala.getX()-Ular.delta,kepala.getY());
        ular.ular=kepala;

        addMakanan();

        score=new Score();
        score.setScore(mscore);
        addObject(score,getWidth()-50,25);
        prepare();
    }

    public void addMakanan()
    {
        addObject(new Makanan(),Greenfoot.getRandomNumber(getWidth()/Ular.delta)*Ular.delta,Greenfoot.getRandomNumber(getHeight()/Ular.delta)*Ular.delta);
    }

    public void setScore(int a)
    {
        mscore+=a;
        score.setScore(mscore);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Border border = new Border();
        addObject(border,84,63);
        Border border2 = new Border();
        addObject(border2,84,328);
        Border border3 = new Border();
        addObject(border3,319,107);
        Border border4 = new Border();
        addObject(border4,483,368);
        Border border5 = new Border();
        addObject(border5,443,210);
        Border border6 = new Border();
        addObject(border6,487,38);
        Border border7 = new Border();
        addObject(border7,283,280);
        border5.setLocation(491,205);
        border3.setLocation(311,92);
        border7.setLocation(322,292);
        border4.setLocation(546,346);
        border6.setLocation(516,58);
    }
}
