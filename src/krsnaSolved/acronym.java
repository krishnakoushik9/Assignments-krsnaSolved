package krsnaSolved;

public class acronym {
    public static void main(String[] args) {
        String input = "Database Management System";
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                result.append(words[i].charAt(0));
                if (i < words.length - 1) result.append('.');
            }
        }
        System.out.println(result.toString()); // D.M.S
    }
}
