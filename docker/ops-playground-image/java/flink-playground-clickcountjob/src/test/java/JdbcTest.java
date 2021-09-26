import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JdbcTest {
    @Test
    public void jdbcDriverTest() throws ClassNotFoundException {
        Class<?> clazz =
                Class.forName("org.postgresql.Driver", true, Thread.currentThread().getContextClassLoader());
        assertNotNull(clazz);
    }
}