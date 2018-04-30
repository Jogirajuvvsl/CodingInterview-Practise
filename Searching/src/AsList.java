import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {
	
		String[] strs= {"JogiRaju","Vegiraju","Venkat"};
		ArrayList<String> list= (ArrayList<String>) Arrays.asList(strs);
		
		System.out.println(list.toString());
		
	

	}

}
