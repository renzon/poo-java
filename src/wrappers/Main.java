package wrappers;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> inteiros=null; 
		Integer i = new Integer(1);
//		i=null;
		println(Integer.parseInt("110", 2));
		println(Integer.decode("110"));
		println(Integer.valueOf("110", 2));
		Character c = new Character('a');
		Double d = new Double(1.0);
		println(i);
		short sPrimitivo=1;		
		f(sPrimitivo);
		Short sWrapper=sPrimitivo;
		f(sWrapper);
		byte b=1;
		f(b);
		f(1);
		
		
//		println(b);
		

	}

	private static void f(int i) {
		System.out.println("int");
	}
	private static void f(short i) {
		System.out.println("short");
	}
	private static void f(Integer i) {
		System.out.println("Integer");
	}
	private static void f(Short i) {
		System.out.println("Short");
	}
	private static void f(int ... i) {
		System.out.println("Varargs");
	}
	

	private static void println(Integer i) {
		System.out.println(i);

	}
	
	

}
