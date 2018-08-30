package JavaPro.Lesson_1;

/*
Created by matua on 28.08.2018 at 19:45
*/

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Three {
    public static void main(String[] args) throws IllegalAccessException {
        SampleClass sc = new SampleClass("Hello!", 5, 5.5);

        String serialized = serialize(sc);
        System.out.println("serialized = " + serialized);

        sc = deserialize(serialized, SampleClass.class);
        System.out.printf("sc.getText(): %s\nsc.getA(): %d\nsc.getB(): %.1f", sc.getText(), sc.getA(), sc.getB());
    }

    public static String serialize(Object object) throws IllegalAccessException {
        StringBuilder result = new StringBuilder();

        Class<?> cls = object.getClass();

        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Save.class)) {
                field.setAccessible(true);

                result.append(field.getName()).append("=");

                if (field.getType().equals(int.class)) {
                    result.append(field.getInt(object));
                } else if (field.getType().equals(double.class)) {
                    result.append(field.getDouble(object));
                } else if (field.getType().equals(String.class)) {
                    result.append((String) field.get(object));
                }
                result.append(";");
            }
        }
        return result.toString();
    }

    public static <T> T deserialize(String serialized, Class<T> cls) {
        T result = null;
        try {
            result = cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        String[] fields = serialized.split(";");

        Map<String, String> fieldsMap = new HashMap<>();

        for (String field : fields) {
            String[] parts = field.split("=");
            fieldsMap.put(parts[0], parts[1]);
        }


        T finalResult = result;
        fieldsMap.forEach((a, b) -> {
            try {
                Field field = cls.getDeclaredField(a);
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(Save.class)) {
                        if (field.getType().equals(int.class)) {
                            field.setInt(finalResult, Integer.parseInt(b));
                        } else if (field.getType().equals(double.class)) {
                            field.setDouble(finalResult, Double.parseDouble(b));
                        } else if (field.getType().equals(String.class)) {
                            field.set(finalResult, b);
                        }
                    }
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        return finalResult;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Save {

}

class SampleClass implements Serializable {
    @Save
    private String text;
    private int a;
    @Save
    private double b;

    public SampleClass() {
    }

    public SampleClass(String text, int a, double b) {
        this.text = text;
        this.a = a;
        this.b = b;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}