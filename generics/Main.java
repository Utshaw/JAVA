import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        
        FootballPlayer joe =  new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");


        Team<FootballPlayer> adelaideCrows = new Team<>("AdelaideCrows");
        adelaideCrows.addPlayer(joe); // can add only football players

        Team<BaseballPlayer> baseBallTeam = new Team<>("Chicago Cubs");
        baseBallTeam.addPlayer(pat); // can add only baseball Player

        Team<SoccerPlayer> sockerPlayerTeam = new Team<>("Chicago Cubs");
        sockerPlayerTeam.addPlayer(beckham); // can add socker player

        System.out.println(adelaideCrows.numPlayers());
        
    }
}