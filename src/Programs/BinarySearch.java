package Programs;
public class BinarySearch {
    public static int search(int[] array, int target){
        int low=0,high=array.length-1;
        while (low<=high) {
            int mid=low + (high-low)/2;
            if(array[mid]==target){
                return array[mid];
            }
            if(array[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] array={1,3,5,7,9,11,13,14,15,56};
        System.out.println(search(array,56));
    }
}
