package org.codej.rest.algorithm;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Comparator;

public class CompareInterface {


}
class ClassName implements Comparable<Object> {
    /** 자기자신과 매개변수 객체를 비교
     * CLassName으로 생성한 객체 자신이 되고,
     * ClassName.compareTo(o)를 통해 들어온 파라미터 o가 비교할 객체가 되는 것*/
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

@NoArgsConstructor
@AllArgsConstructor
class Student implements Comparable<Student> {
    public int age;         //나이
    public int classNumber; // 학급

    @Override
    public int compareTo(Student o) {

        try {
//            int result = 0;
//            if (this.age > o.age) {
//                result = this.age - o.age;
//            } else if (this.age == o.age) {
//                result = 0;
//            } else if (this.age < o.age) {
//                result = this.age - o.age;
//            }
            return this.age-o.age;
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
        return 0;
        // return this.age - o.age 하면 끝!
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student a = new Student(Integer.MAX_VALUE, 2);
        Student b = new Student(Integer.MIN_VALUE, 1);

        int isBig = a.compareTo(b);

        if (isBig > 0) {
            System.out.println("a 객체가 b 객체보다 크다");
        } else if (isBig == 0) {
            System.out.println("a 객체가 b 객체와 같다");
        } else {
            System.out.println("a 객체가 b 객체보다 작다.");
        }
    }
}

class ClassName2 implements Comparator<Object> {
    /** java.lang 패키지가 아니므로 import가 필요하다. */
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

@NoArgsConstructor
@AllArgsConstructor
class Student2 implements Comparator<Student2> {
    public int age;
    public int classNumber;

    @Override
    public int compare(Student2 o1, Student2 o2) {
//        if (o1.clasNumber > o2.clasNumber) {
//            return 1;
//        } else if (o1.clasNumber == o2.clasNumber) {
//            return 0;
//        } else {
//            return -1;
//        }
         return o1.classNumber - o2.classNumber;
    }
}

class Student2Test {

    public static void main(String[] args) {
        Student2 a = new Student2(17, 2);
        Student2 b = new Student2(18, Integer.MIN_VALUE);
        Student2 c = new Student2(5, 3);

        int isBig = a.compare(b,c);

        if (isBig > 0) {
            System.out.println("b 객체가 c 객체 보다 크다.");
        } else if (isBig == 0) {
            System.out.println("b 객체가 c 객체와 같다..");
        } else {
            System.out.println("b 객체가 c 객체 보다 작다..");
        }
    }
}

class AnonymousCLassTest {
    public static void main(String[] args) {

        //익명객체 구현 방법 1
        Comparator<Student2> comp1 = new Comparator<>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.classNumber - o2.classNumber;
            }
        };
        // 익명 객체 구현 방법 2
         Comparator<Student2> com2 = new Comparator<>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.classNumber - o2.classNumber;
            }
        };

    }

}
