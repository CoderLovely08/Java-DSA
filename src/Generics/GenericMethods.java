package Generics;

public class GenericMethods {
    //only works for Class and not primitive type
    public static <E> void printArray(E []myarr) {
        for (E e : myarr) {
            System.out.print(e+" ");
        }   
    }
    public static void main(String[] args) {
        Integer[] intArray ={1,2,3,4,5,6};
        String[] stringArray = {"Lovely", "Ragini", "Omprakash", "Nisha"};
        printArray(intArray);
        printArray(stringArray);
    }
}
