package simDuck;

import simDuck.FlyBehavior.FlyBehavior;
import simDuck.FlyBehavior.FlyNoWay;
import simDuck.QuackBehavior.Quack;
import simDuck.QuackBehavior.QuackBehavior;

/**
 * Created by loso on 2016/7/19.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public  Duck(){
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("ALl ducks float,even decoys!");
    }
}

