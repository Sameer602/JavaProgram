package in.jtc.beans;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	  public static void main(String[] args) {
		
		Consumer<String> consumer1 = (name)-> System.out.println(name  +  ":::Good Morning...!!!!");
		
		consumer1.accept("Sameer Rai");
		
		Consumer<Integer> consumer2 = (i)->System.out.println(i*i);
		
		consumer2.accept(20);
	}

}
