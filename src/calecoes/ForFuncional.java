package calecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ForFuncional {

	public static void main(String[] args) {
		List<Integer> numeros =new ArrayList<Integer>();
		numeros.add(0);
		numeros.add(1);
		numeros.add(2);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
//		for(int n: numeros){
//			System.out.println(n);
//		}
//		
//		Consumer<Integer> cons = (Integer n) -> System.out.println(n);
		numeros.stream().filter((Integer n) -> n<3).map((Integer n) -> n*n).forEach(System.out::println);
		
		

	}

}
