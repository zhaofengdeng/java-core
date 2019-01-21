package ebean;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<KeyValue> test = test(50001);
		for (KeyValue keyValue : test) {
			System.out.println(keyValue.index+"========"+keyValue.qty);
		}
	}
	private static List<KeyValue> test(int t){
		if(t<=1) {
			return null;
		}
		List<KeyValue> list=new ArrayList();
		int a=t/10000;
		if(t%10000>0) {
			a++;
		}
		for(int i=1;i<=a;i++) {
			KeyValue m=new KeyValue();
			m.index=(i-1)*10000;
			m.qty=10000;
			list.add(m);
		}
		if(t%10000==1) {
			list.get(a-1).index--;
			list.get(a-2).qty--;
		}
		return list;
	}
}
class KeyValue{
	int index;
	int qty;
	
}
