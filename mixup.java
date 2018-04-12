class oper{
  public String str1;
  public String str2;
  public String result;
  oper(String word1, String word2){
    this.str1=word1;
    this.str2=word2;
  }
  public String mix(){
    int len=str1.length();
    int len2=str2.length();
    result=str2.substring(0,2)+str1.substring(2,len)+" "+str1.substring(0,2)+str2.substring(2,len2);
    return result;

  }
}

public class mixup{
  public static void main(String args[]){
    oper obj= new oper("mix", "pod");
    String res=obj.mix();
    System.out.println(res);
  }

}
