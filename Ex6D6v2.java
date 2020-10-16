import java.util.Scanner;

class Ex6D6v2 {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        int dice;
        int damage = 0;
        int total = 0;
        //2. get user input
        
        System.out.println("How many dices do you want to roll?");
        dice = sc.nextInt();
        
        while (dice > 0) {
          damage = (int) (Math.random()*6) + 1;  
          total += damage;
          dice --;
          System.out.println("You rolled a " + damage);
        }
        System.out.println("Total:" + total);
        
        
        //3. calculate and display answer
        
}
}