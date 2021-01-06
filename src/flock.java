import java.util.ArrayList;
import java.util.Iterator;

public class flock implements quackable{
    ArrayList quackers = new ArrayList();
    public void add(quackable quacker){
        quackers.add(quacker);
    }
    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            quackable quacker = (quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(observer observer) {

    }

    @Override
    public void notfyObservar() {

    }
}
