package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//ctrl + shift + o(영문)
		// HashSet 객체의 중복을 허용하지 않고, 순서 없다(순서를 보장하지 않는다 no guarantee)!
		
		//1. 선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>();
		//Generic : <Integer>
		
		//2. 할당
		set.add(1); //자동 변환 : auto boxing
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(7);
		set.add(5);
		
		System.out.println(set.size());
		
		//3. 출력
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);
		}
		
		
		
		HashSet<Customer> set1 = new HashSet<Customer>() ;
		set1.add(new Customer("성영한1"));
		set1.add(new Customer("성영한2"));
		set1.add(new Customer("성영한3"));
		set1.add(new Customer("성영한1"));
		
		System.out.println("size : "+set1.size());
		
		//
		
		//로또 복권 - HashSet
		
		//TreeSet : 객체의 중복을 허용하지 않음.  "알아서"  오름차순 정렬해줌. 땡큐.
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		while(true) {
			int random = (int)(Math.random() * 45) + 1;
			lotto.add(random);
			if(lotto.size() == 6) break;
			
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
