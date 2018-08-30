package JavaPro.Lesson_1;

import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class One {
    public static void main(String[] args) {
        SomeFakeClass sfk = new SomeFakeClass();
        Class<SomeFakeClass> ref = (Class<SomeFakeClass>) sfk.getClass();

        Method[] declaredMethods = ref.getDeclaredMethods();

        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
                try {
                    /*                    SomeFakeClass.printParameters(myAnnotation.parameter1(), myAnnotation.parameter2());*/
                    method.invoke(sfk, myAnnotation.parameter1(), myAnnotation.parameter2());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class SomeFakeClass {
    @MyAnnotation(parameter1 = -1, parameter2 = +1)
    public static void printParameters(int a, int b) {
        System.out.printf("The parameters are %d and %d", a, b);
    }
}

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
@interface MyAnnotation {
    int parameter1();

    int parameter2();
}