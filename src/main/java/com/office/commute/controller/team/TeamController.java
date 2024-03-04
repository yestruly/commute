package com.office.commute.controller.team;

import com.office.commute.dto.request.team.TeamCreateRequest;
import com.office.commute.dto.response.team.TeamListResponse;
import com.office.commute.service.team.TeamService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
  private final TeamService teamService;

  public TeamController(TeamService teamService) {
    this.teamService = teamService;
  }

  @PostMapping("/team")
  public void createTeam(@RequestBody TeamCreateRequest request){
    teamService.createTeam(request);
  }

  @GetMapping("/team")
  public List<TeamListResponse> getTeamList(){
    return teamService.getTeamList();
  }
}
