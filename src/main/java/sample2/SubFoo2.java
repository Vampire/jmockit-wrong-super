package sample2;

public class SubFoo2 extends Foo2 {
    public SubFoo2() {
        super(new Object());
    }

    public void ensureInvariant() {
        if (invariant != INVARIANT_B) {
            throw new AssertionError();
        }
    }
}
