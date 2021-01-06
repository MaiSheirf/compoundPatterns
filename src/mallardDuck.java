import java.util.Observable;
import java.util.Observer;

public class mallardDuck implements quackable {
    observe observable;
    public mallardDuck(){
        observable = new observe(this);
    }
    @Override
    public void quack() {
        System.out.println("quack");
        notfyObservar();
    }

    @Override
    public void registerObserver(observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notfyObservar() {
        observable.notfyObservar();
    }
}
