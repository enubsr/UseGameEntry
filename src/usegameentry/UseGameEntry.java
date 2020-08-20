/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usegameentry;

/**
 *
 * @author Enubs
 */
public class UseGameEntry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameEntry g3 = new GameEntry("Mike", 1105);
        GameEntry g2 = new GameEntry("Rob", 750);
        GameEntry g1 = new GameEntry("Paul", 720);
        GameEntry g5 = new GameEntry("Anna", 660);
        GameEntry g6 = new GameEntry("Rose", 590);
        GameEntry g4 = new GameEntry("Jack", 510);
        GameEntry g7 = new GameEntry("Jill", 740);
        
        ScoreBoard scoreBoard = new ScoreBoard(10);
        scoreBoard.add(g1);
        scoreBoard.add(g2);
        scoreBoard.add(g3);
        scoreBoard.add(g4);
        scoreBoard.add(g5);
        scoreBoard.add(g6);
        scoreBoard.add(g7);
        
        scoreBoard.showRank();
        
        
    }
    
}
