import java.util.Arrays;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,152,2,251,169,101);
		list.stream().map(s->s +"")  //Convert Integer to String
		.filter(s->s.startsWith("1"))
		.forEach(System.out::println);
	}

}
