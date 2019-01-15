package java;
/**
 * java泛型学习
 * 优势：泛型在安全性跟表述性方面有优势
 * 官方理解：
 * 使用泛型比使用需要在客户端代码中进行转换的类型来的更安全，也更容易.
 * 设计新类型时，要确保他们不需要这种转换就可以使用.新用户使用变得更加轻松，又不会破坏现有的客户端
 * 个人理解
 * 1. 安全：明确规定使用的类型了
 * 使用别的类型编译不通过
 * 2.表述：客户端很明确表达的意思了，
 * List searchUser();
 * List<User> search User
 * @author admin
 *
 */
public class JavaGenerics {
/**
 * 专业术语： 
 * 
 * 参数化的类型： List<String>
 * 实际类型参数：String
 * 泛型：List<E>
 * 形式类型参数：E
 * 无限制通配符类型：List<?>
 * 原生态类型:List
 * 有限制类型参数： <E extends Number>
 * 递归类型限制：<T extends Comparable<T>>
 * 有限制通配符类型：List<? extends Number>
 * 泛型方法: static <E> List<E> asList(E[] a)
 * 类型令牌： String.class
 */
	
	/**
	 * 第一点：泛型使用列表优先于数组
	 * 不是很明白后续继续思考
	 */
}
