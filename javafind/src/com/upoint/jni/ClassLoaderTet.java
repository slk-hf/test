package com.upoint.jni;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ClassLoaderTet extends ClassLoader {

    private String path = "";
    
    private String name = "";

    private String suffix = ".class";

    private ClassLoader classloader = null;

    public ClassLoaderTet(String path) {
        this.path = path;
    }
    public ClassLoaderTet(String path,String name) {
        this.path = path;
        this.name = name;
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        new ClassLoaderTet("E:\\work\\works\\").findClass("com.upoint.jni.User");
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if(name == null || name.equals(""))
        {
            name = this.name;
        }
        byte[] b = loadClassData(name);
        if (b != null && b.length > 0) {
            return defineClass(name, b, 0, b.length);
        }
        return super.findClass(name);
    }

    private byte[] loadClassData(String name) {
        name = name.replace(".", "\\");
        String clazzName = path + name + suffix;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        byte[] bytes = new byte[0];
        int i = 0;
        try {
            is = new FileInputStream(new File(clazzName));
            baos = new ByteArrayOutputStream();
            while (-1 != (i = is.read())) {
                baos.write(i);
            }
            bytes = baos.toByteArray();
        } catch (Exception e) {
            // log e
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (baos != null) {
                    baos.close();
                }
            } catch (Exception e) {
                // log e
            }
        }
        return bytes;
    }
}
