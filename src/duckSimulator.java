public class duckSimulator {
    public static void main(String[] args){
        duckSimulator s = new duckSimulator();
        duckFactory d  = new countFactoryImp();
        //s.simulate();
        s.simulate(d);
    }
     void simulate(duckFactory d){
      //  quackable mallar = new mallardDuck();
        // quackable mallar = new quackCounter(new mallardDuck());
      //   quackable mallar = d.createMallard();
       // quackable red = new redHeadDuck();
         //quackable red = new quackCounter(new redHeadDuck());
         quackable red = d.createredHat();
        quackable gooseDuck = new gooseAdaptor(new goose());
        // System.out.println("duck simulator with decorator");
       // System.out.println("duck simulator");
       //  System.out.println("with abstract factory");
         System.out.println("with composite");
         flock flockOfDuck = new flock();
         flockOfDuck.add(red);
         flock flockOfMallards = new flock();
         quackable mallard1 = d.createMallard();
         quackable mallard2 = d.createMallard();
         flockOfMallards.add(mallard1);
         flockOfMallards.add(mallard2);
         flockOfDuck.add(flockOfMallards);
         System.out.println("flock of ducks \n");
         simulate(flockOfDuck);
         System.out.println("flock of mallards /n");
         simulate(flockOfMallards);

         System.out.println("\nDuck Simulator: With Observer");
         quacklogosit quackologist = new quacklogosit();
         flockOfDuck.registerObserver(quackologist);

       // simulate(mallar);
        simulate(red);
        simulate(gooseDuck);
         System.out.println("quacked : " + quackCounter.getQuacks());
    }
    void simulate(quackable duck){
        duck.quack();
    }
}
