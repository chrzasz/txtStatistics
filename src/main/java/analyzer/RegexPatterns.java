package analyzer;

/**
 * Created by Grzegorz Chrzaszczyk on 02-01-2019  01:38 PM
 */
public class RegexPatterns {

  //https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html

  public static final String REGEX = "\\W"; //means all non-words

  public static final String CUSTOM =
          "[0-9]|[`=«…»—–/\"'.,!?;:*+<>(){}\\[\\]\\+\\-]";


  public static final String WHITE_SPACES = "\\s+";


  public static final String SPLIT = "[^A-ZÃ…Ã„Ã–a-zÃ¥Ã¤Ã¶]+";

}
