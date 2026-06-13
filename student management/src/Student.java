public class Student{
    private int id;
    private String name;
    private String department;
    private int marks;

    Student(int id,String name,String department,int marks){
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public int getMarks(){
        return marks;
    }

    public String toString(){
        return ("Id: "+id+ "Name: "+name + "Department: "+department+ "Marks: "+marks);
    }
}

