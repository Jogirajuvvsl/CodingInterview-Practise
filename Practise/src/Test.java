
import java.util.Arrays;
import java.util.List;

/*
 * A java example source code to demonstrate
 * the use of asList() method of Arrays class
 */

public class Test {

	public static void main(String[] args) {

		// initialize a new String array
		String[] studentDatabase = new String[]{"Ryan","Alfred","Beth"};
		
		// convert the student database into list
		List alist = Arrays.asList(studentDatabase);
				
		// print how many student on the list
		System.out.println("Count of Student:"+alist.size());
		
		// print the contents of our list
		for(String s:alist){
			System.out.println(s);
		}

	}
}