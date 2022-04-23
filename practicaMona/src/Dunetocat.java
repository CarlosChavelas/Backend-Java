public class Dunetocat extends mona{
    public static void duneData(){
        mona dunetocat = new Dunetocat();
        dunetocat.setId("103");
        dunetocat.setName("Dunetocat");
        dunetocat.setFrom("Caladan");
        dunetocat.setHobbies("become Emperor of this galaxy and pet giant worms.");

        String msg = "\nAtreides was my name... now you may call me " + dunetocat.getName() + ".";
        msg += "\nI have been in " + dunetocat.getId() + " planets and born ";
        msg += "in "+ dunetocat.getFrom() + ".";
        msg += "\nI am here to " + dunetocat.getHobbies() + "\n";

        System.out.print(msg);
    }
}
