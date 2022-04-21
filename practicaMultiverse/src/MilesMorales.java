public class MilesMorales extends Spiders implements MilesPowers{

    public MilesMorales(int id, String alias, String identity, String abilities, String description) {
        super(id, alias, identity, abilities, description);
    }

    @Override
    public void invisibility(Screen s) {
        s.setVisible(true);
        s.out(spiderData(),"Helvetica", 15, Colors.black );
        s.showImage("minvisibility.jpg");
        s.setBounds(300, 300, 500, 700);
    }

    @Override
    public void energyBurst(Screen s) {
        s.cls();
        s.out(spiderData(),"Helvetica", 15, Colors.black );
        s.showImage("menergyburst.png");
        s.setBounds(300, 300, 500, 700);
    }

    @Override
    public void venomBlast(Screen s) {
        s.cls();
        s.out(spiderData(),"Helvetica", 15, Colors.black );
        s.showImage("mvenomblast.jpg");
        s.setBounds(300, 300, 500, 700);
    }
}
