/**
 * Created by tommy_000 on 9/27/2014.
 */
public class GridSquare {
    private int gridX;          // Multiply by 10 for pixel of X starting in top-left
    private int gridY;          // Multiply by 10 for pixel of Y starting in top-left
    private Body[] bodiesInSquare;

    public GridSquare(int gridX, int gridY) {
        this.gridX = gridX;
        this.gridY = gridY;
    }
    
    public void populate() {

    }
}
