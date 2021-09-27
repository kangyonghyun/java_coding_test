package test_09.main_08;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.PriorityQueue;

import static org.assertj.core.api.Assertions.*;

public class EdgeTest {

    @Test
    void 큐_edge객체_저장() {
        Main08 main08 = new Main08();
        List<List<Edge>> graph = main08.getGraph(5);
        Check ch = new Check(6);
        Edge edge = new Edge(1, 0);
        PriorityQueue<Edge> pQue = new PriorityQueue<>();
        pQue.offer(edge);

        assertThat(edge.costCal(pQue, graph, ch)).isEqualTo(0);
        assertThat(ch.checkZero(0)).isTrue();
        assertThat(pQue.poll()).isEqualTo(new Edge(1, 0));
    }

}
