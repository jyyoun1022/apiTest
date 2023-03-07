package org.codej.rest.algorithm.클래스;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ReferenceTest {
    public static void main(String[] args) {
        ProductService codej = new ProductService("재열");
        System.out.println("codej1 = " + codej);
        System.out.println("codej.name = " + codej.name);//재열
        ProductService codej2 = changeReference(codej);

        System.out.println("==============");
        System.out.println(codej == codej2); // false
        System.out.println("==============");

        System.out.println("codej3 = " + codej);
        System.out.println("codej.name = " + codej.name); //재열
    }
    static ProductService changeReference(ProductService codej){
        codej = new ProductService("재민");
        System.out.println("codej2 = " + codej);
        System.out.println("codej.name = " + codej.name); // 재민
        return codej;
    }
}
@NoArgsConstructor
@AllArgsConstructor
@Setter
class ProductService {
    public String name;

    public static void main(String[] args) {
        ProductService codej = new ProductService("name");
        codej.setName("namdmdmdmdmdmd");


        System.out.println("codej = " + codej.name);

    }
}


class ReferenceTest2{
    public static void main(String[] args) {
        ProductService codej = new ProductService("재열");
//        System.out.println("codej = " + codej);
        System.out.println("codej.name = " + codej.name);//1 재열
        changeReference2(codej);
//        System.out.println("codej = " + codej);
        System.out.println("codej.name = " + codej.name);//3 미미

    }
    static void changeReference2(ProductService codej){
//        System.out.println("codej = " + codej);
        System.out.println("codej.name = " + codej.name);//2 재열
        codej.setName("미미");
    }
}
