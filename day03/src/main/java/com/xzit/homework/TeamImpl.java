package com.xzit.homework;

public class TeamImpl implements  TeamDao {
    Team team;
    {
        team = new Team();
    }
    @Override
    public void addTeam(Team team) {
        this.team.getTeams().add(team);
        System.out.println("添加成功");
    }

    @Override
    public void deleteTeam(Team team) {
        this.team.getTeams().remove(team);
        System.out.println("删除成功");
    }
}
