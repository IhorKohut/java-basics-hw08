import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

  /**
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {
    Pattern pattern = Pattern.compile("(([01]?\\d\\d?|2[04]\\d|25[0-5])\\.){3}(25[0-5]|2[04]\\d|[01]?\\d\\d?)");
    Matcher matcher = pattern.matcher(text);
    return matcher.find() ? matcher.group() : "";
  }
}