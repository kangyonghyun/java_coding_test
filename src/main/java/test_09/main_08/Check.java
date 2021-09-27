package test_09.main_08;

public class Check {

    private int[] ch;

    public Check(int n) {
        this.ch = new int[n];
    }

    public boolean checkZero(int n) {
        return ch[n] == 0;
    }

    public void setCheck(int n) {
        ch[n] = 1;
    }
}
