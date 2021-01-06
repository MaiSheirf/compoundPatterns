public class countFactoryImp extends duckFactory{
    @Override
    public quackable createMallard() {
        return new quackCounter(new mallardDuck());
    }

    @Override
    public quackable createredHat() {
        return new quackCounter(new redHeadDuck());
    }
}
