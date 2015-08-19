package primitivos;

public class Caractere {

	public static void main(String[] args) {
		char aMaiusculo = 'A';
		for(int i = 3000; i < 3026;++i){
			System.out.println(i+" - "+((char) i));
		}
		
		String nome="Renzo";
		System.out.println(nome+" Nuccitelli");
		String s = 1+1+"s";
		s=null;
		System.out.println(s);
		
//		int i =null;
		
		

	}

}
