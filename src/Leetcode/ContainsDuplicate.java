// package Leetcode;
// import java.util.HashSet;
// import java.util.Set;

// public class ContainsDuplicate {

//     public static boolean containsDuplicate(int[] nums) {
//         boolean result;
//         Set<Integer> set=new HashSet<>();
//         for(Integer num:nums) set.add(num);
//         result = set.size()==nums.length;
//         //return !result;
        
//         //approach 2        
//         /*
//         Set<Integer> set = new HashSet<>();
//         for (int i: nums){ 
//                 if(!set.add(i))return true;
//         }
//         return false;
//         */

//         //approach 3
        
//         HashSet<Integer> hashSet=  new HashSet<>();
//         for (int i: nums){
//             if(hashSet.contains(i)) return true;
//             hashSet.add(i);
//         }
//         return false;        
//     }

//     public static void main(String[] args) {
//         System.out.println(containsDuplicate(new int[] {1,2,3,1}));
        
//     }
// }
