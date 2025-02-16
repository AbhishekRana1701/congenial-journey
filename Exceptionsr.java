import java.io.IOException;

public class Exceptionsr {
  public static void main(String[] args) {
      try
      {
        throw new IOException("Hello");
      }
      catch (Exception e)
      {
        System.out.println(e.getMessage());
    }
  }  
}
