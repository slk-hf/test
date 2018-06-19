package com.upoint.jni;

public class Men {

    private int age = 0;
    
    private static Men m = null;
    
    public Men(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public static Men getInstance() {
        if(m == null) {
            m = new Men(20);
        }
        return m;
    }
    public void showage() {
        System.out.println(this.getAge());
    }
    public static void showtoString(Men men) {
        System.out.println(men.toString());
    }
}
