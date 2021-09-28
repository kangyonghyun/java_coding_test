package test_10.main_04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import test_10.Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BrickTest {

    @Test
    void brick() {
        Brick brick1 = new Brick(25, 3, 4);
        Brick brick2 = new Brick(4, 4, 6);
        Brick brick3 = new Brick(9, 2, 3);
        Brick brick4 = new Brick(16, 2, 5);
        Brick brick5 = new Brick(1, 5, 2);
        List<Brick> bricks = Arrays.asList(brick1, brick2, brick3, brick4, brick5);
        Dynamic dynamic = new Dynamic(bricks.size(), bricks.get(0).getHeight());
        Assertions.assertThat(dynamic.maxValue(bricks)).isEqualTo(10);
    }

}