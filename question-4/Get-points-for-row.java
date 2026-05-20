public int getPointsForRow(int targetRow){
  // Goes through and grabs the points of each element in the targeted row and adds it to the sum variable
  int sum = 0;
  for(Space s : board[targetRow]){
    sum += s.getPoints();
  }
/* Goes through the targeted row and compares each element and its color to the color of the element to the right of it. If the colors don't match once, the sum is returned. 
If the colors match throughout the entire row it'll skip the return sum statement and return the sum times two. */
  for(int i = 0; i<board[targetRow].length-1;i++){
    if(!board[targetRow][i].getColor().equals(board[targetRow][i+1].getColor())){
      return sum;
  }
  return sum * 2;
}

