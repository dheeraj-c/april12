class firstlast{
  public String n;
  public String old;
  public int len;
  firstlast(String word){
    this.old=word;
    this.len=old.length();
  }
  void oper(){
    if(len>2){
      n=old.substring(0,2)+old.substring(len-2, len);
      System.out.println(n);
    }
    else if(len<2){
      n="";
      System.out.println("The new string is" + " " + n);
    }
  }
}

public class bothends{
  public static void main(String args[]){
    firstlast obj=new firstlast("spring");
    obj.oper();
  }
}
