package sample3;

public class SubFoo3 extends Foo3 {
    public SubFoo3() {
        super(new Object(), new Object());
    }

    public void ensureInvariant() {
        if (invariant != INVARIANT_A) {
            throw new AssertionError();
        }
    }
}
