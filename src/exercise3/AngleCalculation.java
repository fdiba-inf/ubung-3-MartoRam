package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char method=input.next().charAt(0);

        if(method!='d'&&method!='r')
        {
            System.out.println("inv");
            return;
        }

        int val= input.nextInt();
        while (method=='d'||method=='r')
        {

            if (method=='d')
            {
                System.out.println("Angle: "+val*Math.PI/180+method);
            }
            else if (method=='r')
            {
                System.out.println("Angle: "+val*180/Math.PI+method);
            }
            else if(method!='d'&&method!='r')
            {
                System.out.println("inv");
                break;
            }

            method=input.next().charAt(0);
            val= input.nextInt();

        }



    }
}
