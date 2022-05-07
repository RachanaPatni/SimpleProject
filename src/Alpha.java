import java.util.HashMap;
import java.util.Map;

//repeting charecter counting
/*public class Alpha
{
    public static void main(String args[])
    {
        String inputString="I love My Self";
        char ch='e';
        int count=0;
        for(int i=0;i<inputString.length();i++)
        {
            if(inputString.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Character "+ch + "available in the inputstring " +count +" times");

    }
}
*/
//using Hashmap
/*public class Alpha
{
    public static void main(String args[])
    {
        characterCount("Alive is awesome");
        characterCount("music is on stress in gone");
        characterCount("Utha le re baba :(");
    }

     static void characterCount(String inputString) {
         HashMap<Character,Integer> eachCharCountMap=new HashMap<Character,Integer>();
         char[] charry= inputString.toCharArray();

         for(char c:charry)
         {
             if(eachCharCountMap.containsKey(c))
             {
               eachCharCountMap.put(c,eachCharCountMap.get(c)+1);
             }
             else {
                 eachCharCountMap.put(c,1);
             }
         }
         System.out.println(eachCharCountMap);
    }
}
 */
/*public class Alpha
{
    public static void main(String args[])
    {
        String inputString="DoNotProcastinate";
        char SChar='a';

        long count=inputString.chars().filter(ch-> ch==SChar).count();
        System.out.println("Character "+SChar+ " present in the inputString "+count+" times");

        char Schar2='o';
        count=inputString.codePoints().filter(ch->ch==Schar2).count();
        System.out.println("Character" +Schar2+ "present in inoutString " +count+" times+");
    }
}
*/
