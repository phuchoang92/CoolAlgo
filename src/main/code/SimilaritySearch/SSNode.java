package SimilaritySearch;

public class SSNode {
    private float radius;
    SSNode [] children;
    boolean isLeaf;

    private Point [] points;

    SSNode(boolean isLeaf, Point [] points, SSNode [] children){
        this.children = children;
        this.points = points;
        this.isLeaf = isLeaf;
    }
}
