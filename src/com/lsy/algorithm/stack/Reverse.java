package com.lsy.algorithm.stack;

import java.util.Stack;

/**
 * 仅用递归函数和栈操作逆序的一个栈
 * P 7
 */
public class Reverse {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        //获取栈低元素并清空栈
        int getElement = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(getElement);
    }

    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        Integer result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        }
        int lastElement = getAndRemoveLastElement(stack);
        stack.push(result);
        return lastElement;

    }


}
