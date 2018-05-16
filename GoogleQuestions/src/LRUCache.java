import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LRU lru=new LRU(4);
	    LRU.put(1,5);
	    System.out.println(LRU.get(1));
	    LRU.put(2,5);
	    LRU.put(3,5);
	    System.out.println(LRU.get(2));
	    System.out.println(LRU.get(3));
		
	
		
		
	}

}


class LRU {
    static LinkedHashMap<Integer,Integer> linkedHashMap;
    int size;
    public LRU(int capacity) {
        size=capacity;
     linkedHashMap=new LinkedHashMap<Integer,Integer>(capacity);
        
        
    }
    //getting the element in map
    public static int get(int key) {
        if(linkedHashMap.containsKey(key))
        {   int value=linkedHashMap.get(key);
            linkedHashMap.remove(key);
           linkedHashMap.put(key,value);
           return value;
        }
        return -1;
    }
    //putting the keys in LinkedHashMap and when it is full removing the last element
    public static void put(int key, int value) {
      if(linkedHashMap.containsKey(key))
          linkedHashMap.remove((Object)key);
      if(linkedHashMap.size()==size)
      {int lastElemet=0; 
          for(int ele:linkedHashMap.keySet())
          { linkedHashMap.remove(ele);break;}
       
      }     
          
      linkedHashMap.put(key,value);
        
    }
}