package homework;

public class Report implements User{
     private final User user;
    private void report(){

    
    System.out.println("Report for user: " + name);
    }
   public Report(User user){
    this.user = user;
   } 
}
