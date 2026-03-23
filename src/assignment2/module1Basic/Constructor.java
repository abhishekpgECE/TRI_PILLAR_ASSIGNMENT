package assignment2.module1Basic;

public class Constructor {
    String Name;
    int Id;
    String Role;
    int Salary;
    Constructor(String Name, int Id, String Role, int Salary){
        this.Name=Name;
        this.Id=Id;
        this.Role=Role;
        this.Salary=Salary;
    }
    void display(){
        System.out.println("Employee Details");
        System.out.println("Name: "+Name);
        System.out.println("Id: "+Id);
        System.out.println("Role: "+Role);
        System.out.println("Salary: "+Salary +"lacs");
    }

    public static void main(String[] args) {
        Constructor E1 = new Constructor("Abhi", 1, "Manager",2);
        Constructor E2 = new Constructor("Vasant kumar",2,"CEO",10);
        E1.display();
        E2.display();
    }
}
