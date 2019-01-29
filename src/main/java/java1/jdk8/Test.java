package java1.jdk8;

public class Test {
	public static void main(String[] args) {
		/**
		 * 　1、default关键字
		 * 在java里面，我们通常都是认为接口里面是只能有抽象方法，不能有任何方法的实现的，
		 * 那么在jdk1.8里面打破了这个规定，引入了新的关键字default，通过使用default修饰方法，
		 * 可以让我们在接口里面定义具体的方法实现，如InterfaceDefalut\InterfaceDefalutImpl1。
		 */
			InterfaceDefalut in=new InterfaceDefalutImpl1();
			in.test1();
			in.test2();
	}

}
