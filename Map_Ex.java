package javaprgms;

import java.util.HashMap;

public class Map_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String,Integer>data=new HashMap<>();
     data.put("Hema", 123);
     data.put("hari", 456);
     data.put("harini", 123);
     System.out.println(data);
     System.out.println(data.get("Hema")); //getting value based on key
     
     data.remove("hari"); //removes both key & val 
     data.put("Hema", 456);
     System.out.println(data);
     System.out.println(data.keySet()); //returns the keys
     
     System.out.println(data.values()); //returns the values
     
     System.out.println(data.entrySet()); //returns both key & value(it returns as set)
     
     for(Object e:data.keySet())
     {
    	 System.out.println(e+" and "+data.get(e));
     }
     
	}

}
