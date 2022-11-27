// insert special character before uppercase character in string 
// convert the string into lowercase
// input : helloWorld
// output : hello_world

public class ToggleString3 {
    public static void main(String[] args) {
       String str = "helloWorld";
       System.out.println(toggleSpecial(str));
    }

    private static String toggleSpecial(String str) {
        int n = str.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n; i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
               sb.append('_');
               sb.append(str.charAt(i)); 
               
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        String result = sb.toString();
        StringBuffer sb1 = new StringBuffer(result);

        for(int i=0; i<n; i++)
        {
            if(Character.isUpperCase(result.charAt(i)))
            {
              sb1.setCharAt(i,Character.toLowerCase(result.charAt(i)));  
            }
        }

        String result1 = sb1.toString();
        return result1;
    }
    
}
