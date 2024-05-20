import java.util.Arrays;
import java.util.List;

public class Program8 {
	
	  public static void main(String[] args) {
		  
		  List<Integer> list = Arrays.asList(2,3,4,5,7,6,8,9);
		  list.stream().map(i->i*i*i).filter(i->i<50)
		  .forEach(System.out::println);
		  
		
	}

}
