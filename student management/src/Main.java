import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
       
        StudentDAO sd = new StudentDAO();
        
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n----Student Management System------");
            System.out.println("1. AddStudent");
            System.out.println("2. View Students");
            System.out.println("3. Search student");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Count students");
            System.out.println("7. Highest marks student");
            System.out.println("8. Students above given marks");
            System.out.println("9. Average marks");
            System.out.println("10. Department wise students count");
            System.out.println("11. Exit");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Id:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Enter department:");
                    String department = sc.nextLine();

                    System.out.println("Enter marks:");
                    int marks = sc.nextInt();

                    Student s = new Student(id,name,department,marks);
                    sd.addStudent(s);
                    break;

                case 2:
                    sd.viewStudents();
                    break;

                case 3:
                    System.out.println("Enter student id for further processing..");
                    int searchId = sc.nextInt();
                    sd.searchStudent(searchId);
                    break;
               
                case 4:
                    System.out.println("Enter id you want to update:");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter name you want to update");
                    String updateName = sc.nextLine();

                    System.out.println("Enter department you want to update:");
                    String updateDepartment = sc.nextLine();

                    System.out.println("enter marks you want to update:");
                    int updateMarks = sc.nextInt();

                    Student updatedStudent = new Student(updateId,updateName,updateDepartment,updateMarks);
                    sd.updateStudent(updatedStudent);
                    break;

                case 5:
                    System.out.println("Enter student Id for futher processing..");
                    int deleteId = sc.nextInt();

                    sd.deleteStudent(deleteId);
                    break;

                case 6:
                    sd.countStudents();
                    break;

                case 7:
                    sd.highestMarksStudents();
                    break;

                case 8:
                    System.out.println("Enter the marks to see the students who scored above that:");
                    int searchMarks = sc.nextInt();

                    sd.studentAboveGivenMarks(searchMarks);
                    break;

                case 9:
                    sd.averageMarks();
                    break;

                case 10:
                    sd.departmentWiseStudentCount();
                    break;

                case 11:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
        
            }


            
        }

    }
}
   
