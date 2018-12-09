package by.ostroverhov.lesson10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException, InstantiationException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<Class<?>, RandomGenerator<?>> generators = new HashMap<>();
        generators.put(int.class, new IntGenerator());

        Class<Student> clazz = Student.class;
        Field[] fields = clazz.getDeclaredFields();
        Constructor<Student> defaultConstructor = clazz.getConstructor();
        Student student = defaultConstructor.newInstance();
        String nameField = "";
        Class<?> typeField = null;
        for (Field f:fields) {
            if (f.isAnnotationPresent(Generate.class)) {
                nameField = f.getName();
                typeField = f.getType();
            }
        }

        Method[] methods = clazz.getMethods();
        for (Method m:methods) {
            if (m.getName().startsWith("set") && m.getName().toLowerCase().endsWith(nameField)) {
                m.invoke(student, generators.get(typeField).execute());
            }
            System.out.println(student);
        }
    }
}
