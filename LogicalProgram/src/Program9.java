import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program9 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("aa","bb","cc","dfdf");
		List<String> list = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(list);
				
		
	}

}
