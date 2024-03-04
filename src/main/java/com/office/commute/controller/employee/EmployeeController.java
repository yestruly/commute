package com.office.commute.controller.employee;

import com.office.commute.dto.request.employee.EmployeeCreateRequest;
import com.office.commute.dto.response.Employee.EmployeeListResponse;
import com.office.commute.service.employee.EmployeeService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @PostMapping("/employee")
  public void createEmployee(@RequestBody EmployeeCreateRequest request){
    employeeService.createEmployee(request);
  }

  @GetMapping("/employee")
  public List<EmployeeListResponse> getEmployeeList(){
    return employeeService.getEmployeeList();
  }
}
