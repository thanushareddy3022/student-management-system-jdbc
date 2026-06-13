import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO{


    public void addStudent(Student s){
        String query = "INSERT INTO students(id,name,department,marks) VALUES(?,?,?,?)";

       try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ps.setInt(1,s.getId());
        ps.setString(2,s.getName());
        ps.setString(3,s.getDepartment());
        ps.setInt(4,s.getMarks());

        int rowsAffected = ps.executeUpdate();

        if(rowsAffected > 0){
            System.out.println("Student added succesfully");
        }else{
            System.out.println("Student not added");
        }

        ps.close();
        conn.close();

       }catch(SQLException e){
        System.out.println(e.getMessage());
       }
  
    }


public void viewStudents(){
     String query = "SELECT * FROM students";

     try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            System.out.println(rs.getInt("id")+" "
                            +rs.getString("name")+" "
                            +rs.getString("department")+" "
                            +rs.getInt("marks")+" ");
        }

        rs.close();
        ps.close();
        conn.close();

     }catch(SQLException e){
        System.out.println(e.getMessage());
     }
}

public void searchStudent(int id){
    String query = "SELECT * FROM students WHERE id = ?";
    

    try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ps.setInt(1,id);
        
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            System.out.println(rs.getString("name")+" "
                               +rs.getString("department")+" "
                               +rs.getInt("marks")+" ");
        }else{
            System.out.println("Student not found");
        }

        rs.close();
        ps.close();
        conn.close();

    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}


public void updateStudent(Student s){
    String query = "UPDATE students SET name = ?,department = ?,marks = ? WHERE id = ?";

    try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);


        ps.setString(1,s.getName());
        ps.setString(2,s.getDepartment());
        ps.setInt(3,s.getMarks());
        ps.setInt(4,s.getId());

        int rowsAffected = ps.executeUpdate();

        if(rowsAffected > 0){
            System.out.println("Data updated succesfully");
        }else{
            System.out.println("Data not updated");
        }

        
        ps.close();
        conn.close();
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}
public void deleteStudent(int id){
    String query = "DELETE FROM students WHERE id = ?";

    try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ps.setInt(1,id);

        int rowsAffected = ps.executeUpdate();

        if(rowsAffected > 0){
            System.out.println("Student with id "+id+" deleted succesfully");
        }else{
            System.out.println("Student not deleted");
        }

        
        ps.close();
        conn.close();

    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}

public void countStudents(){
    String query = "SELECT COUNT(*) AS total_students FROM students";

    try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            int count = rs.getInt(1);
            System.out.println("Total Students: "+count);
        }

        rs.close();
        ps.close();
        conn.close();

    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}

public void highestMarksStudents(){
    String query = "SELECT * FROM students ORDER BY marks DESC LIMIT 1";

    try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("Top Student "+rs.getString("name")+" "
                               +rs.getString("department")+" "
                               +rs.getInt("marks")+" ");
        }

        rs.close();
        ps.close();
        conn.close();
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}


public void studentAboveGivenMarks(int marks){
    String query = "SELECT name,marks FROM students WHERE marks > ?";

    try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ps.setInt(1,marks);

        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            System.out.println(rs.getString("name")+" "
                               +rs.getInt("marks")+" ");
            System.out.println();
        }

        rs.close();
        ps.close();
        conn.close();

    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}

public void averageMarks(){
    String query = "SELECT AVG(marks) AS avg_marks FROM students";

    try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            double avg = rs.getDouble(1);
            System.out.println("Average marks: "+avg);
        }

       rs.close();
       ps.close();
       conn.close();

    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}


public void departmentWiseStudentCount(){
    String query = "SELECT department,COUNT(*) FROM students GROUP BY department";

    try{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            int count = rs.getInt(2);
            System.out.println(rs.getString("department")+": "+count);
        }

       rs.close();
       ps.close();
       conn.close();
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}



}
