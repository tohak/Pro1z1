package com.Konovalov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
	Class<?> aClass=Operation.class;
        Method[]methods=aClass.getMethods();

        for (Method element: methods ) {
            if (element.isAnnotationPresent(MyAnnotations.class)) {
                MyAnnotations annotations=element.getAnnotation(MyAnnotations.class);
                int resultat= 0;
                try {
                    resultat = (int) element.invoke(null, annotations.a(), annotations.b());
                } catch (IllegalAccessException|InvocationTargetException e) {
                    e.printStackTrace();
                }
                System.out.println(resultat);
            }
        }
    }

}
