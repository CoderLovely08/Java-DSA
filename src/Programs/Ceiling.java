package Programs;
public class Ceiling {
    public static int findCeiling(int[] array, int target) {
        int low=0,high=array.length-1;        
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(array[mid]<target){
                low=mid+1;
            }else if(array[mid]>target){
                high=mid-1;
            }else{
                return array[low];
            }
        }
        return array[low];
    }
    public static void main(String[] args) {
        int[] array={1,3,5,7,9,11,13,14,15,56};
        System.out.println(findCeiling(array, 6));
    }
}
