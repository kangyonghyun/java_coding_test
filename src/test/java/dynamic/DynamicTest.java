package dynamic;

import org.junit.jupiter.api.Test;
import dynamic.main_04.Brick;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class DynamicTest {

    @Test
    void 계단오르기_경우의수() {
        int n = 7;
        Dynamic dynamic = new Dynamic(n+1);
        assertThat(dynamic.numberOfCase()).isEqualTo(21);
    }

    @Test
    void 디딤돌건너기_경우의수() {
        int n = 7;
        Dynamic dynamic = new Dynamic(n + 2);
        assertThat(dynamic.numberOfCase()).isEqualTo(34);
    }

    @Test
    void 수열_최대길이() {
        int[] arr = new int[]{
                5, 3, 7, 8, 6, 2, 9, 4
        };
        Dynamic dynamic = new Dynamic(arr.length + 1);
        assertThat(dynamic.maxValue(arr)).isEqualTo(4);
    }

    @Test
    void 벽돌최대높이() {
        Brick brick1 = new Brick(25, 3, 4);
        Brick brick2 = new Brick(4, 4, 6);
        Brick brick3 = new Brick(9, 2, 3);
        Brick brick4 = new Brick(16, 2, 5);
        Brick brick5 = new Brick(1, 5, 2);
        List<Brick> bricks = Arrays.asList(brick1, brick2, brick3, brick4, brick5);
        Dynamic dynamic = new Dynamic(bricks.size());
        assertThat(dynamic.maxValue(bricks)).isEqualTo(10);
    }

}