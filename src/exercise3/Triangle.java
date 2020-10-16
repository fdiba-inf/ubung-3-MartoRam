package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        String trtype=" ";
        while(a>0&&b>0&&c>0&&a+b>=c&&a+c>=b&&b+c>=a)
        {
            double p=(a+b+c)/2;
            double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            if (a==b&&b==c)
            {
                trtype="equilateral";
            }
            else if (a==b)
            {
                trtype="isosceles";
            }
            else
                {
                    trtype="scalene";
                }
            System.out.println("Area: "+area);
            System.out.println("Triangle: "+trtype);


            a= input.nextInt();
            b= input.nextInt();
            c= input.nextInt();

        }
        System.out.println("Values are not correct!");

    }
}
