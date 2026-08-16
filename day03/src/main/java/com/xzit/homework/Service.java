package com.xzit.homework;

public class Service {
   TeamDao teamDao= new TeamImpl();
    public  void addTeam(Team team) {
         this.teamDao.addTeam(team);
    }
    public void deleteTeam(Team team) {
       this.teamDao.deleteTeam(team);
    }
}
