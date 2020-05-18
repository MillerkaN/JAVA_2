import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_2 {

    public static String[][] doStringToArray (String text) throws IndexOutOfBoundsException{

        String[] ar;
        String delimiter1 = "\\n";
        String delimiter2 = " ";
        ar = text.split(delimiter1);
        String[] tempAr;
        int n = 4;
        int m = 4;
        String[][] matrix = new String[n][m];

        for (int i = 0; i < matrix.length; i++) {
            String tempStr = ar[i];
            tempAr = tempStr.split(delimiter2);
            for (int j = 0; j < matrix[i].length; j++) {
                String tempStr2 = tempAr[j];
                matrix[i][j] = tempStr2;
            }
        }

        return matrix;
    }

    public static int scaryMethod (String[][] str) throws NumberFormatException{
        int scaryNum;
        int [][] strToNumbers = new int[4][4];
        int sum = 0;

        for(int i = 0; i < str.length; i++){
            for (int j = 0; j < str[i].length; j++){
                strToNumbers [i][j] = Integer.parseInt(str[i][j]);
                sum += strToNumbers[i][j];
            }
        }
        return scaryNum = sum / 2;
    }

    public static void main (String[] args){

        String text = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String text1 = "10 3 1\n2 3 2 2\n5 6 7 1";
        String text2 = "10 3 1 a\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String text3 = "10 3 1\n2 3 2 a\n5 6 7 1";
        //System.out.print(Arrays.deepToString(doStringToArray(text)));
        //System.out.print(Arrays.deepToString(scaryMethod(doStringToArray(text))));
        //

        try {
            System.out.println(scaryMethod(doStringToArray(text)));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Упс! чет маловато для матрицы 4х4. Исправляйте косяки!");
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Упс! не то кладете в массив. Исправляйте косяки!");
            e.printStackTrace();
        }finally {
            System.out.println("Пофиг! Пляшем!");

        }
        System.out.println("I'm alive!!!");
        System.out.println();

        try {
            System.out.println(scaryMethod(doStringToArray(text1)));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Упс! чет маловато для матрицы 4х4. Исправляйте косяки!");
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Упс! не то кладете в массив. Исправляйте косяки!");
            e.printStackTrace();
        }finally {
            System.out.println("Пофиг, пляшем!");
        }
        System.out.println("I'm alive!!!");
        System.out.println();

        try {
            System.out.println(scaryMethod(doStringToArray(text2)));;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Упс! чет маловато для матрицы 4х4. Исправляйте косяки!");
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Упс! не то кладете в массив. Исправляйте косяки!");
            e.printStackTrace();
        }finally {
            System.out.println("Пофиг, пляшем!");
        }
        System.out.println("I'm alive!!!");
        System.out.println();

        try {
            System.out.println(scaryMethod(doStringToArray(text3)));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Упс! чет маловато для матрицы 4х4. Исправляйте косяки!");
            e.printStackTrace();
        }catch (ArrayStoreException e){
            System.out.println("Упс! не то кладете в массив. Исправляйте косяки!");
            e.printStackTrace();
        }finally {
            System.out.println("выкл!");
        }
        System.out.println("I'm alive!!!");
        System.out.println();

    }

}


