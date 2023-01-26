package org.example;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1=new Fighter("A",10,120,100,30);
        Fighter fighter2=new Fighter("B",10,80,85,40);

        Match match=new Match(fighter1,fighter2,80,100);
        match.run();
    }
}