/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.persistence;

import employee.logic.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * MS Access database
 * @author Estudiante
 */
public class MSAccess 
{
    
    private Connection connection;              /**Database connection**/
    private Statement statement;                /**SQL Statement**/
    private ResultSet resultSet;                /**Result set*/
    
    private final String dbFileName = "C:\\Users\\Estudiante\\Desktop\\EmployeeApp\\EmployeeApp\\src\\persistence\\EmployeeDB.accdb";      /****/
    

    /**
     * Default constructor
     */
    
    public MSAccess() 
    {
        if (!this.connect())
        {
            //JOptionPane;
        }
    }

    /**
     * Get database connecction
     * @return 
     */
    
    public Connection getConnection() {
        return connection;
    }

    /**
     * Set database connecction
     * @param connection database connection
     */
    
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * Get SQL statement
     * @return 
     */
    
    public Statement getStatement() {
        return statement;
    }

    /**
     * Set SQL statement
     * @param statement SQL Statement
     */
    
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * Get result set
     * @return 
     */
    
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * Set result set
     * @param resultSet result set 
     */
    
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
    /**
     * Try to connect to DB
     * @return True = connected, False = not connected
     */
    
    public boolean connect()
    {
        boolean connected = false;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            this.setConnection(DriverManager.getConnection("jdbc:ucanaccess://" +  this.dbFileName));
            connected = true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MSAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connected;
    }

    /**
     * Select the employees from db
     * @return Employee list
     */
    
    public List<Employee> selectEmployee()
    {
        List<Employee> employeeList = new ArrayList<>();
        try {
            this.setStatement(this.getConnection().createStatement());
            String query = "SELECT * FROM employee WHERE gender = 1";
            this.getStatement().execute(query);
            this.setResultSet(this.getStatement().getResultSet());
            
            if(this.getResultSet() != null)
            {
                while (this.getResultSet().next())
                {
                    Employee employee = new Employee();
                    employee.setId(this.getResultSet().getInt("id"));
                    employee.setNombre(this.getResultSet().getString("firstName"));
                    employee.setApellido(this.getResultSet().getString("lastName"));
                    employee.setFoto(this.getResultSet().getString("Photo"));
                    employee.setGenero(this.getResultSet().getInt("gender"));
                    employee.setFechaNacimiento(this.getResultSet().getDate("bornDate"));
                    employee.setFechaIngreso(this.getResultSet().getDate("hiredDate"));
                    employee.setSalario(this.getResultSet().getInt("salary"));
                    
                    employeeList.add(employee);
                    
                }
            }
        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(MSAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return employeeList;
    }
    
    /**
     * Query data
     * @param query query
     * @return True = successful operation 
     */
    
    public boolean execute(String query)
    {
        boolean result = false;
        try 
        {
            this.setStatement(this.getConnection().createStatement());
            this.getStatement().execute(query);
            this.setResultSet(this.getStatement().getResultSet());
            result = true;
        }
        catch (SQLException ex)
        {
            Logger.getLogger(MSAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
