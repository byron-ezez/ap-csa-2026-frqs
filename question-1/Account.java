// Part A
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

//Part B
public String getShortenedName(){
  String result = username;
  while(result.indexOf("-") >= 0){
    int loc = result.indexOf("-");
    result = result.substring(0,loc-1)+result.substring(loc+1);
  }
  return result;
}
