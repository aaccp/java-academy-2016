/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Interfaces
********************************************/

public class TestInterface implements CharSequence{
	private String str;

	public TestInterface(String str){
		this.str = str;
	}

	public int length(){
		return this.str.length();
	}

	public char charAt(int index){
		return this.str.charAt(index);
	}

	public CharSequence subSequence(int start, int end){
		return this.str.substring(start,end);
	}

	public String toString(){
		return this.str;
	}

	public String reverse(){
		String[] sArray = this.str.split("");
		String aux = "";
		for(int i=0; i<this.str.length(); i++){
			aux += sArray[(this.str.length()-1)-i];
		}
		return aux;
	}

	public static void main(String[] args) {
		TestInterface ti = new TestInterface("make sure to call all four methods");
		System.out.println(ti.reverse());
	}
}