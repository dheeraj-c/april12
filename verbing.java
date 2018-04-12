class oper{
  public String word;
  public int len;
  public String result;



  oper(String str1){
    this.word=str1;
    this.len=word.length();
  }
  public String verb(){
    String temp;

    if(len>=3){
      if(word.substring(len-3, len)=="ing"){
        temp=word.substring(0, len-2);
        result=temp+"ly";
      }
      else{
        System.out.println("oops");
      }
    }
    return result;
  }
}

public class verbing{
  public static void main(String args[]){
    oper obj=new oper("running");
    String res=obj.verb();
    System.out.println(res);
  }
}
