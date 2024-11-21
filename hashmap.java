import java.util.*;

class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        //put/insert
        map.put(1, "Ritik");
        map.put(2, "Shivam");
        map.put(3, "Satyam");
        map.put(4, "Shadil");
        System.out.println(map);

        map.put(3, "Sumit");
        map.put(5 , "Harshit");
        System.out.println (map);

         //entrySet
         for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        //keySet
        Set<Integer> keys = map.keySet();
        for(Integer key : keys) {
            System.out.println(key + " " + map.get(key));
       }

       //remove
       System.out.println(map.remove(2));
       System.out.println(map);
    }
}
