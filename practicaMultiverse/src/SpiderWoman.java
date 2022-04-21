public class SpiderWoman extends Spiders implements SpiderwomanPowers{
    public SpiderWoman(int id, String alias, String identity, String abilities, String description){
        super(id,alias,identity,abilities,description);
    }

    @Override
    public void bioelectricGeneration(Screen s) {
        s.setVisible(true);
        s.out(spiderData(),"Helvetica", 15, Colors.black );
        s.showImage("swblast.jpg");
        s.setBounds(300, 300, 500, 700);

    }

    @Override
    public void spiderAura(Screen s) {
        s.cls();
        s.out(spiderData(),"Helvetica", 15, Colors.black );
        s.showImage("swaura.jpg");
        s.setBounds(300, 300, 500, 700);

    }
}
