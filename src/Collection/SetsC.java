// package Collection;

// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.Set;
// import java.util.TreeSet;

// public class SetsC {
//     public static void myset() {
//         Set<Integer> s = new HashSet<>();
//         //order changes everytime
//         //O(1)
//         s.add(5);
//         s.add(45);
//         s.add(235);
//         s.add(45);
//         System.out.println(s);
        
//         System.out.println(s.contains(456));
//         s.remove(45);
//         s.isEmpty(); //returns boolean
//         s.size(); //return size
//         s.clear(); //clears the entire test
//         System.out.println(s);
//     }

//     public static void linkedhashset() {
//         Set<Integer> s = new LinkedHashSet<>();
//         //purpose is to maintain the insertion order
//         s.add(5);
//         s.add(45);
//         s.add(235);
//         s.add(45);
//         System.out.println(s);
        
//         System.out.println(s.contains(456));
//         s.remove(45);
//         s.isEmpty(); //returns boolean
//         s.size(); //return size
//         s.clear(); //clears the entire test
//         System.out.println(s);
//     }

//     public static void treeset() {
//         Set s = new TreeSet();
//         //sorted and unique functionality 
//         //O(logn)
//         s.add(5);
//         s.add(45);
//         s.add(235);
//         s.add(45);
//         System.out.println(s);
        
//         System.out.println(s.contains(456));
//         s.remove(45);
//         s.isEmpty(); //returns boolean
//         s.size(); //return size
//         s.clear(); //clears the entire test
//         System.out.println(s);
//     }

//     public static void main(String[] args) {
//         linkedhashset();
//     }
// }
