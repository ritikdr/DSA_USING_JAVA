import java.util.HashSet;
import java.util.Iterator;

class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        //insert an element
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.size());
        System.out.println(set);

        //search/contains an element
        if(set.contains(1)) {
            System.out.println("true");
        }
        if(!set.contains(5)) {
            System.out.println("element is not found");
        }

        //remove/delete an element
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("element does not contains");
        }

        //iterator
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

