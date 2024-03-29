package co.id.aplikasi.desktop.crud.jdbc.maven.service.impl;

import co.id.aplikasi.desktop.crud.jdbc.maven.dao.EmployeeDAO;
import co.id.aplikasi.desktop.crud.jdbc.maven.dao.impl.EmployeeDAOImpl;
import co.id.aplikasi.desktop.crud.jdbc.maven.model.Employee;
import co.id.aplikasi.desktop.crud.jdbc.maven.service.EmployeeService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author tombisnis@yahoo.com
 */
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl() {
       employeeDAO = new EmployeeDAOImpl();
    }

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void save(Employee employee) throws SQLException {
        employeeDAO.save(employee);
    }

    @Override
    public void saveOrUpdate(Employee employee) throws SQLException {
        employeeDAO.saveOrUpdate(employee);
    }

    @Override
    public void delete(Employee employee) throws SQLException {
       employeeDAO.delete(employee);
    }

    @Override
    public List<Employee> getAllEmployees() throws SQLException {
        return employeeDAO.getAllEmployees();
    }
}