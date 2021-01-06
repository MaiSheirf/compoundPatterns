public class quackCounter implements quackable{
    quackable duck;
    static int numberOfQuacks;
    public quackCounter(quackable duck){
        this.duck=duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
    public static int getQuacks(){
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(observer observer) {

    }

    @Override
    public void notfyObservar() {

    }
}
