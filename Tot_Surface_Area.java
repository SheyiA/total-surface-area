import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard_zh_CN;

public class Tot_Surface_Area {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the the radius: ");
        double r = s.nextDouble();
        System.out.println("Enter the height: ");
        double h = s.nextDouble();
        double tsa = ((2*22*r)/7)*(r+h);
        
    }
}
