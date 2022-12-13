import java.util.Scanner;

//import Scanner

public class Chatbot {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nHello. What is your name?");
        //Pick up user's name and store it. 
        String name = sc.nextLine();
                           
        //add new a line before asking next question. 
        System.out.println("\nHi "+name+"! I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
         String home = sc.nextLine();               

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at "+home+"! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        //Pick up age and store it.
        int age = sc.nextInt();

        //add new a line before asking next question.
        System.out.println("\nSo you're "+age+", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm "+(400/age)+" times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        sc.nextLine();
        String language = sc.nextLine();

        //add new a line here.
        System.out.println(language + ", that's great! Nice chatting with you "+name+". I have to log off now. See ya!");
        
        //close scanner. 
        sc.close();
        
    }
}
