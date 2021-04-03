public class TextWrapper{
    
     public static String Solution(String content, int lastIndex){
       
       if(lastIndex > content.length()){
           return content;
       } else {
            String result = content.substring(0, lastIndex);
            if (content.charAt(lastIndex) != ' ') {
                result = result.substring(0, result.lastIndexOf(" "));
            }
            return result;
       }
     
     }
     public static void main(String []args){
        //String s="To crop or not to crop"; //21 To crop or not to
        //String s="Codility We test coders"; //14 Codility We
        //String s="The quick brown fox jumps over the lazy dog";//39 7bos
        //The quick brown fox jumps over the lazy
        String s="Why not";
        System.out.println(Solution(s,100)); 
     }
}
