package sample;

import mockit.Mocked;
import org.junit.Test;

import javax.faces.context.PartialResponseWriter;
import javax.faces.context.ResponseWriterWrapper;

public class WriterTest {
    @Mocked
    private PartialResponseWriter writer;

    @Test
    public final void testRegularUrl()
    {
        new TestResponseWriter();
    }

    private static class TestResponseWriter extends ResponseWriterWrapper
    {
    }
}
