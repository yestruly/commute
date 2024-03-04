package com.office.commute.dto.request.team;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TeamCreateRequest {
  private String name;

  public TeamCreateRequest(String name){
    this.name = name;
  }
}
