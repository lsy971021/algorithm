package com.lsy.algorithm.stack;

import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序(从大到小)
 * P 12
 */
public class SortStackByStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(14);
        stack.push(12);
        Stack<Integer> sort = sort(stack);
        System.out.println(sort);
    }

    public static Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> result = new Stack<>();

        while (!stack.empty()) {
            // pop：弹出并删除栈顶元素  peek:只弹出栈顶元素
            Integer top = stack.pop();
            //push：添加并返回当前元素  add:添加并返回是否添加成功
            while (!result.empty() && result.peek() < top)
                stack.push(result.pop());
            result.push(top);
        }
        while (!result.empty())
            stack.push(result.pop());
        return stack;
    }
}
