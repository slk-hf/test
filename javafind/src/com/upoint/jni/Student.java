package com.upoint.jni;

public class Student extends User {

    public Student() {
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        String clazz = new Student().getClass().getSuperclass().getName();
        Class<?> forName = Class.forName(clazz);
        try {
            User newInstance = (User)forName.newInstance();
            
            
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(clazz);
    }
    
}
