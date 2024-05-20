import java.util.Arrays;
import java.util.List;

public class Program6 {
	
	  public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,20,56,96);
		int max = list.stream().max(Integer::compare).get();
		System.out.println(max);
		
	}

}
