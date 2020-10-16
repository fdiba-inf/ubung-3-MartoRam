package exercise3;



public class NumberSearch {
    public static void main(String[] args) {
        int counter=0;
        int counter2=0;
        for (int i=101;i<=1000;i++)
        {
            if (i%30==0)
            {
                counter++;
                System.out.print(i+" ");
                if (counter==10)

                {
                    System.out.println(i+" ");
                    counter=0;
                }

            }

        }
    }
}
