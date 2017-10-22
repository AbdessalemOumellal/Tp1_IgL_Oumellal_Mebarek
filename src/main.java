/**
 * Created by ABDESSALEM on 13/10/2017.
 */
public class main {

    public static void main(String args[]) throws TailleException {
        VectorHelper tab = new VectorHelper(10);
        tab.ShowTAB();
        tab.Sort();
        tab.ShowTAB();
        tab.MinMax();
        tab.ShowMinMax();
        tab.InvTAB();
        tab.ShowTAB();
        tab.fonctionMult(2);
        tab.ShowTAB();
        tab.MinMax();
        tab.ShowMinMax();
        tab.Sommer(new int[] {4,8,12},new int[] {7,12,16});
        tab.ShowSum();

    }
}
