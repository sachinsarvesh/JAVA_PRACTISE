package Patterns;

import java.sql.SQLOutput;

public class PatternExamples {
    public static void main(String[] args){
        System.out.println("**************  Print v in numbers***************");
        printV(5);

        /*
        System.out.println("**************  Print Alternative***************");
        printAlternative(5);

        System.out.println("**************  Print Symmetry***************");
        printSymmetry(5);

        System.out.println("**************  Print Diamond by merging***************");
        printDiamondWhole(3);

        System.out.println("**************  Print Diamond by calling existing methods***************");
        printDiamond(5);

        System.out.println("**************  Print Rev Pyramid  ***************");
        printRevPyramid(5);

        System.out.println("**************  Print Pyramid  ***************");
        printPyramid(5);

        System.out.println("**************  Print in des numbers  ***************");
        printNumDec(5);

        System.out.println("**************  Print in des pyramid  ***************");
        printStarDec(5);

        System.out.println("**************  Print numbers - same  ***************");
        printNumSame(5);

        System.out.println("**************  Print numbers  ***************");
        printNum(5);

        System.out.println("**************  Print Until given number  ***************");
        printUntilN(5);

        System.out.println("**************  Print N x N  ***************");
        printNxN(5);

         */
    }

    private static void printV(int n) {
        int size = 2 *(n-1);
        for(int i=1; i<=n;i++){

            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int j=1; j<=size;j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            size -= 2;
            System.out.println();
        }
    }

    private static void printAlternative(int n) {
        for(int i=0; i<n; i++){
            int start = 1;
            if(i%2 !=0) start =0;
            for(int j=0; j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }

    private static void printSymmetry(int n) {
        for(int i =1; i<=2*n-1;i++){
            int star = i;
            if( i> n) star = 2*n-i;
            for(int j=1; j<=star;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void printDiamondWhole(int n) {
        //Upper pyramid
        for(int i=1; i<=n;i++){
            for(int j =1 ; j<=n-i ;j++) {
                System.out.print(" ");
            }

            for(int j =1 ; j<=2*i-1; j++) {
                System.out.print("*");
            }

            for(int j =1 ; j<=n-i ;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        //lower pyramid
        for(int i = 1; i<n;i++){
            for(int j =1; j<=i; j++){
                System.out.print(" ");
            }

            for(int j =1; j<=2*n - 2*i -1; j++){
                System.out.print("*");
            }

            for(int j =1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void printDiamond(int n) {
        printPyramid(n);
        printRevPyramid(n);
    }

    /* This method this pattern
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    private static void printNxN(int i) {
        for(int itr = 0; itr < i; itr++){
            for(int itr1=0; itr1<4; itr1++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void printUntilN(int i) {
        for(int itr = 1; itr <= i; itr++){
            for(int itr1=1; itr1<=itr; itr1++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printNum(int i) {
        for(int itr = 1; itr <= i; itr++){
            for(int itr1=1; itr1<=itr; itr1++){
                System.out.print(itr1 + " ");
            }
            System.out.println();
        }
    }

    private static void printNumSame(int i) {
        for(int itr = 1; itr <= i; itr++){
            for(int itr1=1; itr1<=itr; itr1++){
                System.out.print(itr + " ");
            }
            System.out.println();
        }
    }

    private static void printStarDec(int i) {
        for(int itr = 0; itr < i; itr++){
            for(int itr1=i-itr; itr1>0; itr1--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printNumDec(int i) {
        for(int itr = 0; itr < i; itr++){
            for(int itr1=1; itr1<=i-itr; itr1++){
                System.out.print(itr1 + " ");
            }
            System.out.println();
        }
    }

    private static void printPyramid(int n) {
        for(int i = 0; i < n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            for(int j=0; j< 2*i+1; j++){
                System.out.print("*");
            }

            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void printRevPyramid(int n) {
        for(int i = 1; i <= n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<= 2*n - 2*i +1; j++){
                System.out.print("*");
            }

            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
