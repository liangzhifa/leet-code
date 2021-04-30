package com.zhifa.有效的括号;

/**
 * @auther liangzf
 * @date 2021/4/30 下午4:40
 * 描述信息：
 * 也可以用栈的特性
 */
public class 有效的括号 {

    public boolean isValid(String s) {
        int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return s.length() == 0;
    }
}
