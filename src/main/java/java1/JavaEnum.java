package java1;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * java枚举学习
 *一：使用场景：
 * 需要一组固定的常量的时候，
 * 你在编译的时候就知道其所包含所有可能值的其他组合，使用枚举。
 * 二：枚举易读的多，安全，功能更加强大
 *  三：枚举受益于
 *  1.显式的构造器或者成员
 *  2.每个常量跟属性的关联
 *  3.提供行为受这个属性影响到方法
 *  4.多种行为与单个方法关联。特定于常量的方法优先于启用自有值的枚举。如果多个枚举常量同事共享相同的行为，则考虑策略枚举
 * 
 */
/**
 * 一：策略枚举，strategy enum 参考：StrategyEnum 
 * 二：EnumSet代替位域
 * EnumSet比HashSet更快,比如HashSet耗费9ms，EnumSet耗费4ms 
 * 三：enumMap 代替序数索引
 */
public class JavaEnum {
	public static void main(String[] args) {
		enumMapUse();
	}
	public void enumSetUse() {
		// 创建一个EnumSet集合，集合元素就是枚举类的全部枚举值
		EnumSet<MakeInvoiceType> enumSet = EnumSet.allOf(MakeInvoiceType.class);
		System.out.println(enumSet);
		// 创建一个EnumSet空集合，指定其集合元素是Season类的枚举值
		EnumSet es2 = EnumSet.noneOf(MakeInvoiceType.class);
		es2.add(MakeInvoiceType.BREAK_UP);
	}
	public static void enumMapUse() {
		EnumMap enumMap = new EnumMap(MakeInvoiceType.class);
		enumMap.put(MakeInvoiceType.BREAK_UP, "小荷才露尖尖角");
		enumMap.put(MakeInvoiceType.DIRECTLY, "满园春色关不住");
		System.out.println(enumMap);

	}
	public static enum MakeInvoiceType {
		/**
		 * 未开票
		 */
		DIRECTLY(1, "未开票"),
		/**
		 * 开票中
		 */
		BREAK_UP(2, "开票中"),
		/**
		 * 退票中
		 */
		SPECIAL(3, "退票中");
		public int value;
		public String name;

		MakeInvoiceType(int v, String n) {
			this.value = v;
			this.name = n;
		}
	}
}
