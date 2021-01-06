public class duckFactoryImp extends duckFactory {

    @Override
    public quackable createMallard() {
        return new mallardDuck();
    }

    @Override
    public quackable createredHat() {
        return new redHeadDuck();
    }
}
