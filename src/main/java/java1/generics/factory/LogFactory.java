package java1.generics.factory;

public class LogFactory<T extends Log> {
	public Log create(Class<? extends Log> clazz) {
		Log x = null;
		try {
			x = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return x;
	}
}
