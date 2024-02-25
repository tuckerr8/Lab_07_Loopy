public class LoopsB7 {
    public static void main(String[] args) {

        //Loop that displays 5 rows of 5 stars
        final int ROW = 4;
        final int COL  = 5;

        for (int row = 0; row <= ROW; row++)
        {
            //
            for (int col = 0; col <= COL; col++)
            {
                System.out.printf("*", row * col);
            }
            System.out.println("");
        }
    }
}
