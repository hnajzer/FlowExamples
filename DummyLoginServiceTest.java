import org.junit.Test;

import static org.junit.Assert.*;

public class DummyLoginServiceTest {
    @Test(expected = IllegalArgumentException.class)
    public void testLogin() {
            DummyLoginService dml = new DummyLoginService();
            dml.Login("", "");
        }

    @Test
    public void testLogin2() {
        DummyLoginService dml = new DummyLoginService();
        try {
            dml.Login("dsds", "");
        }
        catch (IllegalArgumentException e) {
            assertEquals("password should not be empty!", e.getMessage());
        }
    }
}