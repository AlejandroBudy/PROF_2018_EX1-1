public class MyString {

    private String myString;

    public MyString(String myString){
        this.myString = myString;
    }
    public int compareTo(String str){
        int result = -1;

        if(this.myString.length() > str.length()){
            result = 1;
        }
        else if(this.myString.length() < str.length()){
            result = -1;
        }
        else{
            result = 0;
            for(int i = 0; i < this.myString.length() && result == 0; i++){
                result = this.myString.charAt(i) - str.charAt(i);
            }
        }
        return result;

    }
}
