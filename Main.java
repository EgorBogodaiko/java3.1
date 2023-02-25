import java.util.Arrays;
public class Main
{
  public static void main (String[]args)
  {
    int[] input_array = { 1, 2, 3, 5, 4, 6, 7, 4, 3, 7, 8 };
    int[] res_array = Arrays.stream (input_array).filter (i->i % 2 == 0).toArray();
    System.out.println (Arrays.toString (res_array));
  }
}
