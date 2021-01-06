import java.util.ArrayList;
import java.util.Iterator;

public class observe implements quackOsevable{

    ArrayList observers = new ArrayList();
    quackOsevable duck;
    public observe(quackOsevable duck){
        this.duck=duck;
    }
    @Override
    public void registerObserver(observer observer) {
        observers.add(observer);
    }

    @Override
    public void notfyObservar() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            observer observer = (observer)iterator.next();
            observer.update(duck);
    }
}}
