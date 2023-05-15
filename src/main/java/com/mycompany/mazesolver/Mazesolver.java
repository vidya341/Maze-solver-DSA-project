/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mazesolver;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
import java.util.*;




/**
 *
 * @author vidya
 */
public class Mazesolver extends JFrame{
    private int[][] maze = {
       
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,0,1,0,0, 0,0, 0, 1},
       {1,0,1,0,0,0, 1,0, 1, 1, 1, 0, 1},
        {1,0,1,1,1,1,1,0,0,0, 0, 0, 1},
        {1,0,0,1,0,0,0,0, 1, 1, 1,0, 1},
        {1,0,1,0, 1, 1,1,0, 1,0,0, 0, 1,1},
        {1,0,1,0,1,0, 0,0, 1, 1,1,0, 1},
        {1,0,1,0,1,1,1, 0, 1,0, 1,0, 1},
        {1,0,0,0,0,0,0, 0, 0, 0, 1,9, 1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    public List<Integer> path = new ArrayList<>();
    public Mazesolver()
    {
        setTitle("The Maze Solver");
        setSize(640,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DFSsolver.DFS(maze,1,1,path);
        
    }
    @Override
    public void paint(Graphics g)
    {
        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                Color color;
                switch(maze[i][j])
                {
                    case 1:color = Color.BLACK; break;
                    case 9: color = Color.RED; break;
                    default: color = Color.WHITE; break;
                }
                g.setColor(color);
                g.fillRect(30*j, 30*i, 30, 30);
                g.setColor(Color.RED);
                g.drawRect(30*j, 30*i, 30, 30);
                
            }
        }
        
        for(int i=0;i<path.size();i+=2)
        {
            int idxi = path.get(i);
            int idxj = path.get(i+1);
            g.setColor(Color.GREEN);
            g.fillRect(30*idxj, 30*idxi, 30, 30);
        }
    }
    

    public static void main(String[] args) {
        Mazesolver solver = new Mazesolver();
        solver.setVisible(true);
    }
}
