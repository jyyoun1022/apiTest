package org.codej.rest.algorithm.ENUM;

public class EnumTest {
    private static final String MALE = "MALE";
    private static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1 = null;
        gender1 = EnumTest.MALE;
        gender1 = EnumTest.FEMALE;

        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

//        gender2 = "boy";

    }
}
enum Gender {
    MALE,FEMALE;
}
