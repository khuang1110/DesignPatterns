package strategy_pattern;

public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		//setter used to change flybehavior at runtime
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		
	}

}
