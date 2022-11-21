import java.util.*;

public class Graph{
    // Declaring the Adjecency List, called alist
    // Which is an LinkedList of type node, within an ArrayList
    ArrayList<LinkedList<Node>> alist;

    Graph(){
        alist = new ArrayList<>();
    }// Graph Constructor

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }// addNode

    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }// addEdge

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for(Node node : currentList) {
            if(node == dstNode) {
                return true;
            }// if
        }// for
        return false;
    }// checkEdge

    public void print(){
        for(LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.data + " -> ");
            }// for
            System.out.println();
        }// for
    }// print
}// Graph Class