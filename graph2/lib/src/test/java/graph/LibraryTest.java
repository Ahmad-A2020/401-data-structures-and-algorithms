/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Graph graph;
    @BeforeEach
    void pickUp(){
        graph= new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("G");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("H");
        graph.addEdge("A","D");
        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("B","C");
        graph.addEdge("C","G");
        graph.addEdge("D","E");
        graph.addEdge("D","H");
        graph.addEdge("D","F");
        graph.addEdge("H","F");
    }

    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void BFTTest(){
        assertEquals("[A, D, B, E, H, F, C, G]", graph.bft(graph,"A").toString());

    }

    @Test
    void DFTTest(){

        assertEquals("[A, B, C, G, D, F, H, E]", graph.dft(graph,"A").toString());

    }
}
