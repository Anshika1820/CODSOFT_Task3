package atm.pkginterface;
import java.sql.*;      //importing all the sql functions
public class BankAccount {
    private int acid;
    private Connection conn;
    public BankAccount(int acid){
        this.acid=acid;
        connect();          //to call the connect() function
    }
    private void connect(){         //to establish a connection between ATM Interface and sql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","anshika");
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public double getbalance(){    //this function will show the balance data from the database
        try{
            PreparedStatement stmt=conn.prepareStatement("Select balance from acc where acid=?");
            stmt.setInt(1,acid);
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                return rs.getDouble("balance");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public boolean withdraw(double amt){     //this will check if the entered amount is not less that 0 and greater than the balance and updates it
        double currentBalance=getbalance();
        if (amt>0 && amt<=currentBalance){
            return updateBalance(currentBalance-amt);
        }
        return false;
    }
    
    public boolean deposit(double amt){       //this will check if the entered amount is not less that 0 and updates it
    double currentBalance=getbalance();
    if(amt>0){
        return updateBalance(currentBalance+amt);
    }
    return false;
}
    public boolean updateBalance(double newBalance){   //this function updates the balance after withdraw and deposit
        try{
            PreparedStatement stmt=conn.prepareStatement("update acc set balance=? where acid=?");
            stmt.setDouble(1,newBalance);
            stmt.setInt(2, acid);
            int rs1=stmt.executeUpdate();
            return rs1>0;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    
}
