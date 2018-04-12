class driver{
  public String word;
  public char firstletter;
  public String temp;
  driver(String sample){
    this.word=sample;

  }
  public String replacee(){
    char[] temp= word.toCharArray();
    firstletter=temp[0];
    for(int i=1; i<temp.length(); i++){
      if(temp[i]==firsletter){
        temp[i]='*';
      }
    System.out.println(word.toString());

    }
  }
}

public class fixstart{
  public static void main(String args[]){
    driver obj = new driver("blubber");
    obj.replacee();
  }
}
