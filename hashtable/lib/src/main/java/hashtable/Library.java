/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import tree.BinarySearchTree;
import tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(repeatedWord("Taco cat ate a taco"));

        // intersection
        BinarySearchTree tree1 = new BinarySearchTree(150);
        tree1.Add(100);
        tree1.Add(250);

        BinarySearchTree tree2 = new BinarySearchTree(150);
        tree2.Add(100);
        tree2.Add(70);
        System.out.println(intersection(tree1,tree2));

        // code challenge 33 leftJoin

        HashMap<String,String> map1= new HashMap<>();
        map1.put("fond","enammored");
        map1.put("wrath","anger");
        map1.put("diligent","employed");
        map1.put("outift","garb");
        map1.put("guide","usher");

        HashMap<String,String> map2= new HashMap<>();
        map2.put("fond","averse");
        map2.put("wrath","delight");
        map2.put("diligent","idel");
        map1.put("guide","follow");
        map1.put("flow","jam");


        System.out.println(leftJoins(map1,map2));

    }
    // code challenge 31
    static String repeatedWord( String data){
        String [] lineWordList= data.split(" ");
        HashTable<String,Integer> words= new HashTable<>();

        for (String item: lineWordList){
            if ( !words.contain(item.toLowerCase(Locale.ROOT))){
                words.add(item.toLowerCase(Locale.ROOT),1);
            }else{
                return item;
            }

        }
        return "no repeat word at the sentences";
    }

    //     // code challenge 32

    static  ArrayList<String> intersection (BinarySearchTree Tree1, BinarySearchTree Tree2 ){

        String [] Tree1Array= Tree1.inOrder(Tree1.getRoot()).split("<<");
        String [] Tree2Array= Tree2.inOrder(Tree2.getRoot()).split("<<");

        HashTable<String,Integer> compiles= new HashTable<>();

        ArrayList<String> result = new ArrayList<>();

        for ( String item: Tree1Array){
            if (! compiles.contain(item)){
                compiles.add(item,1);
            }else{
                compiles.add(item,compiles.get(item)+1);
            }
        }

        for ( String i: Tree2Array){
            if (! compiles.contain(i)){
                compiles.add(i,1);
            }else{

                compiles.add(i,compiles.get(i)+1);
                result.add(i);

            }
        }
        return  result;


    }
    // code challenge 33: Write a function that LEFT JOINs two hashmaps into a single data structure.

    public static ArrayList<ArrayList<String>> leftJoins(HashMap<String,String> map1, HashMap<String,String> map2){
        ArrayList<ArrayList<String>> bigContainer= new ArrayList<>();

        ArrayList<String> smallContainer;

        for (Map.Entry item: map1.entrySet()){
            smallContainer= new ArrayList<>();
            smallContainer.add((String) item.getKey());
            smallContainer.add((String) item.getValue());

            if (map2.containsKey(((String) item.getKey()))){
                smallContainer.add(map2.get(item.getKey()));
            }else{
                smallContainer.add("Null");
            }

            bigContainer.add(smallContainer);
        }

        return bigContainer;
    }


}
