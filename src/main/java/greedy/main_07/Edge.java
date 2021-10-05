package greedy.main_07;

class Edge implements Comparable<Edge> {

    private int city1;
    private int city2;
    private int cost;

    public Edge(int city1, int city2, int cost) {
        this.city1 = city1;
        this.city2 = city2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }

    public int getCity1() {
        return city1;
    }

    public void setCity1(int city1) {
        this.city1 = city1;
    }

    public int getCity2() {
        return city2;
    }

    public void setCity2(int city2) {
        this.city2 = city2;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
