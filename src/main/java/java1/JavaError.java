package java1;

public class JavaError {
	/**
	 * 1.属性私有不能是公有
	 */
	public void test() {

		Model1 model1 = new Model1();
		model1.name = "abc";
		// name什么时候赋值完全不知道
	}

	/**
	 * 逻辑参与中不能包含数字，除非是数量为0判断
	 */
	public void test2() {
		int type = 0;
		if (type == 1 || type == 2) {

		}
		if (type == Type.ON_LINE.value || type == Type.STORE.value) {
			
		}

	}

	public static enum Type {
		/**
		 * 线上参与
		 */
		ON_LINE(1,"线上参与"), 
		/**
		 * 门店领取
		 */
		STORE(2,"门店领取"),
		/**
		 *引客到店
		 */
		ON_LINE_STORE(3,"引客到店");
		public int value;
		public String name;

		Type(int v,String n) {
			this.value = v;
			this.name = n;
		}
	}

}

class Model1 {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// 后期没有拓展了
		this.name = name;
	}

}
