package edu.up.cs301threadslab;

public class AnimationThreadClass extends Thread {
    AnimationView animationView;
    public AnimationThreadClass(AnimationView view)
    {
        animationView = view;
    }

    @Override
    public void run() {
        super.run();
        while (true)
        {
            animationView.postInvalidate();
            try
            {
                Thread.sleep(50);
            }
            catch (InterruptedException ex)
            {

            }
        }
    }
}
