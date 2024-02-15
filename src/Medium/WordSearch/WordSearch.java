package Medium.WordSearch;

public class WordSearch {
    static boolean[][] visited;
    public static boolean exist(char[][] board, String word){
        int rows = board.length;
        int columns = board[0].length;

        visited = new boolean[rows][columns];

        for (int i=0; i < rows; i++){
            for (int j=0; j < columns; j++){
                if (word.charAt(0) == board[i][j] && searchWord(i,j,0,word,board)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean searchWord(int i, int j, int index, String word, char[][] board){
        if (index == word.length()){
            return true;
        }
        if (i<0 || i>= board.length || j<0 || j>=board[0].length || word.charAt(index) != board[i][j] || visited[i][j]){
            return false;
        }

        visited[i][j] = true;

        if (searchWord(i+1,j , index+1, word, board) ||
            searchWord(i-1,j,index+1,word,board) ||
            searchWord(i, j+1, index+1,word,board) ||
            searchWord(i, j-1, index+1,word,board)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[3][4];
        String word = "SEE";

        board[0][0] =  'A';
        board[0][1] =  'B';
        board[0][2] =  'C';
        board[0][3] =  'E';
        board[1][0] =  'S';
        board[1][1] =  'F';
        board[1][2] =  'C';
        board[1][3] =  'S';
        board[2][0] =  'A';
        board[2][1] =  'D';
        board[2][2] =  'E';
        board[2][3] =  'E';

        System.out.println(exist(board,word));
    }
}
