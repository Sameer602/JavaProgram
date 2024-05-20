import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program3 {
	   public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10,11,12,11,15,17,19,17);
		 Set<Integer> set = new HashSet();
		 list.stream().filter(n->!set.add(n))
		 .forEach(System.out::println);
		
	}

}
