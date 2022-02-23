package GFG.Module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pattern {
    static void printPat() throws IOException{
        Scanner br = new Scanner(System.in);
        System.out.println("Enter Total vehicles and total wheels: ");
        int v = br.nextInt();
        int w = br.nextInt();
        int tw,fw;
        fw=(w-2*v)/2;
        System.out.println("TW: "+(v-fw)+"\nFW: "+fw);
    }
    public static void main(String[] args) throws Exception {
        int x = 0;

     int y = 0;

    for (int z = 0; z < 5; z++)

    {

        if((++x > 2) || (++y > 2))

        {

           x++;

        }

    }

       System.out.println( x + " " + y);
    }
}
