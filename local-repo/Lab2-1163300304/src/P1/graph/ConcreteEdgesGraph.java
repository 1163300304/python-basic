/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * An implementation of Graph.
 * 
 * <p>PS2 instructions: you MUST use the provided rep.
 */
public class ConcreteEdgesGraph implements Graph<String> {
    
    private final Set<String> vertices = new HashSet<>();
    private final List<Edge> edges = new ArrayList<>();
    
    // Abstraction function:
    //   TODO
    // Representation invariant:
    //   TODO
    // Safety from rep exposure:
    //   TODO
    
    // TODO constructor
    
    // TODO checkRep
    
    @Override public boolean add(String vertex) {
        //throw new RuntimeException("not implemented");
        if(!vertices.contains(vertex))
            vertices.add(vertex); 
    }
    
    
    
    @Override public int set(String source, String target, int weight) {
        //throw new RuntimeException("not implemented");
        if(weight>0)
        {
            if(edges.contains(source)&&edges.contains(target))
                
            edges.add(e)
        }
        else if(weight == 0)
        {
            for(Edge _edge : edges)
            {
                if(_edge.getSource().equals(source)&&_edge.getTarget().equals(target))
                {
                    edges.remove(_edge)
                }
            }
        }
    }
    
    @Override public boolean remove(String vertex) {
        throw new RuntimeException("not implemented");
    }
    
    @Override public Set<String> vertices() {
        throw new RuntimeException("not implemented");
    }
    
    @Override public Map<String, Integer> sources(String target) {
        throw new RuntimeException("not implemented");
    }
    
    @Override public Map<String, Integer> targets(String source) {
        throw new RuntimeException("not implemented");
    }
    
    // TODO toString()
    
}

/**
 * TODO specification
 * Immutable.
 * This class is internal to the rep of ConcreteEdgesGraph.
 * 
 * <p>PS2 instructions: the specification and implementation of this class is
 * up to you.
 */
class Edge {
    
    // TODO fields
    private String source;
    private String target;
    private int weight = 0;
    // Abstraction function:
    //   TODO
    // Representation invariant:
    //   TODO
    // Safety from rep exposure:
    //   TODO
    
    // TODO constructor
    public Edge(String source, String target, int weight) {
        this.source = source;
        this.target = target;
        this.weight = weight;
    }
    // TODO checkRep
    
    // TODO methods
    public String getSource()
    {
        return new String(source);
    }
    
    public String getTarget()
    {
        return new String(target);
    }
    
    public Integer getWeigth() {
        return new Integer(weight);
    }
    // TODO toString()
    public String toString() {
        return source+"-"+weigth+"->"+target;
    }
}
