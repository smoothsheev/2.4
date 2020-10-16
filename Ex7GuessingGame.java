import java.util.Scanner;

class Ex7GuessingGame {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        int random;
        int x = 1;
        int guess;
        //2. get user input
        
        System.out.println("Number Guessing Game");
        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        random = (int)(Math.random() * 100);
        
        while (x > 0) {
            System.out.println("What is your guess?");
            guess = sc.nextInt();
            x++;
            if (guess == random) {
            
            System.out.println("Correct!  It only took " +  x + " tries.");
            x = -1;
            } else if (guess > random) {
            System.out.println("Too high.  Try again");  
            } else if (guess < random) {
            System.out.println("Too low.  Try again");     
            }
            
            
                
            
            
        }
                //3. calculate and display answer
        
}
}
