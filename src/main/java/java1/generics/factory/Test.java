package java1.generics.factory;

public class Test {
	public static void main(String[] args) {
		LogFactory<Log> factory = new LogFactory<Log>();
		Log log = factory.create(FileLog.class);
		log.Write();
	}
}
