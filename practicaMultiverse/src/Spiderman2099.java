public class Spiderman2099 extends Spiders implements Spiderman2099Powers{
    public Spiderman2099(int id, String alias, String identity, String abilities, String description) {
        super(id, alias, identity, abilities, description);
    }

    @Override
    public void healingFactor(Screen s) {
        s.setVisible(true);
        s.out(spiderData(),"Helvetica", 15, Colors.black );
        s.showImage("2099healingfactor.jpg");
        s.setBounds(300, 300, 500, 700);
    }

    @Override
    public void venomFangs(Screen s) {
        s.cls();
        s.out(spiderData(),"Helvetica", 15, Colors.black );
        s.showImage("2099venomfangs.jpg");
        s.setBounds(300, 300, 500, 700);
    }
}
