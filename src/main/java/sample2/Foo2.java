package sample2;

import java.util.Objects;

public class Foo2 {
    public static final Object INVARIANT_A = new Object();
    public static final Object INVARIANT_B = new Object();

    public final Object invariant;

    public Foo2(Object parameter) {
        System.out.println("Constructor B");
        Objects.requireNonNull(parameter);
        this.invariant = INVARIANT_B;
    }

    public Foo2() {
        System.out.println("Constructor A");
        this.invariant = INVARIANT_A;
    }
}
