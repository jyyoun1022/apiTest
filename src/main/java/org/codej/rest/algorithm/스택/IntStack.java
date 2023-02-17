package org.codej.rest.algorithm.스택;

public class IntStack {
    private int max;    // 스택용량
    private int ptr;    // 스택 포인터
    private int[] stack;// 스택 본체

    //실행 시 예외 : 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }
    //실행 시 예외 : 스택이 가득참
    public class OverflowStackException extends RuntimeException {
        public OverflowStackException(){}
    }

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stack = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // 스택에 x를 푸쉬
    public int push(int x) throws OverflowStackException {
        if  (ptr >= max) {
            throw new OverflowStackException();
        }
        return stack[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr < 0) {
            throw new EmptyIntStackException();
        }
        return stack[--ptr];
    }
    // 스택에서 정상에 있는 데이터를 들여다봄.
    public int peak() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stack[ptr - 1];
    }
    public int indexOf(int x) {
        for (int i = ptr -1; i>=0; i--) {
            if (stack[i] == x)
                return i;
        }
        return -1;
    }
    public void clear() {
        ptr = 0;
    }
    public int capacity() {
        return max;
    }
    public int size() {
        return ptr;
    }
    public boolean isEmpty() {
        return ptr <= 0;
    }
    public boolean isFull() {
        return ptr >= max;
    }

    // 스택의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비었습니다.");
        } else {
            for(int i=0; i<ptr; i++) {
                System.out.printf(stack[i] +" ");
                System.out.println();
            }

        }
    }


}
