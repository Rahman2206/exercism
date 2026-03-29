class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return identifier;
        }

        StringBuilder sb = new StringBuilder();
        boolean upperNext = false;

        for (char c : identifier.toCharArray()) {
            if (Character.isWhitespace(c)) {
                // Remove this line if you want ONLY letters (no underscores)
                sb.append('_'); 
            } else if (c == '-') {
                upperNext = true;
            } else if (Character.isLetter(c)) {
                // This block ensures ONLY characters that are letters get in
                if (upperNext) {
                    sb.append(Character.toUpperCase(c));
                    upperNext = false; 
                } else {
                    sb.append(c);
                }
            }
            else if ( Character.isDigit(c)){
                if (c == '4'){
                    sb.append('a');
                }
                else if (c == '3'){
                    sb.append('e');
                }
                else if (c == '0'){
                    sb.append('o');
                }
                else if (c == '1'){
                    sb.append('l');
                }
                else if (c == '7'){
                    sb.append('t');
                }
                
            }
            // Notice: There is no 'else' here. 
            // If it's a number (1, 2, 3) or symbol (!, @), it is simply ignored.
        }

        return sb.toString();
    }
}