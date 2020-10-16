import java.util.Scanner;

class Ex3RunningTally {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = 0;
       
        int t = 0;
        System.out.println("Let's add some numbers!  [Type a negative number to quit]");
        while (i >= 0) {
        System.out.print("Add: ");
        i = sc.nextInt();
        if (i >= 0) {
        t += i;
    }    
    }
    System.out.println("The total is " + t);
}
}