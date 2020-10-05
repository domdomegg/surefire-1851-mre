import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class ExampleTest {
    @Test
    public void aPassingTest() {
    }

    @Test
    public void run() {
        throw mock(RuntimeException.class);
    }
}
