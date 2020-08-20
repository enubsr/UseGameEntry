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
public class ScoreBoard {
    private int numOfEntries = 0;
    private GameEntry[] board;
    
    public ScoreBoard(int capacity){
        board = new GameEntry[capacity];
    }
    
    public void add(GameEntry e){
        int newScore = e.getScore();
        if(numOfEntries < board.length ||
                newScore > board[numOfEntries - 1].getScore()){
            if(numOfEntries < board.length){
                numOfEntries++;
            }
            int j = numOfEntries - 1;
            while(j > 0 && board[j-1].getScore() < newScore){
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;
        }
    }
    
    public void showRank(){
        for(int i = 0; i < numOfEntries; i++){
            System.out.print(board[i].toString() + " ");
        }
    }
    
}
