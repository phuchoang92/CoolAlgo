package SimilaritySearch;

public class SSTree {
    private SSNode root;
    private int m;
    private int M;
    private int k;

    SSTree(int m, int M, int k){
        this.k = k;
        this.M = M;
        this.m = m;
    }

    SSNode search(SSNode node, Point target){
        return node;
    }
}
