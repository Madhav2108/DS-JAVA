import java.util.*;
public class Main {
  public static void printpath(int path[][], int size) {
    System.out.println();
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(path[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static boolean pathfind(int arr[][], int path[][], int i, int j,
    int m, int n, int size) {
        // destination
    if (i == size - 1 && j == size - 1) {
      path[i][j] = 1;
      printpath(path, size);
      path[m][n] = 0;
      path[i][j] = 0;
      return true;
    }
    //  up
    if ((i - 1 >= 0) && (m != i - 1) && (arr[i - 1][j] == 1)&&(path[i-1][j]==0)) {
      path[i][j] = 1;
      if (pathfind(arr, path, i - 1, j, i, j, size)) {
    
      } else {
        path[i][j] = 0;
        // return false;
      }
    }
    //  right
    if ((j + 1 < size) && (n != j + 1) && (arr[i][j + 1] == 1)&&(path[i][j+1]==0)) {
      path[i][j] = 1;
      if (pathfind(arr, path, i, j + 1, i, j, size)) {
          
        if (path[i][j] == 0) {
          return true;
        }
      } else {
        path[i][j] = 0;
        // return false;
      }
    }
    //  down
    if ((i + 1 < size) && (m != i + 1) && (arr[i + 1][j] == 1)&&(path[i+1][j]==0)) {
      path[i][j] = 1;
      if (pathfind(arr, path, i + 1, j, i, j, size)) {
          
        if (path[i][j] == 0) {
          return true;
        }
      } else {
        path[i][j] = 0;
        // return false;
      }
    }
    //  left
    if ((j - 1 >= 0) && (n != j - 1) && (arr[i][j - 1] == 1)&&(path[i][j-1]==0)) {
      path[i][j] = 1;
      if (pathfind(arr, path, i, j - 1, i, j, size)) {
          return true;
      } else {
        path[i][j] = 0;
        // return false;
      }
    }
    path[i][j]=0;
    return false;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int arr[][] = new int[size][size];
    int path[][] = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {

        arr[i][j] = s.nextInt();
        path[i][j] = 0;
        if (i == 0 && j == 0) {
          if (arr[i][j] != 1) {
            System.out.println();
            System.out.println("not allowed 0 at 1 place");
            return;
          }
        }
        if (arr[i][j] > 1) {
          System.out.println();
          System.out.println("only 0 and 1 allowed");
          j--;
          continue;
        }
      }
    }
    boolean ans=pathfind(arr, path, 0, 0, 0, 0, size);
  }
}