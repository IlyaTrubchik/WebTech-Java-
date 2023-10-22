package by.bsuir.webtech1.IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputOutput {

    private static Scanner in = new Scanner(System.in);

    private static PrintStream out = new PrintStream(System.out);

    public static void setInputStream(InputStream stream) {
        in = new Scanner(stream);
    }
    public static void setOutputStream(OutputStream stream) {
        out = new PrintStream(stream);
    }

    public static double readDouble() {
        double result;
        try {
            String bufferString = in.nextLine();
            result = Double.parseDouble(bufferString);
            return result;
        } catch (InputMismatchException |
                 NumberFormatException wrongInput) {
            InputOutput.print("Error: wrong input");
        }
        return 0;
    }

    public static int readInt(){
        try {
            return in.nextInt();
        } catch (InputMismatchException wrongInput) {
            print("Error: wrong input");
        }
        return 0;
    }

    public static long readLong(){
        try {
            return in.nextLong();
        } catch (InputMismatchException wrongInput) {
            print("Error: wrong input");
        }
        return 0;
    }

    public static byte readByte() {
        try {
            return in.nextByte();
        } catch (InputMismatchException wrongInput) {
            print("Error: wrong input");
        }
        return 0;
    }

    public static short readShort() {
        try {
            return in.nextShort();
        } catch (InputMismatchException wrongInput) {
           print("Error: wrong input");
        }
        return 0;
    }

    public static float readFloat() {
        float result;
        try {
            String bufferString = in.nextLine();
            result = Float.parseFloat(bufferString);
            return result;
        } catch (InputMismatchException |
                 NumberFormatException wrongInput) {
           print("Error: wrong input");
        }
        return 0;
    }

    public static int[] readNumberArray() {
        int[] array;
        int length;
        print("Enter number of array elements: ");
        length = readInt();
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = readInt();
        }
        return array;
    }
    public static void print(String text)  {
        try {
            out.write((text+"\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            out = new PrintStream(System.out);
        }
    }

    public void printTable(HashMap<Double,Double> hMap) {
        StringBuilder result = new StringBuilder();
        print("==================");
        print("|   x   |    y   |");
        print("==================");
        DecimalFormat format = new DecimalFormat("###.#####");
        for (Double  key: hMap.keySet()) {
            print("|  " + format.format(key)
                    + "  |  " + format.format(hMap.get(key))
                    + "  |");
            print("==================");
        }
    }

    public static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int number : array) {
            sb.append(number + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        print(sb.toString());
    }

    public static void printList(List<Integer> arrayList){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int number : arrayList) {
            sb.append(number + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        print(sb.toString());
    }

    public static void printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sb.append(matrix[i][j] + ", ");
            }
            sb.delete(sb.length() - 2, sb.length());
            print(sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
