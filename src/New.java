import java.util.Scanner;

// comment

public class New {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        Scanner srt = new Scanner(System.in);
        /* for (int i = 1, sum = 0; i <= 100; i++) {
            if ((i % 3) == 0) {
                continue;
            }
            sum += i;
            i++;
            System.out.println(sum);
        }*/

        /* int min = Integer.MAX_VALUE;
        while(srt.hasNextInt()){
            int b = srt.nextInt();
            if(b < min){
                min = b;
            }
        }
        System.out.println(min);*/

        /* int min = Integer.MAX_VALUE;
        for (; srt.hasNextInt(); ) {
            int b = srt.nextInt();
            if (b < min) {
                min = b;
               }

        }System.out.println(min);*/

       /* int min = Integer.MAX_VALUE;
        int min2 = srt.nextInt();
        if(min2 < min){
            int temp = min;
            min = min2;
            min2 = temp;}
        while (srt.hasNextInt()) {
            int b = srt.nextInt();
            if (b < min) {
                min2 = min;
                min = b;
            } else if (b <min2 && b > min){
                min2 = b;
                }
            }
        System.out.println(min2);*/

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        }
    }


