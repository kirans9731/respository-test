package repository.test.repo;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import repository.test.entity.Player;

import java.util.Collection;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Collection<Player> findByName(String name);

    Collection<Player> findByTeamName(String name);

    Collection<Player> findByTeamId(Integer id);

    Collection<Player> findByTeamExternalTeamId(Integer id);

    Collection<Player> findByTeamExternalTeam(String team);
}
