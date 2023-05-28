import java.util.Scanner;
public class Tictactoe{
  private char[][] board= new char[3][3];
  private char currentPlayer='X';
  private boolean gameEnded= false;
  public void play(){
    Scanner sc= new Scanner(System.in);
    while(!gameEnded){
      System.out.println("Player"+currentPlayer+"'s turn.Enter row(0-2):");
      int row= sc.nextInt();
  System.out.println("Enter column (0-2):");
      int col= sc.nextInt();
      if (isValidMove(row, col)) {
      board[row][col] = currentPlayer;
      printBoard();
      if (checkWin(row,col)){
      System.out.println("Player"+currentPlayer+" wins!");
      gameEnded=true;
       } 
      else if(checkDraw())
    
     {
      System.out.println("It's a draw!");      
        gameEnded=true;
       }
        else            
         {       
       currentPlayer=(currentPlayer=='X')?'0':'X';
       }
     } 
     else{
      System.out.println("Invalid move. Try again.");
       }
      }
    sc.close();
   }
  private void initializeBoard(){
        for(char[] row:board){
            for(int i=0;i<row.length;i++){
                row[i]='-';
            }
        }
    }
  private void printBoard(){
        for(char[] row:board){
            for (char cell:row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
  private boolean isValidMove(int row,int col){
        return row>=0 && row<3 && col>=0 && col<3 && board[row][col]=='-';
  }
  private boolean checkWin(int row,int col){
        return (board[row][0]==currentPlayer && board[row][1]==currentPlayer && board[row][2]==currentPlayer)
       || (board[0][col]==currentPlayer && board[1][col]==currentPlayer && board[2][col]==currentPlayer) 
       || (row==col && board[0][0]== currentPlayer && board[1][1]==currentPlayer && board[2][2]==currentPlayer)
       || (row+col==2 && board[0][2]==currentPlayer && board[1][1]==currentPlayer && board[2][0] == currentPlayer);
        }
  private boolean checkDraw(){
        for (char[] row:board){
            for (char cell:row){
                if (cell=='-'){
                    return false;
                }
            }
        }
        return true;
    }
  public static void main(String[] args) {
        TicTacToe game=new TicTacToe();
        game.play();
  }
  }
