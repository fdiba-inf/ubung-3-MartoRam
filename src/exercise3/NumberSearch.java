package exercise3;



public class NumberSearch {
    public static void main(String[] args) {
        int counter=0;

        for (int i=101;i<=1000;i++)
        {
            if (i%5==0&& i%6==0)
            {
                counter++;

                if (counter==10 ||counter==20)


                {
                    System.out.println(i+" ");

                }
                else
                {
                    System.out.print(i+" ");
                }

            }

        }
    }
}
