import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        affichetab();
    }
    public static void  affichetab() {
    int tab[] = {2,3,4,3,7,4,2};
    int tabResult[] = new int[tab.length];
            for (int i=0; i<tab.length; i++){
                for (int j = i + 1 ; j < tab.length; j++) {
                    if (tab[i]==(tab[j])) {
                        tabResult[i]=tab[i];
                        /*tabResult.add(tab[i]);
                        tabResult=Arrays.copyOf(tab,tab[i]);*/
                    }
                }
            }
        System.out.println(Arrays.toString(tabResult));
    }
}
