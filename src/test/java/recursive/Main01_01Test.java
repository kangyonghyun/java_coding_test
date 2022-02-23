package recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Main01_01Test {

    @Test
    void DFS() {
        int input = 3;
        assertThat(Main01.solution(new int[input], input)).containsExactly(1, 2, 3);
        assertThat(Main01.solution(new int[input], input)).hasSize(3);
    }

}