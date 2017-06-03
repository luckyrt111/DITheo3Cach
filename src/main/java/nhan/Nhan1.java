package nhan;

/**
 * Created by DELL on 06/03/17.
 */
public class Nhan1 {
    private Nhan2 n2;

    public Nhan1(Nhan2 n2) {
        this.n2 = n2;
    }

    public int nhan(int a, int b){
        return n2.nhan(a,b);
    }
}
