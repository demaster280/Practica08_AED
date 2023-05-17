/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author Gabriel
 */
public class Test {
    public static void main(String[] args) {
        // Prueba con BST de enteros
        BSTree<Integer> intBST = new BSTree<>();
        try {
            intBST.insert(5);
            intBST.insert(2);
            intBST.insert(7);
            intBST.insert(1);
            intBST.insert(3);
            intBST.insert(6);
            intBST.insert(8);
            
            System.out.println("Árbol binario de búsqueda de enteros:");
            System.out.println("Contenido del árbol: " + intBST);
            System.out.println("Elemento 3 encontrado: " + intBST.search(3));
            System.out.println("Elemento 4 encontrado: " + intBST.search(4));
            
            intBST.remove(2);
            intBST.remove(7);
            
            System.out.println("Árbol binario de búsqueda después de eliminar 2 y 7:");
            System.out.println("Contenido del árbol: " + intBST);
            
            System.out.println("Recorrido en orden ascendente del árbol:");
            intBST.inOrdeb();
            System.out.println();
            
        } catch (ItemDuplicated e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ItemNotFound e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Prueba con BST de cadenas de texto
        BSTree<String> stringBST = new BSTree<>();
        try {
            stringBST.insert("apple");
            stringBST.insert("banana");
            stringBST.insert("cherry");
            stringBST.insert("date");
            
            System.out.println("\nÁrbol binario de búsqueda de cadenas de texto:");
            System.out.println("Contenido del árbol: " + stringBST);
            System.out.println("Elemento 'banana' encontrado: " + stringBST.search("banana"));
            System.out.println("Elemento 'grape' encontrado: " + stringBST.search("grape"));
            
            stringBST.remove("apple");
            
            System.out.println("Árbol binario de búsqueda después de eliminar 'apple':");
            System.out.println("Contenido del árbol: " + stringBST);
            
            System.out.println("Recorrido en orden ascendente del árbol:");
            stringBST.inOrdeb();
            System.out.println();
            
        } catch (ItemDuplicated e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ItemNotFound e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}