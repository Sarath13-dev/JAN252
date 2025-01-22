package org.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Implementation {
	
	public static void main(String[] args) throws IOException {
		
		HDFCDatabase hdfcDatabase = new HDFCDatabase();
		hdfcDatabase.readData();
		hdfcDatabase.setUsername("Ravi@123");
		hdfcDatabase.setPassword(111);
		hdfcDatabase.setBalance(1);
		
		
		HDFCDatabase hdfcDatabase2 = new HDFCDatabase();
		hdfcDatabase2.readData();
		hdfcDatabase2.setUsername("Babu@123");
		hdfcDatabase2.setPassword(222);
		hdfcDatabase2.setBalance(1);
		
		HDFCDatabase hdfcDatabase3 = new HDFCDatabase();
		hdfcDatabase3.readData();
		hdfcDatabase3.setUsername("Anand@123");
		hdfcDatabase3.setPassword(333);
		hdfcDatabase3.setBalance(1);
		
		HDFCDatabase hdfcDatabase4 = new HDFCDatabase();
		hdfcDatabase4.readData();
		hdfcDatabase4.setUsername("BaBu@123");
		hdfcDatabase4.setPassword(222);
		hdfcDatabase4.setBalance(1);
		
		//User defined List
		//Generics - Wrapper classs - Similar Data types
		//Generics - Wrapper class - pre defined wrapper class - List
		//Generics - Wrapper class - User defined wrapper class - User defined List
		List<HDFCDatabase> li = new ArrayList();
		li.add(hdfcDatabase);
		li.add(hdfcDatabase2);
		li.add(hdfcDatabase3);
		li.add(hdfcDatabase4);
		System.out.println("=============User defined List==============");
		for(int i=0; i<li.size(); i++) {
			HDFCDatabase x = li.get(i);//i=0, x = hdfcdatabase, i=1, x= 
			System.out.println(x.getBalance());
		}
		//User defined Set
		Set<HDFCDatabase> si = new LinkedHashSet();
		si.add(hdfcDatabase);
		si.add(hdfcDatabase2);
		si.add(hdfcDatabase3);
		si.add(hdfcDatabase4);		
		System.out.println("=============User defined Set==============");
		for(HDFCDatabase x:si) {
			System.out.println(x.getBalance());
		}
		//User defined Map
		Map<Integer, HDFCDatabase> m = new LinkedHashMap();
		m.put(10, hdfcDatabase);
		m.put(20, hdfcDatabase2);
		m.put(30, hdfcDatabase3);
		m.put(40, hdfcDatabase4);
		
		//Convert the map into Set
		//Pair - Entry<Key, value>
		Set<Entry<Integer, HDFCDatabase>> entrySet = m.entrySet();
		System.out.println("=============User defined Map==============");
		for(Entry<Integer, HDFCDatabase> e:entrySet) {
			System.out.println(e.getValue().getBalance());
		}
		
	}

}
