public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    private int root(int i) {
        while (i != id[i])
            i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int connect, int withRoot) {
        int rootOfElementToBeConnected = root(connect);
        int rootToBeConnectedWith = root(withRoot);
        id[rootOfElementToBeConnected] = rootToBeConnectedWith;
    }
}