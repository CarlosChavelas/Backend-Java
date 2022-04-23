public class DoctocatBrown extends mona{
    public static void docData(){
        mona doctocatbrown = new DoctocatBrown();
        doctocatbrown.setId("67");
        doctocatbrown.setName("DoctocatBrown");
        doctocatbrown.setFrom("back to the future");
        doctocatbrown.setHobbies("Marty Catfly about the consequences of travelling in time.");

        String msg = "\nHey, could you help me? I'm " + doctocatbrown.getName() + ".";
        msg += "\nI have been trapped in this time period, more precisely 19" + doctocatbrown.getId() + " for about three months now.";
        msg += "\nI really need to go "+ doctocatbrown.getFrom() + "... just 18 years ahead";
        msg += "\nto warn " + doctocatbrown.getHobbies() + "\n";

        System.out.print(msg);
    }
}
