import java.util.Arrays;
import java.util.List;

public class Program4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,11,12,13,14,15);
		list.stream().findFirst().ifPresent(System.out::println);
	}

}
