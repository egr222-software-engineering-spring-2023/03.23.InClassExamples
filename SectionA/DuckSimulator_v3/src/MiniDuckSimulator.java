public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck[] ducksInSimulator = new Duck[]{
                new MallardDuck(),
                new RedheadDuck(),
                new RubberDuck(),
                new ModelDuck()
        };

        for (Duck duck : ducksInSimulator) {
            duck.display();
            duck.performQuack();
            duck.swim();
            duck.performFly();
            System.out.println();
        }

        ducksInSimulator[3].setFlyBehavior(new FlyingWithRocketPower());
        ducksInSimulator[3].performFly();
    }
}