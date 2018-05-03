import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,Integer> lmap=new 	LinkedHashMap<Integer,Integer>(3);
		lmap.put(1,1);
		lmap.put(2,2);
		lmap.put(3,3);
		lmap.put(4,4);
		
		Iterator itr = lmap.keySet().iterator();
        if(itr.hasNext()) {             
            // Removing the top element of the map (As technically, it appeared before rest of the members of the map.)
            Integer key_toRm = (Integer) itr.next();
          
        }
		
		for(int ele:lmap.keySet())
			System.out.println(ele+" "+lmap.get(ele));
	
		
		
	}

}


