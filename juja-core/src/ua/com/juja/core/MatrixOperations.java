package ua.com.juja.core;

import java.util.Arrays;

/**
 * Created by Diana on 25.07.2018.
 */
public class MatrixOperations {

    public static void main(String[] args) {
        int[][][] B = new int[][][]{{{1,2}, {3,4}}, {{5,6}, {7,8}}};

        int[][][] C = new int[][][] {{{10,11,12},{20,21,22},{30,31,32}}, {{40,41,42},{50,51,52},{60,61,62}}, {{70,71,72},{80,81,82},{90,91,92}}};
        int[][][] D = new int [0][][];
        System.out.println(Arrays.deepToString(rotateClockwise(D)));
    }

    public static int[][][] rotateClockwise(int[][][] arg) {
    try {
        if (arg == null)
            return null;
        if (arg[0].length < 1 || arg[0][0].length < 1)
            return null;
        for (int[][] anArg : arg) {
            for (int j = 0; j < arg.length; j++) {
                if (anArg.length != arg.length || anArg[j].length != arg.length)
                    return null;
            }
        }

        int[][][] result1 = new int[arg.length][arg[0].length][arg[0][0].length];
        int[][][] result2 = new int[arg.length][arg[0].length][arg[0][0].length];

        for (int k = 0; k < arg.length;k++){
            for (int i = 0; i < arg[0].length; i++){
                for (int j = 0; j <arg[0][0].length; j++){
                    result1[k][j][(arg.length -1) - i] = arg[k][i][j];
                }
            }
        }

        for (int k = 0; k < arg.length;k++){
            for (int i = 0; i < arg[0].length; i++){
                for (int j = 0; j <arg[0][0].length; j++){
                    result2[k][i][j] = result1[j][i][(arg.length -1) - k];
                }
            }
        }
        return result2;
    }
    catch (NullPointerException e){
        return null;
        }
    catch (ArrayIndexOutOfBoundsException e) {
        return null;
        }
    }
}

