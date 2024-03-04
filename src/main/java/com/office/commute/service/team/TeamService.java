package com.office.commute.service.team;

import com.office.commute.domain.team.Team;
import com.office.commute.dto.request.team.TeamCreateRequest;
import com.office.commute.dto.response.team.TeamListResponse;
import com.office.commute.repository.team.TeamRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TeamService {
  private final TeamRepository teamRepository;

  @Transactional
  public void createTeam(TeamCreateRequest request) {
    teamRepository.save(new Team(request.getName()));
  }

  public List<TeamListResponse> getTeamList() {
    List<Team> teamList= teamRepository.findAll();
    return teamList.stream().map(TeamListResponse::new)
        .collect(Collectors.toList());
  }
}
