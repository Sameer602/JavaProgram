import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program10 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(50);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(60);
		
		System.out.println("Elements Before Sorting::"+al);
		
		Collections.sort(al, new ElementSortingComparator());
		
		System.out.println(al);
	}

}
class ElementSortingComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {

		return (o1>o2)?1:(o2<o1)?-1:0;
	}
	
	
}