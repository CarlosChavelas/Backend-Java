public class Chellocat extends mona{
    public static void chelloData(){
        mona chellocat = new Chellocat();
        chellocat.setId("68");
        chellocat.setName("Chellocat");
        chellocat.setFrom("Aperture Science Facility");
        chellocat.setHobbies("jump across rooms and solving puzzles using the ASHPoD.");

        String msg = "\nHello, can you read me? Well, let me introduce myself, I'm Wheatley\nand I'll tell you about " + chellocat.getName() + ".";
        msg += "\nI found her in the room number " + chellocat.getId() + ",";
        msg += " at "+ chellocat.getFrom() + ".";
        msg += "\nShe really loves to " + chellocat.getHobbies() + "\n";

        System.out.print(msg);
    }
}
