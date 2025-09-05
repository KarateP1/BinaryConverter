public class Reverter {
    Reverter(){ 
    }

    public String[] Revert(String sentence){
        String[] AllWords = sentence.split(" ");
        String[] allLetters = new String[AllWords.length];
        for(int i = 0; i<AllWords.length; ++i){
             allLetters[i] = Converter.asciiTable[makeAscii(AllWords[i])];
        }
        return allLetters;
    }

    public int makeAscii(String Word){
        int total = 0;
        int cnt = 0;
        for(int i = Word.length()-1; i>= 0; --i){
            if(Word.substring(i, i+1).equals("1")){
                total += Math.pow(2, cnt);
            }
            ++cnt;
        }
        return total;
    }

}
