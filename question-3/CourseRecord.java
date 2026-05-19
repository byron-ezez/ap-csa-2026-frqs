public int moreHistoryThanMathAbsences{
  int result = 0;
  for(CourseRecord h : historyList){
    for(CourseRecord m : mathList){
      if(h.getStudentID().equals(m.getStudentID())){
        if(m.getAbsences() < h.getAbsences()){
          result++;
        }
      }
    }
  }
  return result;
}
