package co.id.aplikasi.desktop.crud.jdbc.maven.dao;

import co.id.aplikasi.desktop.crud.jdbc.maven.model.Employee;
import java.sql.SQLException;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public interface EmployeeDAO{
    public void save(Employee employee)throws SQLException;
    public void saveOrUpdate(Employee employee)throws SQLException;
    public void delete(Employee employee)throws SQLException;
    public List<Employee> getAllEmployees()throws SQLException;
}