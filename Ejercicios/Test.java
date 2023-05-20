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
    public static void main(String[] args) throws ItemDuplicated {
        //Prueba de la parte de ejercicio 5
        // Ingreso de datos para probar el area de los arboles
        BSTree<Integer> tree1 = new BSTree<>();
        tree1.insert(5);
        tree1.insert(3);
        tree1.insert(8);
        tree1.insert(2);
        tree1.insert(4);

        BSTree<Integer> tree2 = new BSTree<>();
        tree2.insert(7);
        tree2.insert(5);
        tree2.insert(9);
        tree2.insert(2);
        tree2.insert(6);

        boolean sameArea = haveSameArea(tree1, tree2);
        System.out.println("Los árboles tienen la misma área: " + sameArea); 
        
        // Prueba de la parte de la actividad 3
        /*
        BSTree<Integer> intBST = new BSTree<>(); 
              
        try{
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
        }*/
    }
        private static boolean haveSameArea(BSTree<Integer> tree1, BSTree<Integer> tree2) {
            int area1 = tree1.calculateArea();
            int area2 = tree2.calculateArea();

            return area1 == area2;
        }
        // Prueba con BST de enteros
     
    
}