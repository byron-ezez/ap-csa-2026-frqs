public Account(String requestedName){
  int num = 1;
  if(isAvailable(requestedName)==true){
    username = requestedName;
  }
  else{
    username = requestedName+num;
    while(isAvailable(username)==false){
      num++;
      username = requestedName+num;
    }
  }
}
