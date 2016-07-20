package simDuck;

import simDuck.FlyBehavior.FlyBehavior;
import simDuck.FlyBehavior.FlyWithWings;
import simDuck.QuackBehavior.Quack;

/**
 * Created by loso on 2016/7/19.
 */
public class MallardDuck extends Duck
{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

