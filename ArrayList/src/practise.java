
import java.util.*;
public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> listOfIntegers=new ArrayList<Integer>();
		listOfIntegers.add(1);listOfIntegers.add(2);
		listOfIntegers.add(3);
		listOfIntegers.remove(2);
		System.out.println(listOfIntegers);
		Iterator<Integer> iterat=listOfIntegers.iterator();

		
		System.out.println(arrayreturn()[0]);
		
	}
	
	public static int[] arrayreturn(){
		
		
		return new int[] {1,2};
	}
	

}
