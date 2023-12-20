public class WeightedQuickUnionUF {
    private int[] id, size;

    public WeightedQuickUnionUF(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 0;
        }
    }

    private int root(int i) {
        while (i != id[i])
            i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int element1, int element2) {
        int rootOfElement1 = root(element1);
        int rootOfElement2 = root(element2);
        if (rootOfElement1 == rootOfElement2)
            return;
        else if (size[rootOfElement1] < size[rootOfElement2]) {
            id[rootOfElement1] = rootOfElement2;
            size[rootOfElement2] += size[rootOfElement1];
        } else {
            id[rootOfElement2] = rootOfElement1;
            size[rootOfElement1] += size[rootOfElement2];
        }
    }
}