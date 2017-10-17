import java.util.Random;

/**
 * Created by ABDESSALEM on 13/10/2017.
 */
public class VectorHelper {

    /**
     * Le vecteur sur lequel on effectue les opertations
     */

    private int Table[];

    /**
     * La valeur maximale qu'un element peut prendre
     */
    private final int elemMax = 100;

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
     * Exemple : Table = {4,5,6} Resultat: Table = {6,5,4}
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
     * Exemple : Table = {4,5,6,18,3} Resultat: Min = 3 et Max = 18
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
     * Exemple : Table = {4,9,6,2,8} et n=3  Resultat: Table = {12,27,18,6,24}
     * @param n Coefficient de la fonction
     */
        public void fonctionMult(int n)
        {
            for (int i=0;i<Table.length;i++)
            {
                Table[i] = Table[i]*n ;
            }
        }

}
