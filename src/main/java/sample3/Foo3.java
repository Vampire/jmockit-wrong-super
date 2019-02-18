package sample3;

import java.util.Objects;

public class Foo3 {
    public static final Object INVARIANT_A = new Object();
    public static final Object INVARIANT_B = new Object();

    public final Object invariant;

    public Foo3(Object parameter) {
        System.out.println("Constructor B");
        Objects.requireNonNull(parameter);
        this.invariant = INVARIANT_B;
    }

    public Foo3(Object parameter1, Object parameter2) {
        System.out.println("Constructor A");
        Objects.requireNonNull(parameter1);
        Objects.requireNonNull(parameter2);
        this.invariant = INVARIANT_A;
    }
}
