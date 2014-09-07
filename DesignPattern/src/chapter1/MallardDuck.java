package chapter1;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void displya() {
		System.out.println("本物のマガモです。");
	}

}
