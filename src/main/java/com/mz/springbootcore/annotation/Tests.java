package com.mz.springbootcore.annotation;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Tests {

    @Candy(name = "candys")
    public void show() {

    }

    @SneakyThrows
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class<?> aClass = Class.forName("com.mz.springbootcore.annotation.Tests");
            Method[] methods = aClass.getMethods();
            for (int i = 0 ; i < methods.length; i ++) {
                Candy annotation = methods[i].getAnnotation(Candy.class);
                if(annotation != null) {
                    String name = annotation.name();
                    System.out.printf(name);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
