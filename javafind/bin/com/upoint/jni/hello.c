#include <stdio.h>
#include <stdlib.h>
#include <jni.h>//必须添加的头文件

jint JNICALL Java_com_upoint_jni_MyNativeInterface_add
  (JNIEnv *env, jobject obj, jint a, jint b){
	return a+b+10000;
}

jstring JNICALL Java_com_upoint_jni_MyNativeInterface_getName
  (JNIEnv *env, jobject obj){
	return "jni test";
}
