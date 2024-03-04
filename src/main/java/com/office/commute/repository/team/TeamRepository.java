package com.office.commute.repository.team;

import com.office.commute.domain.team.Team;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

  Optional<Team> findTeamByName(String name);

}
