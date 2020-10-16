import java.util.Scanner;

class Ex4Bar {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int l = 0; //length
        String c = ""; //bar char       
        System.out.println("What character do you want your bar to be made of?");
        c = sc.next();
        System.out.println("How long do you want your bar?");
        l = sc.nextInt();       
        System.out.println("Here's your bar!");  
        //make bar
        for (int x = 0; x < l; x++) {
            System.out.print(c);
            
        }   
}
}
