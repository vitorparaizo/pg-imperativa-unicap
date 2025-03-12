import java.util.Random;

public class Aula11_03 {
    public static Random geradorAleat = new Random();
    public static void main(String[] args) {
        for (int i = 1; i < 10; i+= 1) {

            int aleatorio = geradorAleat.nextInt(6) + 1;
            
            System.out.println(aleatorio);
        }
    }
    
}
