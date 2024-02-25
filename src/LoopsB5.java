public class LoopsB5 {
    public static void main(String[] args) {

        //Loop that displays dots by 1 increasing row
        for (int i = 1; i <= 5; i++)
        {
            //
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("*", i * j);
            }
            System.out.println("");
        }
    }
}
