class constructorchain{
  public String empname;
  public int empno;
  public int Salary;
  public constructorchain(){
    this("Dheeraj");
  }
  public constructorchain(String name){
    this(name, 100);
  }
  public constructorchain(String name, int enump){
    this(name, enump, 10000);
  }
  public constructorchain(String name, int enump, int sal){
    this.empname=name;
    this.empno=enump;
    this.Salary=sal;
  }
  void disp(){
    System.out.println(empname + " " + empno + " " + Salary);
  }
  public static void main(String args[]){
    constructorchain obj = new constructorchain();
    obj.disp();

  }
}
