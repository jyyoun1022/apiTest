package org.codej.rest.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        /** Clsss 찾기
         * 클래스 Class 객체는 클래스 또는 인터페이스를 가리킵니다.
         * java.lang.Class 이며 import 없이 사용가능합니다.*/
        Class clazz = Child.class;
        // IDE에서 클래스를 알고 있다는 전제에 사용
        System.out.println("Class Name : "+clazz.getName());
        // 클래스를 참조할 수 없고 이름만 알고 있을 때 (패키지이름까지 적어줘야함)
        Class<?> clazz2 = Class.forName("org.codej.rest.Reflection.Child");
        System.out.println("Class name : "+clazz2.getName());

        /**
         * Constructor 찾기
         */
        Class<?> clazz3 = Class.forName("org.codej.rest.Reflection.Child");
        Constructor<?> constructor = clazz3.getDeclaredConstructor();
        System.out.println("Construcor : "+constructor.getName());
        Constructor<?>[] constructors = clazz3.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));
        // getDeclaredConstructor(ParaM)에 인자를 넣으면 그타입과 일치하는 생성자를 찾습니다.
        Constructor<?> incudeParamConstrucot = clazz3.getDeclaredConstructor(String.class);
        System.out.println("Constrcutor(String) : "+incudeParamConstrucot);

        /** Method 찾기
         */
        // 인자가 있는 메서드일 경우 해당 타입.class
        Class<?> clazz4 = Class.forName("org.codej.rest.Reflection.Child");
        Method method1 = clazz4.getDeclaredMethod("method4", int.class);
        System.out.println("Find out method4 method in Child: " + method1);

        // 인자가 없는 경우 에는 Null을 전달

        Class clazz5 = Class.forName("org.codej.rest.Reflection.Parent");
        Method method2 = clazz5.getDeclaredMethod("method3", null);

        /**
         * 메서드 호출
         * 클래스로부터 메서드 정보를 가져와, 객체의 메서드를 호추할 수 있습니다.
         * 메서드 객체를 생성했으면, Mehtod.invoke()로 호출할 수 있습니다.
         * 첫번쨰 인자는 호출하려는 객체이고, 두번째 인자는 전달할 파라미터값입니다.
         * 만약 메서드가 어떤 값을 리턴하려 한다면 그값을 받을 수 있습니다.
         */

        Child child = new Child();
        Class<?> clazz6 = Class.forName("org.codej.rest.Reflection.Child");
        Method method = clazz6.getDeclaredMethod("method5", int.class);
        int returnValue = (int) method.invoke(child, 10);
        System.out.println("result Value : "+ returnValue);

        Class<?> clazz7 = Class.forName("org.codej.rest.Reflection.Parent");
        Method method3 = clazz7.getDeclaredMethod("method1");
        method3.setAccessible(true);
        method3.invoke(child);


    }
}
