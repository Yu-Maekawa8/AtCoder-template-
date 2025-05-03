/*
*Java version template 
*v1.0 4/28
*v1.1 4/30(スニペット追加)
*
*/

import java.util.*;

public class Main {
    public static void main(String [] args) {
        try(Scanner sc = new Scanner(System.in)){

        }
            
    }
    public static void swap(Object[] a ,int i ,int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}


static class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x; this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair p = (Pair) o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }
}

int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}}; // 4方向移動

void bfs(int sx, int sy, int[][] grid) {
    int h = grid.length, w = grid[0].length;
    boolean[][] visited = new boolean[h][w];
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(sx, sy));
    visited[sx][sy] = true;

    while (!queue.isEmpty()) {
        Pair p = queue.poll();
        for (int[] d : dirs) {
            int nx = p.x + d[0], ny = p.y + d[1];
            if (0 <= nx && nx < h && 0 <= ny && ny < w && !visited[nx][ny]) {
                visited[nx][ny] = true;
                queue.add(new Pair(nx, ny));
            }
        }
    }
}

static class UnionFind {
    int[] parent, size;

    UnionFind(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if (x != parent[x]) parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int x, int y) {
        int xr = find(x), yr = find(y);
        if (xr == yr) return;
        if (size[xr] < size[yr]) {
            parent[xr] = yr;
            size[yr] += size[xr];
        } else {
            parent[yr] = xr;
            size[xr] += size[yr];
        }
    }

    boolean same(int x, int y) {
        return find(x) == find(y);
    }
}


