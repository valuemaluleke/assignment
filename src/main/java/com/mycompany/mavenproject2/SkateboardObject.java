package com.mycompany.mavenproject2;

final class Skateboard extends Vehicle {
private double myBoardLength;
public Skateboard() {
myBoardLength = 0;
}
public Skateboard(double boardLength) {
setBoardLength(boardLength);
}
public double getBoardLength() {
return myBoardLength;
}
public void setBoardLength(double boardLength){
myBoardLength= boardLength;
}
}
public class SkateboardObject{
public static void main(String[] args){
Skateboard board = new Skateboard();
board.setBoardLength(31.5);
System.out.println(board.getBoardLength());
board.setBrand("Ally");
board.setModel("Rocket");
System.out.println(board);
}
}
