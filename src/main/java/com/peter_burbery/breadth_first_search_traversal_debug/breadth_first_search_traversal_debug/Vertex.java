/**
 * @since 2024-W39-3 15.14.33.814 -0400
 * @author peter
 */
package com.peter_burbery.breadth_first_search_traversal_debug.breadth_first_search_traversal_debug;

/**
 * 
 */
public class Vertex {
    private boolean visited;
    private int index;

    // Constructor
    public Vertex(int index) {
        visited = false;
        this.index = index;
    }

    // Getter for visited
    public boolean getVisited() {
        return visited;
    }

    // Getter for index
    public int getIndex() {
        return index;
    }

    // Setter for visited
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}

