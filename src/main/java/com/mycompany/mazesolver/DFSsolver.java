/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazesolver;
import java.util.*;

/**
 *
 * @author vidya
 */
public class DFSsolver {
    public static boolean DFS(int [][]maze,int i,int j, List<Integer> path)
    {
        
        int n = maze.length;
        int m = maze[0].length;
        if(maze[i][j]==9)
        {
            path.add(i);
            path.add(j);
            return true;
        }
        
        //right
        if(maze[i][j]==0)
        {
            maze[i][j] = 2;
            //right
            if(maze[i][j+1]<m)
                if(DFS(maze,i,j+1,path))
                {
                    path.add(i);
                    path.add(j);
                    return true;
                }
        //down
            if(maze[i+1][j]<n)
                if(DFS(maze,i+1,j,path))
                {
                    path.add(i);
                    path.add(j);
                    return true;
                }
            //left
            if(maze[i][j-1]>=0)
                if(DFS(maze,i,j-1,path))
                {
                    path.add(i);
                    path.add(j);
                    return true;
                }
            //up
            if(maze[i-1][j]>=0)
                if(DFS(maze,i-1,j,path))
                {
                    path.add(i);
                    path.add(j);
                    return true;
                }
        }
        return false;
        
        
    }
    
}
