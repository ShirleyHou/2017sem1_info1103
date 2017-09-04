public class changePi{
  public static String changePi(String str) {
  int i = str.indexOf("pi");
  String result = "";
  if (i==-1){
    result= str;
  }else{
    str = str+"3.14"+changePi(str.substring(i+2));
  }
  return(result);
  }
  public static void main(String[] args) {
    System.out.println(changePi("pipipix"));
  }
}
