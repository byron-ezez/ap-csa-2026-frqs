public int moreHistoryThanMathAbsences{
  int result = 0;
  /* Goes through both lists and sees if a name appears in both lists, if it does then the absences for that person will be compared
  and if they have less math absences than history absences, 1 is added to result and after the loop ends result is returned*/
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
