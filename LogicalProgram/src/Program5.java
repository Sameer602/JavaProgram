import java.util.Arrays;
import java.util.List;

public class Program5 {
	
	  public static void main(String[] args) {
		  
		  List<Integer> list = Arrays.asList(10,11,12,15,14,17,19);
		    
		  long count = list.stream().count();
		  System.out.println(count);
				  
	}

}
