package greedy.main_08;

import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge> {

    private int vex;
    private int cost;

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }

    // 큐를 이용한 비용 계산
    public int costCal(PriorityQueue<Edge> pQue, List<List<Edge>> graph, Check ch) {
        if (ch.checkZero(vex)) {
            for (Edge edge : graph.get(vex)) {
                edge.queOffer(pQue, ch);
            }
            ch.setCheck(vex);
            return cost;
        }
        return 0;
    }

    // 큐에 edge 객체 저장
    private void queOffer(PriorityQueue<Edge> pQue, Check ch) {
        if (ch.checkZero(vex)) {
            pQue.offer(new Edge(vex, cost));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return vex == edge.vex && cost == edge.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vex, cost);
    }
}