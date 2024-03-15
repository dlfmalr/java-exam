package Exam;

public class Exam2 {
    public static void main(String[] args) {
        // 높이 : 3

        /*

         *
         ***
         *****

         */

        // 높이 : 5

        // 출력

        /*

         *
         ***
         *****
         *******
         *********

         */

        // 높이 : 7

        // 출력

        /*

         *
         ***
         *****
         *******
         *********
         ***********
         *************

         */
        int cnt = 3;

        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < cnt; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        cnt = 5;
        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < cnt; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        cnt = 7;
        for(int i = 0; i < cnt; i++) {
            for(int j = 0; j < cnt; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
