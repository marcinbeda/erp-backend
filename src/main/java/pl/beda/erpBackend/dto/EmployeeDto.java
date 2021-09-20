package pl.beda.erpBackend.dto;

import lombok.Data;
import pl.beda.erpBackend.entity.Employee;

@Data
public class EmployeeDto {

    private Long idEmployee;
    private String firstName;
    private String lastName;
    private String salary;

    public static EmployeeDto of(Employee employee){
        EmployeeDto dto = new EmployeeDto();
        dto.setIdEmployee(employee.getIdEmployee());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setSalary(employee.getSalary());
        return dto;
    }
}
