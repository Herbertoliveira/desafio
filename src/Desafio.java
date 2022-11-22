import java.util.*;

public class Desafio {
  
  public static boolean ehPerfeito(int valor) {
        double raizQuadrada = Math.sqrt(valor);
        return ((int) raizQuadrada == raizQuadrada);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
      List<Integer> quadradosPerfeitos = new ArrayList<>();
      
      for (int i = 1; i <= n; i++) {
                if (ehPerfeito(i)) quadradosPerfeitos.add(0, i);
            }
            
            int valoresArr = quadradosPerfeitos.size();
            int result = n;

            for (int i = 0; i < valoresArr; i++) {

                int num = n;
                int count = 0;

                for (int j = i; j < valoresArr; j++) {
                    while((num - quadradosPerfeitos.get(j)) >= 0){
                        num -= quadradosPerfeitos.get(j);
                        count ++;
                    }
                }

                if (count < result) result = count;
            }


        System.out.println(result);
    }
}


        
   
      
       
    

