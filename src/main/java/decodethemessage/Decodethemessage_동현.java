package decodethemessage;

//https://leetcode.com/problems/decode-the-message/
public class Decodethemessage_동현 {
    
     public static void main(String[] args) {
         
         Solution solution = new Solution();
         String result = solution.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
         System.out.println(result);
     }

    static class Solution {
        public String decodeMessage(String key, String message) {
            char[] al = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

            char[] keyChar = getCharArray(key.replaceAll("\\s+","").toCharArray());
            char[] messageChar = message.toCharArray();

            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i<messageChar.length; i++) {
                for(int j = 0; j < keyChar.length; j++) {
                    
                    if(messageChar[i] == keyChar[j])
                        stringBuilder.append(al[j]);

                    if(Character.isWhitespace(messageChar[i])) {
                        stringBuilder.append(" ");
                        break;
                    }
                }
            }
            
            return stringBuilder.toString();
        }

        private char[] getCharArray(char[] array) {
            String _array = "";
            for(int i = 0; i < array.length; i++) {
                if(_array.indexOf(array[i]) == -1) // check if a char already exist, if not exist then return -1
                    _array = _array+array[i];      // add new char
            }
            return _array.toCharArray();
        }
    }
}
