package com.office.commute.domain.employee;

import static com.office.commute.domain.employee.status.Role.*;

import com.office.commute.domain.employee.status.Role;
import com.office.commute.domain.team.Team;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Getter;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Entity
@Getter
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_id")
  private Team team;

  @Enumerated(EnumType.STRING)
  private Role role;

  private LocalDate birthday;
  @Column(name = "work_start_date")
  private LocalDate workStartDate;

  public Employee(){}
  public Employee(String name,Team team, Role role, LocalDate workStartDate, LocalDate birthday){
    this.name = name;
    this.team = team;
    this.role = role;
    this.workStartDate = workStartDate;
    this.birthday = birthday;
  }

}
