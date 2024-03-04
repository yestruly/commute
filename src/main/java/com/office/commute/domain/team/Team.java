package com.office.commute.domain.team;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Getter
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @Column
  private String name;

  @Column(name = "manager_name")
  private String managerName;

  @Column(name = "member_count")
  private Long memberCount;

   public Team(String name){
    this.name = name;
    this.managerName = null;
    this.memberCount = 0L;
  }

  public Team() {}

  public void setManagerName(String managerName) {
    this.managerName = managerName;
  }

  public void setMemberCount() {
    this.memberCount++;
  }
}
