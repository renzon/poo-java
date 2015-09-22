import java.lang.reflect.Field;

public class ValidadorTabajara {
	static public String validar(Object obj) throws IllegalArgumentException, IllegalAccessException{
		Class clazz = obj.getClass();
		for(Field atributo: clazz.getDeclaredFields()){
			atributo.setAccessible(true);
			System.out.println(atributo.getName());
			atributo.getAnnotation(annotationClass)
			System.out.println(atributo.get(obj));
		}
		return "Ok";
	}

}
