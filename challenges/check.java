import java.util.regex.*;

public class check{
  public static void main(String[] args) {
    String longString = "6AGAGGUGUAGAG123123";
    StringBuilder shortString = new StringBuilder(longString);
    //String strangeString = "GUGUAGAG AGAGGUGU";
    String trimmedString = longString.replaceAll("GUGU(?:(?!AGAG).)*AGAG","");
    System.out.println(trimmedString);
    //regexChecker("GUGU[^(AGAG)]*AGAG",strangeString);
  }
  /*
  public static void regexChecker(String theRegex, String str2Check, StringBuilder shortString){
    Pattern checkRegex =Pattern.compile(theRegex);
    Matcher regexMatcher = checkRegex.matcher(str2Check);
    while(regexMatcher.find()){
      if(regexMatcher.group().length()!=0){
        System.out.println(regexMatcher.group().trim());

      }
      shortString.delete(regexMatcher.start(),regexMatcher.end()-1);
      System.out.println("start index "+regexMatcher.start());
      System.out.println("end index "+regexMatcher.end());

    }
  }
  */
}
