public class StringUserDomain {

    public static void main(String[] args) {
         // Initializing the email address
        String str = "programmer@gmail.com";
        
         // Finding the index of the '@' symbol
        int i = str.indexOf("@");
        
         // Extracting the user part of the email address
        String user = str.substring(0, i);
        
         // Extracting the domain part of the email address
        String domain = str.substring(i + 1, str.length());
        
         // Printing the user and domain parts
        System.out.println("user: " + user);
        System.out.println("domain: " + domain);
        
         // Checking if the domain is equal to "gmail"
        int j = str.indexOf(".");
        String a = str.substring(i + 1, j);
        System.out.println(a);
        System.out.println(a.equals("gmail"));
    }
}
