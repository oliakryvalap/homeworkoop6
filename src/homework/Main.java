package homework;

public class Main{
    private static void main(String[] args){
        User user = new User("Bob");
        Report report = new Report(user);
        SavePersister savepersister = new SavePersister(null);
        System.out.println();
         User.report();
         
    }

          
        
    }
