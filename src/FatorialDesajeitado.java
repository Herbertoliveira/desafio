import java.util.*;

public class FatorialDesajeitado {
    public static void main(String[] args) {
     

        int num = new Scanner(System.in).nextInt();
        int time = 0;
        int result = 0;

        List<Integer> listNum = new ArrayList<>();

        while (num >= 3) {
            time = num * (num - 1) / (num - 2);
            num -= 3;

            if (listNum.isEmpty()){
                listNum.add(time);
            }else{
                listNum.add(time*(-1)); 
            }                                
            listNum.add(num);
            num--;
        }

        if (num == 2){
            time = num * (num - 1);
            listNum.add(time*(-1));
             
        }else if (num == 1){
            listNum.add(num*(-1)); 
        }                                  

        for (int n : listNum) result+= n;

        System.out.println(result);
    }
}
