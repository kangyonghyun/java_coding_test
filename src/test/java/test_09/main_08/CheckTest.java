package test_09.main_08;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CheckTest {

    @Test
    void 체크_제로() {
        Check check = new Check(3);
        assertThat(check.checkZero(0)).isTrue();
        assertThat(check.checkZero(1)).isTrue();
        assertThat(check.checkZero(2)).isTrue();
    }

    @Test
    void 체크_1_변경() {
        Check check = new Check(3);
        check.setCheck(0);
        assertThat(check.checkZero(0)).isFalse();
    }
}
