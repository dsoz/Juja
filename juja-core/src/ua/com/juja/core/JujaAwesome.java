package ua.com.juja.core;

import java.util.Arrays;

/**
 * Created by Diana on 20.06.2018.
 */
public class JujaAwesome{
    public static void main(String[] args){
      //  System.out.println(eval("123"));
     //   System.out.println(eval("(2+2)*3"));
     //   System.out.println(eval("2*(1+3)"));
        System.out.println(eval("((13/6)*2-5)+1"));
        System.out.println(eval("(123+321)-1"));
    }

    public static int eval(String expr) {
        return eval(expr, 0, expr.length() - 1);
    }

    private static int eval(String expr, int from, int to) {
        int leftOperand;
        char operation;
        int rightOperand;
        String currentSubstr = expr.substring(from, to + 1);

        if (expr.charAt(from) == '(') {
            int tmp = 0;
            for(int i = to; i >= 0; i--){
                if (expr.charAt(i) == ')'){
                    tmp = i;
                    break;
                }
            }
            if (tmp == to) {
                return eval(expr, from + 1, tmp - 1);
            } else {
                leftOperand = eval(expr, from + 1, tmp - 1);
                operation = expr.charAt(tmp + 1);
                rightOperand = eval(expr, tmp + 2, to);

                switch (operation) {
                    case '+':
                        return leftOperand + rightOperand;
                    case '-':
                        return leftOperand - rightOperand;
                    case '*':
                        return leftOperand * rightOperand;
                    case '/':
                        return leftOperand / rightOperand;
                }
                return 0;
            }
        } else {
            int pos = from;
            while (pos < to) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos++;
                } else {
                    leftOperand = Integer.valueOf(expr.substring(from, pos));
                    operation = expr.charAt(pos);
                    rightOperand = eval(expr, pos + 1, to);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr.substring(from, to + 1));
        }
    }
}

