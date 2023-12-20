public class MainQuickFind {
    public static void main(String[] args) {
        QuickFindUF uf = new QuickFindUF(10);
        uf.union(4, 3);
        uf.union(3, 8);
        uf.union(6, 5);
        uf.union(9, 4);
        uf.union(2, 1);
        System.out.println("Connected (8, 9): "+uf.connected(8, 9));
        System.out.println("Connected (5, 0): "+uf.connected(5, 0));
        uf.union(5,0);
        uf.union(7, 2);
        uf.union(6, 1);
        System.out.println("Connected (7, 0): "+uf.connected(7, 0));
    }
}