public class Heisencat extends mona{
    public static void hData(){
        mona heisencat = new Heisencat();
        heisencat.setId("76");
        heisencat.setName("Heisencat");
        heisencat.setFrom("Breaking Cat(Bad)");
        heisencat.setHobbies("cooking the most pure meth.");

        String msg = "Hi, my name is " + heisencat.getName() + ".";
        msg += "\nMy favorite number is " + heisencat.getId() + " and ";
        msg += "I'm from the T.V. show named "+heisencat.getFrom() + ".";
        msg += "\nI really enjoy " + heisencat.getHobbies() + "\n";

        System.out.print(msg);
    }
}
