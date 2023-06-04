
# Maze-solver-DSA-project

## About the project
The project is about building a ME (Maze Solver) application using Java language.
The ME solver is a 2D grid with a starting and ending point, and the goal is to find the shortest possible path between them.
The grid will have different colored blocks, white blocks are the ones through which the path can go , and black blocks are the obstracles .
The project will have a business logic algorithm responsible for finding the path.
The GUI of the application will be built after the business logic.

## The Maze grid
The maze is represented by a 2D array named "grid" that contains 0, 1, and 9 elements.
The boundaries of the grid have 1 elements, 0 elements represent points from which we can traverse, and 9 represents the destination point.
The 1 elements represent obstacles that block the passage of the maze solver.
The maze solver can only move toward directions that don't have obstacles.
The project will use Java Swing to implement the graphical interface.

## Algorithm used
There is a need for an array traversal algorithm to access and check data stored in the array.
Definition of array traversal as the process of accessing each element stored in the array.
Purpose of array traversal is to check or use data as part of a process.
Three conditions for accessing and checking values in the array: zero (accessible), one (blocker), and nine (destination point).
Requirement to access and check values in the array until the destination point (array value 9) is reached.
DFS Algorithm is used where the Purpose of DFS to reach far away from the starting point while accessing elements in the array.
Importance of marking visited elements or nodes during traversal using DFS.
DFS (depth-first search) has been implemented to find the coordinates from the starting point to the destination point
The path is a list of coordinates needed to reach the destination point
A loop is needed to create a path from the starting point to the ending point
The loop increments the index by two to fetch both the X and Y coordinates, as both coordinates are added to the path list
The X coordinate is fetched by incrementing the index by two, and the Y coordinate is fetched by accessing the value at index I-1
