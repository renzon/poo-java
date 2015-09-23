package garbage;

import java.util.ArrayList;
import java.util.List;

import aula6.Homem;

public class Main {
	public static void main(String[] args) {
		Homem homem = new Homem("Renzo");
		Homem denis = new Homem("Denis");
		homem.amigo=denis;
		denis.amigo=homem;
//		Homem homem2=homem;
		homem=null;
		denis=null;
		List<Homem> homens=new ArrayList<Homem>();
		System.gc();
		System.out.println("Chamada para gc");
		for(int i=0; i<10000000;++i){
			homens.add(new Homem("Blah"+i));
		}
		System.out.println("Acabou o programa");
		System.out.println(homens.get(0));
		System.out.println(denis);
	}
}
