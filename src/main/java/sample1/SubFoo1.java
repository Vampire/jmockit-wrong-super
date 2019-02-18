package sample1;

public class SubFoo1 extends Foo1 {
    public void ensureInvariant() {
        if (invariant != INVARIANT_A) {
            throw new AssertionError();
        }
    }
}
