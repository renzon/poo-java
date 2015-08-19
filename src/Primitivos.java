
public class Primitivos {

	public static void main(String[] args) {
		boolean b = true;
		boolean a = false;
		
		if(a && b){
			System.out.println("Executou");
		}else if(a || b){
			System.out.println("Else if");
		}else{
			System.out.println("Else");
		}
//		a="renzo";
		
		System.out.println("saiu do if");
		
		byte by = 127;
		short s = 800;
		int i=900;
		long l=8000l;
		
		s = by;
		++s;
		if (Byte.MIN_VALUE<=s && s<128){
			by = (byte) s;
		}
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(by);
		
		
		

	}

}
