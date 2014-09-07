package chapter1;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void displya() {
		System.out.println("模型の鴨です。");
	}

}
