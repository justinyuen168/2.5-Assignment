import java.util.Scanner;
 
class question7 { 
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int roll = 0;
    int side = 0;
    int diceroll = 0;
    int total   = 0; 
    String ans = "y";
    
    while (ans.equals("y")) {
     System.out.println("How many you want to roll");
     roll = sc.nextInt();
     System.out.println("How many sides does your dice have?");
     side =  sc.nextInt();
     System.out.println("");
     
     total = 0;

     for (int i = 0; i < roll; i++) {
                diceroll = rolldice(side);
                total = total + diceroll;
                System.out.print(diceroll + " ");
            }
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            System.out.print("Again? [y,n] ");
            ans = sc.next();
            System.out.println("");            
    }
}
 public static int rolldice(int s) { 
        return (int) (Math.random()*s)+1;
    }
    
}