public class Adventurecat extends mona{
    public static void adventureData(){
        mona adventurecat = new Adventurecat();
        adventurecat.setId("12");
        adventurecat.setName("Adventurecat");
        adventurecat.setFrom("Land of Ooo");
        adventurecat.setHobbies("enjoy putting ourselves in the midst of danger simply because we enjoy a challenge.");

        String msg = "\nHello, my name is " + adventurecat.getName() + " and ";
        msg += " I am " + adventurecat.getId() + " years old.";
        msg += "\nI live with my friend Jake in the "+ adventurecat.getFrom() + " inside a tree.";
        msg += "\nWe really " + adventurecat.getHobbies() + "\n";

        System.out.print(msg);
    }
}
