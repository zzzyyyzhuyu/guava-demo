package com.wimp.basic;

import com.google.common.base.Objects;

/**
 * @author zy
 * @date 2021/3/23
 * <p>
 *  Objects类常用方法，规避空指针
 */
public class ObjectDemo {
    public static void main(String[] args) {
        //此方法jdk1.7之后被util方法取代
        boolean equal = Objects.equal("a", "a");
        System.out.println(equal);
        java.util.Objects.equals("a","a");
    }
}
