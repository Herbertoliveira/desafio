//import java.util.*;
import java.util.Scanner;

public class Matriz {
    public static void main(String args[]) {
          
     Scanner scanner = new Scanner(System.in);

        //System.out.println("Digite o tamanho do Array:");
        int tamanhoArray = scanner.nextInt();
        int [] nums = new int[tamanhoArray];
        int primeiroDoIndex = 0;

        //System.out.println("Digite os números do Array: ");
       
        for (int i = 0; i < tamanhoArray; i++) nums[i] = scanner.nextInt();

       
        for(int i = 0; i < tamanhoArray; i++) {
            if(nums[i] % 2 == 0) {
                int varAuxiliar = nums[primeiroDoIndex];
                nums[primeiroDoIndex] = nums[i];
                nums[i] = varAuxiliar;
                primeiroDoIndex++;
            }
        }

       
        for(int numero : nums) System.out.println(numero);
  }
}


// Passou no teste 