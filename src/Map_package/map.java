package Map_package;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();
    
    //map will not allow duplicates in key, key should be unique, but value will allow duplicates
    //in map when the key and value are same it will skip and will not allow duplicates but if the value is different
    //and key is same it will print last value for that key. if keys are different with same value it will print both
    map.put(10, "Laurel");
    map.put(10, "Laurel");
    map.put(40, "Laurel");
    
    map.put(20, "Bob");
    map.put(30, "Robert");
    
    map.put(50, "Laurel");
    map.put(50, "John");
		
	System.out.println(map);	
	}

}
