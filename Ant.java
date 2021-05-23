public class Ant 
{
    protected int trailSize;
    protected int trail[];
    protected boolean visited[];
    public Ant(int tourSize) 
    {
        this.trailSize = tourSize;
        this.trail = new int[tourSize];
        this.visited = new boolean[tourSize];
    }
    protected void visitRoom(int currentIndex, int room) 
    {
        trail[currentIndex + 1] = room; 
        visited[room] = true;     
    }
    protected boolean visited(int i) 
    {
        return visited[i];
    }
    protected double trailLength(double graph[][]) 
    {
        double length = graph[trail[trailSize - 1]][trail[0]];
        for (int i = 0; i < trailSize - 1; i++) 
            length += graph[trail[i]][trail[i + 1]];
        return length;
    }
    protected void clear() 
    {
        for (int i = 0; i < trailSize; i++)
            visited[i] = false;
    }
}