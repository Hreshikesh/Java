package com.xworkz.isarelation.Internal;

public class IPL extends Tournament {
    public IPL() {
        System.out.println("Running no-arg constructor of IPL");
    }
    @Override
    public void organize() {
        System.out.println("Tournament is organized for competitive matches in subclass");
    }
    @Override
    public void teamsParticipate() {
        System.out.println("Multiple teams participate in the tournament in subclass");
    }
    @Override
    public void scheduleMatches() {
        System.out.println("Matches are scheduled across different venues in subclass");
    }
    @Override
    public void declareWinner() {
        System.out.println("Tournament declares a winner at the end in subclass");
    }
    @Override
    public void entertainFans() {
        System.out.println("Tournament provides entertainment for sports fans in subclass");
    }

    public void trophy(){
        System.out.println("Trophy in IPL");
    }
}
