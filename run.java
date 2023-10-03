public class run{
    public static void main(String[] args){
        x.println("Welcome to XYZ");
        x.println("==============");
        x.println("1 - Student");
        x.println("2 - Teacher");
        x.println("3 - Class Room");
        x.println("4 - Exam");
        String ch = x.input("select your Choice ?");

        switch(ch) {
            case "1":
                x.println("you selected Student");
                break;
            case "2":
                x.println("you selected Teacher");
                break;
            case "3":
                x.println("you selected Class Room");
                break;
            case "4":
                x.println("you selected Exam");
                break;
            default:
            x.println("Invalid Choice");
            main(new String[] {});
            break;
        }
    }
        

}