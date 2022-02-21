public class Q4 {
    public static void main(String args[]) {
        int count;    
        String str = "Devraj Jain, Software Developer";    
          
        char chars[] = str.toCharArray();    
            
        System.out.println("Duplicate characters in string: ");       
        for(int i = 0; i <chars.length; i++) {    
            count = 1;    
            for(int j = i+1; j <chars.length; j++) {    
                if(chars[i] == chars[j] && chars[i] != ' ') {    
                    count++;     
                    chars[j] = ' ';    
                }    
            }    
            
            if(count > 1 && chars[i] != '0')    
                System.out.println(chars[i]);    
        }    
    }
}
