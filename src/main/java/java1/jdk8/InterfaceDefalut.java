package java1.jdk8;

public interface  InterfaceDefalut {
	public void test1();
    
    public default void test2(){
        System.out.println("我是新特性1");
        System.out.println("test2调用test1======");
        test1();
    }

}
