
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println(addDigits(38));
	
	}

	
	
public static int addDigits(int num) {
        
        if(num<9)
        return num;
       
        int sum=0;
        while(num>0)
       {
           sum=sum+num%10;
           num=num/10;    
           
       }
      return addDigits(sum); 
        
    }
    
	
}
