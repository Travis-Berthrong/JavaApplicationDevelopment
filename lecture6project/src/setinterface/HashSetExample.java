package setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public void hashing() {
		Set<String> set = new HashSet<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		TreeSet<String> ts = new TreeSet<String> ();
		set.add("cat");
		set.add("bat");
		set.add("rat");
		
		lhs.add("cat");
		lhs.add("bat");
		lhs.add("rat");
		
		ts.add("apple");
		ts.add("mango");
		ts.add("orange");
		
		System.out.println(ts);
		System.out.println(lhs);
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
//		for(String st: set) {
//			System.out.println(st);
//		}
	}
}
