package test_09.main_08;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); //도시
        int e = sc.nextInt(); //거리
        Check ch = new Check(v + 1);

        List<List<Edge>> graph = getGraph(v);

        for (int i = 0; i < e; i++) {
            int city1 = sc.nextInt();
            int city2 = sc.nextInt();
            int cost = sc.nextInt();
            graph.get(city1).add(new Edge(city2, cost));
            graph.get(city2).add(new Edge(city1, cost));
        }

        System.out.println(Main08.solution(graph, ch));
    }

    // 결과값 반환
    public static int solution(List<List<Edge>> graph, Check ch) {
        int answer = 0;

        PriorityQueue<Edge> pQue = new PriorityQueue<>();
        pQue.offer(new Edge(1, 0));

        while (!pQue.isEmpty()) {
           Edge edge = pQue.poll();
            answer += edge.costCal(pQue, graph, ch);
        }

        return answer;
    }

    // graph 리스트 생성 후 반환
    public static List<List<Edge>> getGraph(int v) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }
        return graph;
    }

}
