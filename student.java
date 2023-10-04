public class student {

    private int id;
    private String name,mobile;

    public student(){
        
    }


    public student(int _id , String _name , String _mobile){

        id = _id;
        name = _name;
        mobile = _mobile;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getMobile() {
        return mobile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public void menu (){
        x.println("Home>Student");
        x.println("Create New Student");
        x.println("Update Existing Studnet");
        x.println("Delete Studnet By Student ID");
        x.println("Search Student By ID");
        x.println("Get Student By ID");
        x.println("Display All Students");
        x.println("Exit");

        String ch = x.input("What is our Choies ?");

        switch (ch) {
            case ("01"):
                CreateNewStudent();
                break;
        
            case ("02"):
                updatestudent();
                break;

            case ("07"):
                Displayall();
                break;


            default:
                break;
        }

    }

    public void CreateNewStudent(){
        x.println("/n");
        int _id = x.inputint("Enter the Student ID:");
        String _name = x.input("Enter the Student Name:");
        String _mobile = x.input("Enter the Student Mobile No:");

        DB.student.add(new student(_id, _name, _mobile));
        x.println("Student Inserted Successfully...");

        String ch = x.input("Do You Want to Continue y/n");

        if(ch.equals("y") || ch.equals("yes")){
            CreateNewStudent();
        } else {
            menu();
        }
    }

    public void updatestudent(){
        int id =x.inputint("Enter the Student Id To Find: ");

        student findstudent = null;

        for(student student : DB.student){

            if(student.getId() == id){
                findstudent = student;
                break;
            }

        }

        if(findstudent == null){
            x.println("Invalid Id");
            updatestudent();
        } else{
            x.println("Student Found...");
            String name = x.input("Enter the Student Name: ");
            String mobile = x.input("Enter the Student Mobile: ");

            findstudent.setId(id);
            findstudent.setName(name);
            findstudent.setMobile(mobile);

            x.println("Data Updated");
            Displayall();
            menu();
        }

    }

    public void Displayall() {

        for(student s : DB.student){
            x.println(s.toString());
        }

    }

    public String tostring(){
        return "Id:"+id + "name" +name + "mobile" + mobile ;
    }
    
}