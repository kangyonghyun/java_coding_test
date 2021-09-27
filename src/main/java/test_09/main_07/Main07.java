package test_09.main_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main07 {

    static int[] unif;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); //도시
        int e = sc.nextInt(); //거리

        Main07.createArr(v);

        List<Edge> edges = Main07.createEdge(sc, e);

        Main07 main07 = new Main07();
        System.out.println(main07.solution(edges));

    }

    public static int find(int v) {
        if (v == unif[v]) return v;
        else return unif[v] = find(unif[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb)
            unif[fa] = fb;
    }

    public int solution(List<Edge> edges) {
        int answer = 0;
        Collections.sort(edges);

        for (Edge edge : edges) {
            int findCity1 = find(edge.getCity1());
            int findCity2 = find(edge.getCity2());
            if (findCity1 != findCity2) {
                answer += edge.getCost();
                union(edge.getCity1(), edge.getCity2());
            }
        }

        return answer;
    }

    public static void createArr(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        unif = arr;
    }

    public static List<Edge> createEdge(Scanner sc, int e) {
        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < e; i++) {
            int city1 = sc.nextInt();
            int city2 = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new Edge(city1, city2, cost));
        }
        return edges;
    }

}
