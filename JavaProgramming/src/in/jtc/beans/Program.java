package in.jtc.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {
	
	  public static void main(String[] args) {
		
    //  List<Integer> myList = Arrays.asList(10,21,15,13,34,15,16);
     /* myList.stream().filter(i->i%2==0)
                     .forEach(System.out::println);*/
     /* myList.stream().map(s->s+"")
                      .filter(s->s.startsWith("1"))
                      .forEach(System.out::println);*/
       /* Set<Integer> set = new HashSet<>();
        myList.stream().filter(s->!set.add(s))
                       .forEach(System.out::println);*/
    /*  long count = myList.stream().count();
      System.out.println(count);*/
      /*Integer max = myList.stream().max(Integer::compare).get();
      System.out.println(max);*/
   //   myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
     /* List<Integer> myList = Arrays.asList(4,5,6,1,2,3) ;
        myList.stream().map(i->i*i*i)
                         .filter(i->i>50).forEach(System.out::println);*/
		List<Integer> myList = Arrays.asList(12,19,55,67,26);
		myList.stream().findFirst().ifPresent(System.out::println);
		
	}

}
