import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import aula6.Homem;

public class Main {

	public static void main(String[] args) {

		List<Homem> homens = Arrays.asList(new Homem("Renzo"), new Homem("Priscila"));

		Consumer<Homem> p = (h) -> System.out.println(h);
		homens.forEach(p);
		
		Stream<Homem> s=homens.stream().filter((Homem h) -> h.nome.startsWith("R"));
		
		s.forEach(System.out::println);;

	}

}
