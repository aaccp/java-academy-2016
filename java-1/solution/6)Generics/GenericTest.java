/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Generics
	Description: Practice for Generics
********************************************/

import java.util.List;
import java.util.ArrayList;

public class GenericTest{

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0);
	}
}