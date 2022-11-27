
// toggling of case every character of string
// input : HelloWorld
// output : hELLOwORLD

    public class ToggleString1 {

       private static String toggleCase(String str)
        {
            StringBuffer sb = new StringBuffer(str);
            int n = str.length();
            for(int i=0; i<n; i++)
            {
                if(Character.isUpperCase(str.charAt(i)))
                {
                    sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
                }
                if(Character.isLowerCase(str.charAt(i)))
                {
                    sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
                }
            }
            String result = sb.toString();
            return result;

        }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(toggleCase(str));
    }

    
}
