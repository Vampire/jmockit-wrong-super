package sample;

import mockit.Mocked;
import org.junit.Test;
import sample1.Bar1;
import sample1.Baz1;
import sample2.Bar2;
import sample2.Baz2;
import sample3.Bar3;
import sample3.Baz3;

public class ExampleTest {
    @Test
    public final void test1_1()
    {
        Baz1 baz1 = new Baz1();
        System.out.println("new sample1.Baz() = " + baz1);
        baz1.ensureInvariant();
    }

    @Test
    public final void test1_2(@Mocked Bar1 bar1)
    {
        System.out.println("bar1 = " + bar1);
        Baz1 baz1 = new Baz1();
        System.out.println("new sample1.Baz() = " + baz1);
        bar1.ensureInvariant();
        baz1.ensureInvariant();
    }

    @Test
    public final void test2_1()
    {
        Baz2 baz2 = new Baz2();
        System.out.println("new sample2.Baz() = " + baz2);
        baz2.ensureInvariant();
    }

    @Test
    public final void test2_2(@Mocked Bar2 bar2)
    {
        System.out.println("bar2 = " + bar2);
        Baz2 baz2 = new Baz2();
        System.out.println("new sample2.Baz() = " + baz2);
        bar2.ensureInvariant();
        baz2.ensureInvariant();
    }

    @Test
    public final void test3_1()
    {
        Baz3 baz3 = new Baz3();
        System.out.println("new sample3.Baz() = " + baz3);
        baz3.ensureInvariant();
    }

    @Test
    public final void test3_2(@Mocked Bar3 bar3)
    {
        System.out.println("bar3 = " + bar3);
        Baz3 baz3 = new Baz3();
        System.out.println("new sample3.Baz() = " + baz3);
        bar3.ensureInvariant();
        baz3.ensureInvariant();
    }
}
