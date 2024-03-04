package com.office.commute.dto.request.employee;

import com.office.commute.domain.employee.status.Role;
import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EmployeeCreateRequest {
  private String name;
  private String teamName;
  private Role role;
  private LocalDate workStartDate;
  private LocalDate birthday;

  public EmployeeCreateRequest(String name, String teamName, Role role, LocalDate workStartDate,
      LocalDate birthday) {
    this.name = name;
    this.teamName = teamName;
    this.role = role;
    this.workStartDate = workStartDate;
    this.birthday = birthday;
  }
}
