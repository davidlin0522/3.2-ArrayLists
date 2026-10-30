import java.util.ArrayList;
/*
 * Activity 3.2.4
 */
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces = new ArrayList<>();
    barnSpaces.addAll(barn.getSpaces());
    for (int i = 0; i < barnSpaces.size(); i++) {
      Horse h = barnSpaces.get(i);
      if (h.getName().equals("Lady"))
      {
          System.out.println("Bye bye " + barnSpaces.remove(i));
          i--;
          continue;
      }
      else if (h.getName().equals("Patches")){
        i--;
        barnSpaces.remove(h);
        h = barnSpaces.get(i);
        } 
      
      // iterating through it with an enhanced
      //Loop
      System.out.println(h.toString());
    }
  }
} 