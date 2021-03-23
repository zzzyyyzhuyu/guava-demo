package com.wimp.basic;

import com.google.common.base.Optional;
import com.wimp.bean.User;

/**
 * @author zy
 * @date 2021/3/22
 * <p>
 *  空值引用校验，java.util.Optional也有类似方法
 *
 * 创建Optional实例（以下都是静态方法）：
 *
 * Optional.of(T)	创建指定引用的Optional实例，若引用为null则快速失败
 * Optional.absent()	创建引用缺失的Optional实例
 * Optional.fromNullable(T)	创建指定引用的Optional实例，若引用为null则表示缺失
 * 用Optional实例查询引用（以下都是非静态方法）：
 *
 * boolean isPresent()	如果Optional包含非null的引用（引用存在），返回true
 * T get()	返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException
 * T or(T)	返回Optional所包含的引用，若引用缺失，返回指定的值
 * T orNull()	返回Optional所包含的引用，若引用缺失，返回null
 * Set<T> asSet()	返回Optional所包含引用的单例不可变集，如果引用存在，返回一个只有单一元素的集合，如果引用缺失，返回一个空集合。 
 */
public class OptionalDemo {
    public static void main(String[] args) {
        //Guava包的Optional
        User user = null;
        System.out.println(user);
        try {
            Optional<User> userOptional = Optional.of(user);
            System.out.println(userOptional.get());
            System.out.println(userOptional.or(new User()));
            System.out.println(userOptional.orNull());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Optional<User> userOptionalNullable = Optional.fromNullable(user);
        System.out.println(userOptionalNullable.orNull());
        //JDK1.8的Optional
        String result = java.util.Optional.ofNullable(user).map(User::getUserName).orElse(null);
        System.out.println(result);
    }
}
