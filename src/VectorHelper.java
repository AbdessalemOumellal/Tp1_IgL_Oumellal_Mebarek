
import java.security.SecureRandom;
import java.util.Random;
import java.lang.*;

/**
 * Created by IZEM and OUMELLAL on 13/10/2017.
 */
public class VectorHelper {


    // Definitions des parametres

    public int[] getSum() {
        return Sum;
    }

    private int[] Sum;
    private int c=0 ;
    /**
     * Le vecteur sur lequel on effectue les opertations
     */

    private int Table[];


    /**
     * La valeur maximale qu'un element peut prendre
     */
    private final int elemMax = 99999;

    /**
     * Le maximum du vecteur
     */
    private int max;

    /**
     * Le minimum du vecteur
     */
    private int min;


    /**
     *  Constructeur tabled'un vecteur en lui affectant un autre
     *  @param table un vecteur exterieur a affecter directement
     */
    public VectorHelper(int[] table) {
        Table = table;
    }



    /**
     *  Constructeur d'un vecteur aleatoire en lui donnant la  taille
     *  @param n la taille du vecteur
     */
    public VectorHelper(int n)
            {
                Table = new int[n];
                Random rand = new Random();
                for (int i=0;i<n;i++)
                {
                    Table[i]= rand.nextInt(elemMax);
                }
        }

    /**
     * Afficher le minimum et le maximum du vecteur
     */
        public void ShowMinMax()
        {
            System.out.println("Min = "+min);
            System.out.println("Max = "+max);
        }

    /**
     * Afficher le vecteur
     */
        public void ShowTAB()
        {
            for(int i=0;i<Table.length;i++)
            {
                System.out.print(" | "+Table[i]);
            }
            System.out.print(" |");
            System.out.println("");
        }


    /**
     * Inverser le vecteur <br>
     * Exemple : Table = {4,5,6} Resultat: Table = {6,5,4} .
     */
        public void InvTAB() {
            int i = 0, j = Table.length - 1, n = Table.length;
            while (i <=(n / 2)-1) {
                int m = Table[i];
                Table[i] = Table[j];
                Table[j] = m;
                i++;
                j--;
            }
        }

    /**
     * Obtenir le minimum et le maximum d'un vecteur <br>
     * Exemple : Table = {4,5,6,18,3} Resultat: Min = 3 et Max = 18 .
     */
        public void MinMax()
        {
            int i=1;
            int ma = Table[0],mi=Table[0];
            while (i<Table.length)
            {
                if (Table[i]>=ma){ma=Table[i];}
                if (Table[i]<=mi){mi=Table[i];}
                i++;
            }
            max = ma;
            min = mi;
        }

    /**
     * Multiplier toutes les case * n <br>
     * Exemple : Table = {4,9,6,2,8} et n=3  Resultat: Table = {12,27,18,6,24}.
     * @param n Coefficient de la fonction
     */
        public void fonctionMult(int n)
        {
            for (int i=0;i<Table.length;i++)
            {
                Table[i] = Table[i]*n ;
            }
        }


    public int [] getTable() {return Table;}

    public int getmin() {return min;}

    public int getmax() {return max;}



    /**
     * This method to sort out v array elements.
     * @param v : array .
     * @param deb : indexes the element which needs to get sorted.
     * @param fin : indexes last element.
     */
    private void TriSelection(int v[],int deb, int fin) {
        int i = deb+1 ;
        while (deb<fin && i<v.length) {
            if(v[deb] > v[i]) {
                c = v[deb];
                v[deb] = v [i] ;
                v[i] = c ;
                i++;
            }
            else i++;
            if(i==v.length) {
                deb++;
                TriSelection(v,deb,fin);
            }
        }

    }

    /**
     * this method sorts array of the VectorHelper Array. <br>
     * Exemple : Table = {1000,20,29,7} Resultat: Table = {7,20,29,1000}.
     */
    public void Sort() {
        TriSelection(Table,0,Table.length-1);
    }


    /**
     * this method sums two Vectors if they have the same length, throws an exception else.<br>
     * Exemple : V1 = {4,5,6} ; V2 = {7,9,11}  Resultat: Table = {11,14,17}.
     * @param V1:Array .
     * @param V2: Array .
     * @return : the summed Array.
     * @throws TailleException
     */
    public void Sommer(int V1[], int V2[])  throws TailleException{

        if (V1.length != V2.length) throw new TailleException() ;
        else {
            Sum = new int[V1.length];
            for(int i=0;i<V1.length;i++) {
                Sum[i] = V1[i] + V2[i] ;
            }
        }
    }

    public void ShowSum()
    {
        for(int i=0;i<Sum.length;i++)
        {
            System.out.print(" | "+Sum[i]);
        }
        System.out.print(" |");
        System.out.println("");
    }


}
