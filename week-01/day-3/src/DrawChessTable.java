public class DrawChessTable {
    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

        for (int a=0; a < 8; a++)
        {
            for (int b=0; b < 8; b++) {
                if ((a + b) % 2 == 0) {
                    System.out.print("%");
                } else System.out.print(" ");
            }

            System.out.println(" ");
        }

    }
}
