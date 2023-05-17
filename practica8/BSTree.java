/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author Gabriel
 */
public class BSTree<E extends Comparable<E>>{ 
    class Node{
        protected E data; 
        protected Node left, right; 
        
        public Node (E data){
            this(data,null,null);
        } 
        public Node (E data, Node left, Node right){
            this.data=data; 
            this.left = left; 
            this.right = right;
        } 
    } 
    
    private Node root; 
    public BSTree(){ 
        this.root = null;
    } 
    public boolean isEmpty(){ 
        return this.root == null;
    }
    
    public void insert(E x) throws ItemDuplicated{
        root = insert(root, x);
    }  
    
    private Node insert(Node node, E x) throws ItemDuplicated {
        if (node == null) {
            return new Node(x);
        }

        int compareResult = x.compareTo(node.data);

        if (compareResult < 0) {
            node.left = insert(node.left, x);
        } else if (compareResult > 0) {
            node.right = insert(node.right, x);
        } else {
            throw new ItemDuplicated("El elemento " + x + " ya existe en el árbol.");
        }

        return node;
    }
    
    public E search(E x) throws ItemNotFound{
        return search(root, x);
      
    } 
    
    private E search(Node node, E x) throws ItemNotFound {
        if (node == null) {
            throw new ItemNotFound("El elemento " + x + " no se encuentra en el árbol.");
        }

        int compareResult = x.compareTo(node.data);

        if (compareResult < 0) {
            return search(node.left, x);
        } else if (compareResult > 0) {
            return search(node.right, x);
        } else {
            return node.data;
        }
    }
     
    public void remove(E x) throws ItemNotFound{
         root = remove(root, x);
    } 
    private Node remove(Node node, E x) throws ItemNotFound {
        if (node == null) {
            throw new ItemNotFound("El elemento " + x + " no se encuentra en el árbol.");
        }

        int compareResult = x.compareTo(node.data);

        if (compareResult < 0) {
            node.left = remove(node.left, x);
        } else if (compareResult > 0) {
            node.right = remove(node.right, x);
        } else {
            if (node.left == null && node.right == null) {
                node = null;
            } else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            } else {
                Node minRight = findMin(node.right);
                node.data = minRight.data;
                node.right = remove(node.right, minRight.data);
            }
        }

        return node;
    } 
    
    private Node findMin(Node node) {
        if (node == null) {
            return null;
        } else if (node.left == null) {
            return node;
        } else {
            return findMin(node.left);
        }
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        toString(root, sb);
        return sb.toString();
     
    } 
    
    private void toString(Node node, StringBuilder sb) {
        if (node != null) {
            toString(node.left, sb);
            sb.append(node.data).append(" ");
            toString(node.right, sb);
        }
    }
    public void inOrdeb(){
        inOrder(root);
    } 
    protected void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
    
    
}
