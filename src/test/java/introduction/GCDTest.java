package introduction;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GCDTest {
    private GCD gcd = new GCD();

    @Test
    public void shouldReturnGCD() {
        assertThat(gcd.findGCD(60, 96), is(12));
        assertThat(gcd.findGCD(8, 20), is(4));
    }
}
