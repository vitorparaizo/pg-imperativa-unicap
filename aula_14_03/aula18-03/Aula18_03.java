public class Aula18_03 {
    public static void main(String[] args) {

        


    
    }

    public static int busca(double[] v, double x) {
        for (int i = 0; i < v.length; i += 1) {
            if (v[i] == x) {
                return i;
        }
    }

    return -1;
}
}