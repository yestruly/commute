package com.office.commute.dto.response.team;

import com.office.commute.domain.team.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class TeamListResponse {
  private String name;
  private String manager;
  private Long memberCount;


  public TeamListResponse(Team team) {
    this.name = team.getName();
    this.manager = team.getManagerName();
    this.memberCount = team.getMemberCount();
  }
}
