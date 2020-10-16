import java.util.Scanner;

class Ex5Triangle {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = 0; //height
        String c = ""; //bar char       
        System.out.println("What character do you want your triangle to be made of?");
        c = sc.next();
        System.out.println("How tall do you want your triangle?");
        h = sc.nextInt();       
        System.out.println("Here's your triangle!");  
        //make triangle
        for (int x = 0; x <= h; x++) {
            for (int y = 0; y < x; y++) {
            System.out.print(c);
        }
        System.out.println("");
        }   
}
}
