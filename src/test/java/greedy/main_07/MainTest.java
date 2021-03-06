package greedy.main_07;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void find() {
        Main07.createArr(7);
        Main07.union(1, 3);
        Assertions.assertThat(Main07.find(1)).isEqualTo(3);
        Edge edge = new Edge(1, 2, 12);
    }

}
