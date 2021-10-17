package oopClasses;


public class Permutations {
    static String string = "ABCD";
    static int count = string.length();
    static StringBuilder sb = new StringBuilder(string);

    public static void main(String[] args) {
        permute(0);

    }
    public static void swap(int i, int j){
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
    }
    public static void permute(int i){
        if (i == count-1)
            System.out.println(sb.toString());
        else for (int j = i; j<count; j++){
            swap(i,j);
            permute(i+1);
            swap(i,j);
        }
    }
}
