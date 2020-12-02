public class AestricPattern {

    public static void main(String[] args){


        for(int i=1; i<=5; i++) {
            for (int s=1;s<=5-i ;s++) {

                System.out.print(" ");


            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");


            }

            System.out.println();
        }



        for(int i = 1 ; i<=6;i++) {
            for (int s = 0; s <= i - 1; s++) {
                System.out.print(" ");

            }

            for (int j = 1; j <=(4-i)*2+1; j++) {
                System.out.print("*");



            }



            System.out.println();

        }




    }




}




