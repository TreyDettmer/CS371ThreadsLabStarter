package edu.up.cs301threadslab;

import java.util.Random;

public class StarChanger extends Thread {
    StarAnimation starAnimation;
    Random rand;

    public StarChanger(StarAnimation animation)
    {
        starAnimation = animation;
        rand = new Random();
    }


    @Override
    public void run() {
        super.run();
        while (true)
        {
            try
            {
                Thread.sleep(2);
            }
            catch (InterruptedException ex)
            {

            }
            int choice = rand.nextInt(2);
            if (choice == 0)
            {
                starAnimation.addStar();
            }
            else
            {
                starAnimation.removeStar();
            }

        }
    }
}


