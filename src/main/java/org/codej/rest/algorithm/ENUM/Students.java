package org.codej.rest.algorithm.ENUM;


public class Students {
        public String name;
        public int grande;
        public BrandName brand;

        public static void main(String[] args) {
//            Students student = new Students();
//            student.name = "윤재열";
//            student.grande = 7;
//            student.brand = BrandName.PUMA;
//            System.out.println("학생 이름 : "+ student.name);
//            System.out.println("학생 학년 : "+ student.grande);
//            System.out.println("선호하는 브랜드 : "+ student.brand);

            BrandName[] brandArr = BrandName.values();
            for (BrandName brandName : brandArr) {
                System.out.println(brandName.getName());
            }

//            BrandName nike = BrandName.valueOf("NIKdE");
//            BrandName nike2 = BrandName.NIKE;
//            System.out.println(nike);
//            System.out.println(nike2);



        }
}
