package Week3;

import java.util.Scanner;

import edu.princeton.cs.algs4.Stack;

import edu.princeton.cs.algs4.StdOut;

public class w3_tailop_25021913 {

    public static int getPrecedence(char op){

        return switch(op){

            case '+', '-' -> 1;

            case '*', '/' -> 2;

            case '^' ->3;

            default -> -1;

        };

    }

    static String infixtoPostfix(String s){

        StringBuilder res = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i){

            char c = s.charAt(i);

            if (c == ' ')continue;

            if (Character.isLetterOrDigit(c)) {

                StringBuilder operand = new StringBuilder();

                while (i < s.length() && Character.isLetterOrDigit(s.charAt(i))) {

                    operand.append(s.charAt(i));

                    i++;

                }

                i--;

                res.append(operand).append(" ");

            }

            else if (c == '('){

                stack.push(c);

            }

            else if (c == ')'){

                while (!stack.isEmpty() && stack.peek() != '('){

                    res.append(stack.pop()).append(' ');

                }

                if (!stack.isEmpty()){



                    stack.pop();

                }

            }

            else {

                while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(c)){

                    res.append(stack.pop()).append(' ');

                }

                stack.push(c);

            }



        }

        while (!stack.isEmpty()) {

            if (stack.peek() == '(') {

                return "Biểu thức đầu vào không hợp lệ (lỗi dấu ngoặc)";

            }

            res.append(stack.pop()).append(' ');

        }



        return res.toString();

    }

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        String s = sc.nextLine();

        System.out.println(infixtoPostfix(s));

    }



}