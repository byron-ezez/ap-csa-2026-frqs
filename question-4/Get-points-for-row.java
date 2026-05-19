public int getPointsForRow(int targetRow){
  int sum = 0;
  for(Space s : board[targetRow]){
    sum += s.getPoints();
  }
  for(int i = 0; i<board[targetRow].length-1;i++){
    if(!board[targetRow][i].getColor().equals(board[targetRow][i+1].getColor())){
      return sum;
  }
  return sum * 2;
}

