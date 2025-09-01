package krsnaSolved;
//Cantilever Training
public class findYear {
    public static void main(String[] args) {
        System.out.println(findNextYear(1800));
    }
    public static int findNextYear(int year){
        year += 1;
        while(!isUniqueYear(year)){
            year ++;
        }
        return year;
    }
    public static boolean isUniqueYear(int year){
        int l = year % 10;
        int ls = (year % 100 / 10);
        int fs = (year % 1000 /100);
        int f = (year % 10000/1000);
        return f != ls && f != fs && f != l && fs != ls && fs != l && ls != l;
    }
}