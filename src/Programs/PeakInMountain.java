package Programs;

public class PeakInMountain {
    public static int findPeak(int[] array) {
        int low=0,high=array.length-1;
        while (low<high) {
            int mid=low+(high-low)/2;
            if(array[mid]<array[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return array[low];
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,4,3,2,1};
        System.out.println(findPeak(array));
    }
}
