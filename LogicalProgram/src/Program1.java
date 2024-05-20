import java.util.Arrays;
import java.util.List;

public class Program1 {
	  public static void main(String[] args) {
		  List<Integer> list = Arrays.asList(10,15,7,27,20,26);
		  list.stream().filter(n->n%2==0)
		  .forEach(System.out::println);
		
	}

}
