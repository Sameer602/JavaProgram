package in.jtc.beans;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	
	  public static void main(String[] args) {
		
		Function<String,String> f1 = (s)->s.toUpperCase();
		System.out.println(f1.apply("sameer rai"));
		
		Function<Integer,Integer> f2 = (i)->(i*i);
		System.out.println(f2.apply(10));
		
		BiFunction<Integer,Integer,Integer> f3 = (i,j)->(i*j);
		System.out.println(f3.apply(10,20));
	}

}
