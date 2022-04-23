public class OkalEltocat extends mona{
    public static void kalData(){
        mona okaleltocat = new OkalEltocat();
        okaleltocat.setId("27");
        okaleltocat.setName("OkalEltocat");
        okaleltocat.setFrom("Krypton");
        okaleltocat.setHobbies("protect the innocent and save the world.");

        String msg = "\nHi people from Earth. My name is " + okaleltocat.getName() + ".";
        msg += "\nI am " + okaleltocat.getId() + " years old and ";
        msg += "I come from another planet called "+okaleltocat.getFrom() + ".";
        msg += "\nI am here to " + okaleltocat.getHobbies() + "\n";

        System.out.print(msg);
    }
}
