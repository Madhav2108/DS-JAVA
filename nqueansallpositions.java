import java.util.*;
public class Main
{
    
    public static void printboard(int path[][], int size) {
    System.out.println();
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
          if(path[i][j]==5)
          {
              path[i][j]=0;
          }
        System.out.print(path[i][j] + " ");
      }
      System.out.println();
    }
  }
    public static void placeblockage(int board[][],int N,int row,int col)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i==row||j==col||(i-j==row-col)||(j+i==row+col))
                {
                    board[i][j]=5;
                }
            }
        }
        board[row][col]=1;
    }
    public static void removeblockage(int board[][],int N,int backup[][])
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                board[i][j]=backup[i][j];
            }
        }
    }
    public static boolean placeQuean(int board[][],int N,int row,int backup[][])
    {
        int col =0;
        while(col<N)
        {
            if(board[row][col]==0)
            {
                board[row][col]=1;
                if(row==N-1)
                {
                    return true;
                }
                placeblockage(board,N,row,col);
                if(placeQuean(board,N,row+1,board))
                {
                    if(row==0)
                    {
                       printboard(board,N); 
                       if(col==N-1)
                       {
                           return true;
                       }
                    }
                    else
                    {
                    return true;
                    }
                }
                else
                {
                    removeblockage(board,N,backup);
                }
            }
            col++;
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int board[][]=new int[N][N];
		int backup[][]=new int [N][N];
		
		placeQuean(board,N,0,backup);
		
}
}
