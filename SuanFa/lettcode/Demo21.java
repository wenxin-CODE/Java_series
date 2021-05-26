package lettcode;

import java.util.Deque;
import java.util.LinkedList;

//https://leetcode-cn.com/problems/reverse-substrings-between-each-pair-of-parentheses/solution/fan-zhuan-mei-dui-gua-hao-jian-de-zi-chu-gwpv/
public class Demo21 {
    public static void main(String[] args) {
        Solution21 ss = new Solution21();

        String s = ss.reverseParentheses("(uoy (love) i)");
        System.out.println(s);
    }
}

class Solution21{
    public String reverseParentheses(String s){
        Deque<String> stack = new LinkedList<String>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '('){
                stack.push(sb.toString());
                sb.setLength(0);
            }else if(ch == ')'){
                sb.reverse();
                sb.insert(0,stack.pop());
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}


//如果是左括号，将 \textit{str}str 插入到栈中，并将 \textit{str}str 置为空，进入下一层；
//
//如果是右括号，则说明遍历完了当前层，需要将 \textit{str}str 反转，返回给上一层。具体地，将栈顶字符串弹出，然后将反转后的 \textit{str}str 拼接到栈顶字符串末尾，将结果赋值给 \textit{str}str。
//
//如果是小写英文字母，将其加到 \textit{str}str 末尾
