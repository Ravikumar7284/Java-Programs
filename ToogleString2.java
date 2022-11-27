// replace repeated character in string
// input : school
// output : sch**l

public class ToogleString2 {
   public static void main(String[] args) {
    String str = "school";
    System.out.println(toggleRepeated(str));
   }

private static String toggleRepeated(String str) {
   int n = str.length();
   int count;
   String result = " ";
   char[] string = str.toCharArray();
   
   for(int i=0; i<n; i++)
   {
    count = 1;
    for(int j=i+1; j<n; j++)
    {
        if(string[i] == string[j] && string[i]!=' ')
        {
            count ++;
        }
    }
    if(count > 1 && string[i]!='0')
    {
        result = str.replace(string[i], '*');
    }
   }
   return result;
}

}
