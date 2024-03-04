package com.office.commute.service.employee;

import com.office.commute.domain.employee.Employee;
import com.office.commute.domain.employee.status.Role;
import com.office.commute.domain.team.Team;
import com.office.commute.dto.request.employee.EmployeeCreateRequest;
import com.office.commute.dto.response.Employee.EmployeeListResponse;
import com.office.commute.repository.employee.EmployeeRepository;
import com.office.commute.repository.team.TeamRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
  private final EmployeeRepository employeeRepository;
  private final TeamRepository teamRepository;

  public EmployeeService(EmployeeRepository employeeRepository, TeamRepository teamRepository) {
    this.employeeRepository = employeeRepository;
    this.teamRepository = teamRepository;
  }

  @Transactional
  public void createEmployee(EmployeeCreateRequest request) {
    Team team = teamRepository.findTeamByName(request.getTeamName())
        .orElseThrow(IllegalArgumentException::new);

    if(request.getRole().equals(Role.MANAGER)){
      team.setManagerName(request.getName());
    }
    team.setMemberCount();

    employeeRepository.save(new Employee(request.getName(),team,request.getRole(), request.getWorkStartDate(), request.getBirthday()));

  }

  public List<EmployeeListResponse> getEmployeeList() {
    List<Employee> employeeList = employeeRepository.findAll();
    return employeeList.stream().map(EmployeeListResponse::new).collect(Collectors.toList());
  }
}
