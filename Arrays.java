import java.util.*;
public class Arrays {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];
        //type 1
        // marks[0] = 97; //phy
        // marks[1] = 98; //chem
        // marks[2] = 95; //eng

        //type 2
        // int[] marks ={97,98,95};

        for(int i=0; i<10; i++){
            System.out.println(number[i]);
        }

    }
    
}
