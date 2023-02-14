package org.codej.rest.algorithm.클래스;

import lombok.Getter;

public class Chapter3C {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println(a.getId());
        System.out.println(b.getId());
        System.out.println(Id.getCount());

    }
}

@Getter
class Id {
    private static int count = 0; //아이디를 몇개 부여했는지 저장
    private int id; //아이디

    public Id() {
        this.id = ++count;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }
}
