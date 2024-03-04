package com.office.commute.dto.response.Employee;

import com.office.commute.domain.employee.Employee;
import com.office.commute.domain.employee.status.Role;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
public class EmployeeListResponse {
  private String name;
  private String teamName;
  private Role role;
  private LocalDate birthday;
  private LocalDate workStartDate;

  public EmployeeListResponse(Employee employee){
    this.name = employee.getName();
    this.teamName = employee.getTeam().getName();
    this.role = employee.getRole();
    this.birthday =employee.getBirthday();
    this.workStartDate = employee.getWorkStartDate();
  }
}
