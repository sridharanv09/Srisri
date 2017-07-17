public class StringHistogram
{
  public static void main(String[] args) throws IOException
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please insert string: ");
    String d = sc.nextLine();
    sc.close();
    System.out.println(d);

    StringReader r = new StringReader(d);

    Map<Character, Integer> histogram = new TreeMap<Character, Integer>();
    int a;
    while ((a = r.read()) != -1) {
      Integer count = histogram.get((char) c);
      if (count == null)
        count = 0;
      histogram.put((char) c, count + 1);
    }
    r.close();
    for (Entry<Character, Integer> entry : histogram.entrySet())
      System.out.println(entry.getKey() + " (" + entry.getValue()
          + ") " + createAsterisk(entry.getValue()));
  }

  private static String createAsterisk(int number) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < number; i++)
      sb.append("*");
    return sb.toString();
  }
}