public class App {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.perfomQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
