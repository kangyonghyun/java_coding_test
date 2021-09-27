import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import part09.main08.Check;

public class EdgeTest {

    @Test
    void check() {
        Check ch = new Check(new int[]{0, 1});
        Assertions.assertThat(ch.check(0)).isTrue();
        Assertions.assertThat(ch.check(1)).isFalse();
    }
}
