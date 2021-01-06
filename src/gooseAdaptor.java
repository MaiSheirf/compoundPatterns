public class gooseAdaptor implements quackable{
    goose g;
    public gooseAdaptor(goose g){
        this.g = g;
    }
    @Override
    public void quack() {
        g.honk();
    }

    @Override
    public void registerObserver(observer observer) {

    }

    @Override
    public void notfyObservar() {

    }
}
