package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsPathCrossing {

    public static boolean isPathCrossing(String path) {

        int x =0, y=0;
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        for (char direction: path.toCharArray()){
            if (direction == 'E'){
                x++;
            } else if (direction == 'W') {
                x--;
            } else if (direction == 'N') {
                y++;
            } else if (direction == 'S'){
                y--;
            }

            String currentPos = x + "," + y;
            if(visited.contains(currentPos)){
                return true;
            }
                visited.add(currentPos);
        }
       return false;
    }

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NES"));
    }
}
