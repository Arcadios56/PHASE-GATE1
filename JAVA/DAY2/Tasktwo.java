public class Tasktwo {
    public static void main(String[] args) {
	System.out.println(likes(new String[] {}));
	System.out.println(likes(new String[] {"Peter"}));
	System.out.println(likes(new String[] {"Jacob", "Alex"}));
	System.out.println(likes(new String[] {"Max", "John", "Mark"}));
}

public static String likes(String[] names) {
        if (names.length == 0) {
            return "No one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
}
}
}
