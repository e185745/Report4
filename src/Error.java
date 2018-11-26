
public class Error {
    public static void main(String[] args){
        String str = null;
        //System.out.println(str.length());
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage());
        }
    }
}

/*
public class Error {
    public static void main(String[] args) {
        String str = "456";
        int value = Integer.parseInt(str, 10);
        System.out.println(value);
    }
}
*/