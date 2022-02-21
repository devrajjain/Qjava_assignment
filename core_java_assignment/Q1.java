public class Q1 {
    public static void main(String args[]) {
        String str = "  Devraj jain  ";
        FormatString fs = new FormatString();
        System.out.println(fs.capitalize(str));
        System.out.println(fs.trimStr(str));
    }
}


interface HighLight {
  String capitalize(String str);
}

abstract class RemoveSpace {
  abstract String trimStr(String str);
}

class FormatString extends RemoveSpace implements HighLight {
    @Override
    String trimStr(String str) {
        return str.trim();
    }
    
    @Override
    public String capitalize(String str) {
        return str.toUpperCase();
    }
}
        
