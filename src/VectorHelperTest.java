import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ABDESSALEM on 18/10/2017.
 */
public class VectorHelperTest {
    @Test
    public void TESTinvTAB() throws Exception {
        VectorHelper VECT = new VectorHelper(new int[]{1,2,3});
        int[] test = new int[]{3,2,1};
        VECT.InvTAB();
        for (int i=0;i<=(VECT.getTable().length-1);i++)
        {
            assertEquals("message",test[i],VECT.getTable()[i]);
        }
    }

    @Test
    public void TESTminMax() throws Exception {
        VectorHelper VECT = new VectorHelper(new int[]{1,2,3});
        VECT.MinMax();
        assertEquals("message",1,VECT.getmin());
        assertEquals("message",3,VECT.getmax());
    }

    @Test
    public void TESTfonctionMult() throws Exception {
        VectorHelper VECT = new VectorHelper(new int[]{1,2,3});
        int[] test = new int[]{2,4,6};
        VECT.fonctionMult(2);
        for (int i=0;i<=(VECT.getTable().length-1);i++)
        {
            assertEquals("message",test[i],VECT.getTable()[i]);
        }
    }

    @Test
    public void TESTsort() throws Exception {
        VectorHelper VECT = new VectorHelper(new int[]{2,1,3});
        int[] test = new int[]{1,2,3};
        VECT.Sort();
        for (int i=0;i<=(VECT.getTable().length-1);i++)
        {
            assertEquals("message",test[i],VECT.getTable()[i]);
        }

    }

    @Test
    public void TESTsommer() throws Exception {
        VectorHelper VECT = new VectorHelper(new int[]{1,2,3});
        int[] test = new int[]{5,10,17};
        int[] vec1 = new int[]{1,2,3};
        int[] vec2 = new int[]{4,8,14};
        VECT.Sommer(vec1,vec2);
        for (int i=0;i<=(VECT.getSum().length-1);i++)
        {
            assertEquals("message",test[i],VECT.getSum()[i]);
        }

    }

}