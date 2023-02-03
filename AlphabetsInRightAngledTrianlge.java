/**
 Write a java program to print below pattern
 
    *
    * *
    * A *
    * B C *
    * D E F *
    * G H I J *
    * K L M N O *       
    * P Q R S T U *     
    * V W X Y Z [ \ *   
    * * * * * * * * * * 

*/
public class AlphabetsInRightAngledTrianlge {
    public static void main(String[] args) {
        int n = 10;
        char ch = 'A';

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j == 0 || i == j || i == n-1) {
                    System.out.print("* ");
                } else {
                    if(j > 0 && j <= i) {
                        System.out.print(ch++ + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}