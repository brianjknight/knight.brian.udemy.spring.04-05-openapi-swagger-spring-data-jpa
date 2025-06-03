package knight.brian.restcruddemo.dao;

import knight.brian.restcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface    EmployeeRepository extends JpaRepository<Employee, Integer> {

}
