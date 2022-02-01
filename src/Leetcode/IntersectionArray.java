// package Leetcode;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Set;

// public class IntersectionArray {

//     public static int[] intersection(int[] nums1, int[] nums2) {
//         ArrayList list1 = new ArrayList<>();
//         ArrayList list2 = new ArrayList<>();
//         for (int i : nums1) {
//             list1.add(i);
//         }
//         for (int i : nums2) {
//             list2.add(i);
//         }
//         list2.retainAll(list1);
//         Set<Integer> s = new HashSet<>();
//         for (int i = 0; i < list2.size(); i++) {
//             s.add((Integer) list2.get(i));
//         }
//         int arr[] = new int[s.size()];
//         Iterator<Integer> i = s.iterator();
//         int j = 0;
//         while (i.hasNext()) {
//             arr[j] = (int) i.next();
//             j++;
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         int[] nums1 = { 4, 9, 5 }, nums2 = { 9, 4, 9, 8, 4 };
//         System.out.println(Arrays.toString(intersection(nums1, nums2)));
//     }
// }
