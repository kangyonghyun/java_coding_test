package part09.main08;

public class Check {

    private int[] ch;

    public Check(int v) {
        ch = new int[v + 1];
    }

    public Check(int[] ch) {
        this.ch = ch;
    }

    public boolean check(int vex) {
        return ch[vex] == 0;
    }

    public void setCheck(int vex) {
        ch[vex] = 1;
    }

}
