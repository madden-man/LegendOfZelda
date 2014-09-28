/**
 * Created by tommy_000 on 9/27/2014.
 */
public class CollisionManager {
    public static GridSquare[][] grid;

    public CollisionManager() {
        grid = new GridSquare[80][60];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = new GridSquare(i / 10, j / 10);
            }
        }
    }
}
