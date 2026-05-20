// Part A
public Account(String requestedName){
  // if the initial requested name is availble username is set to the requested name
  int num = 1;
  if(isAvailable(requestedName)==true){
    username = requestedName;
  }
/* if the initial requested name is not available, username is set to the requestedName+num, with num starting at 1, then the code will continue to check if the new username
is available and keep adding 1 to the value of num until a name is available*/
  else{
    username = requestedName+num;
    while(!isAvailable(username)){
      num++;
      username = requestedName+num;
    }
  }
}

//Part B
public String getShortenedName(){
  //creates a variable that holds username so the username variable itself remains unchanged
  String result = username;
  /*checks if there are even hyphons to begin with (if not result/original username will be returned) and sets result to the username minus 
  the hyphon found and the letter beforehand. The while loop continues to do this if there is another hyphon found and once none are left the new username is returned. */
  while(result.indexOf("-") >= 0){
    int loc = result.indexOf("-");
    result = result.substring(0,loc-1)+result.substring(loc+1);
  }
  return result;
}
