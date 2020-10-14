package exercise3;
import java.util.Scanner;
public class NumberCounter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int negc = 0;
        int posc=0;
        double sum=0;
        double aver=0;



        while (number!=0)
        {

            if (number < 0)
            {
                negc++;

            }
            else
            {
                posc++;
            }
            sum = sum*1.0+number*1.0;
             aver=sum*1.0/(negc+posc)*1.0;
            System.out.println("Positive numbers: "+posc);
            System.out.println("Negative number: "+negc);
            System.out.println("Sum: "+sum);
            System.out.println("Average: "+aver);
            number=input.nextInt();



        }








    }
}
