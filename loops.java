/**
 * loops
 */
public class loops {

    public static void main(String[] args) {
        
        int val = 0;
        int [] count = {1,2,3,4,5};
        
        System.out.println("This is Normal-For");
        for (int i = 0; i < count.length; i++) {

            System.out.println(i);
        }

        System.out.println("This is While");
        while (val < 5){

            System.out.println(val);
            val++;
        }

        System.out.println("This is Do-While");
        do{
            System.out.println("This is do-while val : "+val);
            val++;
        }
        while (val < 4);

        System.out.println("This is ForEach / EnhancedFor");
        for(int i : count){
            System.out.print(i+" ");
        }

    }
    
}