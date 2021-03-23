package com.wimp.basic;

import com.google.common.base.Preconditions;
import com.wimp.bean.User;

/**
 * @author zy
 * @date 2021/3/23
 * <p>
 *
 *  Preconditions 类中的前置校验
 *
 * 方法都有三个变种：
 *
 * 没有额外参数：抛出的异常中没有错误消息；
 * 有一个Object对象作为额外参数：抛出的异常使用Object.toString() 作为错误消息；
 * 有一个String对象作为额外参数，并且有一组任意数量的附加Object对象：这个变种处理异常消息的方式有点类似printf，但考虑GWT的兼容性和效率，只支持%s指示符。例如：
 * 1
 * checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);
 * 2
 * checkArgument(i < j, "Expected i < j, but %s > %s", i, j);
 *
 * 方法声明（不包括额外参数）	描述	检查失败时抛出的异常
 * checkArgument(boolean)	检查boolean是否为true，用来检查传递给方法的参数。	IllegalArgumentException
 * checkNotNull(T)	检查value是否为null，该方法直接返回value，因此可以内嵌使用checkNotNull。	NullPointerException
 * checkState(boolean)	用来检查对象的某些状态。	IllegalStateException
 * checkElementIndex(int index, int size)	检查index作为索引值对某个列表、字符串或数组是否有效。index>=0 && index<size *	IndexOutOfBoundsException
 * checkPositionIndex(int index, int size)	检查index作为位置值对某个列表、字符串或数组是否有效。index>=0 && index<=size *	IndexOutOfBoundsException
 * checkPositionIndexes(int start, int end, int size)	检查[start, end]表示的位置范围对某个列表、字符串或数组是否有效*	IndexOutOfBoundsException 
 */
public class CheckArgumentDemo {
    public static void main(String[] args) {
        int i = 1;
        Preconditions.checkArgument(i>=0," i expected >0");
        Preconditions.checkArgument(true);
        Preconditions.checkNotNull(new User());
        Preconditions.checkElementIndex(1,2,"aaa");
        Preconditions.checkPositionIndex(1,2);
        Preconditions.checkPositionIndexes(1,2,3);
    }
}
