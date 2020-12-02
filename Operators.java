import java.util.Scanner;









public class Operators {
    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);


        System.out.println("ayia promila devi apki percentage check krte hain");


        System.out.println("Enter total marks");
        int total1 = sc.nextInt();




        System.out.println("Enter english marks");
        int a = sc.nextInt();

         System.out.println("Enter math marks");
        int b = sc.nextInt();


          System.out.println("Enter S.S.T marks");
        int c = sc.nextInt();


          System.out.println("Enter sanskrit marks");
        int d = sc.nextInt();

          System.out.println("Enter drawing marks");
        int e = sc.nextInt();


         System.out.println("Enter Hindi marks");
        int f = sc.nextInt();


        float totalMarks= a+b+c+d+e+f;
  float m= totalMarks/total1;
        System.out.println("Promila devi apki percentage hai  \n" +m*100.0+"%"  );






















    }


    }


