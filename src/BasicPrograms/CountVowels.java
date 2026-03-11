package BasicPrograms;

public class CountVowels {
    public static void main(String[] args){
        String text = "seleniumautomation";
        int count = 0;
        for(int i=0; i<text.length();i++){
            char ch = text.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                count++;
            }
        }
        System.out.println("Total no of vowels in text " + text + " is " + count);
    }
}
