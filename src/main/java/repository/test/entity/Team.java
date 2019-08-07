package repository.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

    private Integer id;
    private String name;
    private Integer externalTeamId;
    private String externalTeam;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "external_team_id")
    public Integer getExternalTeamId() {
        return externalTeamId;
    }

    public void setExternalTeamId(Integer externalTeamId) {
        this.externalTeamId = externalTeamId;
    }

    @Column(name = "external_team")
    public String getExternalTeam() {
        return externalTeam;
    }

    public void setExternalTeam(String externalTeam) {
        this.externalTeam = externalTeam;
    }
}
