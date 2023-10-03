/**
 * run
 */
public class run {

    public static void main(String[] args) {
        
        mainmenu();

    }

    public static void mainmenu(){
         
        student stu = new student(0, null, null);

        x.println("Welcome To Muslih Pvt(Ltd)");
        x.println("__________");
        x.println("01- Student");
        x.println("02- Teacher");
        x.println("03- Class Room");
        x.println("04- Exam");
        String ans=x.input("Select Your Choice:");

        switch (ans) {
            case ("01"):

            x.println("You Selected Student");
            stu.menu();
            
    
                
                break;
            case ("02"):

            x.println("You Selected Teacher");
            
    
                
                break;
            case ("03"):

            x.println("You Selected Class Room");
    
                
                break;
            case ("04"):

            x.println("You Selected Exam");
    
                
                break;
        
            default:
            x.println("Invalid Choice");
                break;
        }
    }
}