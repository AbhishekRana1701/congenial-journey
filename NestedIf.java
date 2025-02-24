public class NestedIf {
    public static void main(String[] args) {
        int a = 18;
        double w = 65.3;
        if (a >= 18){
            if (w >= 50.0){
                System.out.println("Your are eligible to donate blood.");
            } else{    
                System.out.println("You must weight 50 kgs to donate blood.");
            } 
        } else {
                System.out.println("You must be above 18 to donate blood.");
            }
            
        }
    }
    

