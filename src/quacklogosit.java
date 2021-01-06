public class quacklogosit implements observer{
    @Override
    public void update(quackOsevable duck) {
        System.out.println("quacklogist :" + duck + "just quacked");
    }
}
