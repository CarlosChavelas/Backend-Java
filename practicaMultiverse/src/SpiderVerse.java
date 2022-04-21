public class SpiderVerse {
    public static void main(String[] args) {
        sw();
        mm();
        future();
    }

    private static void sw(){
        Screen screen = new Screen();
        SpiderWoman spiderwoman = new SpiderWoman(1977,
                "Spider Woman",
                "Jessica Drew",
                "Enhanced strength, endurance, speed, reflexes, muscular density, and the uncanny ability to stick to any surface.",
                "At a young age, her family moves to a lab built by her father and Herbert Wyndham near Mount Wundagore in Transia, where she becomes gravely ill from months of uranium exposure. To save her life, her father injects her with an experimental serum based on irradiated spiders' blood.");
        spiderwoman.spiderData();
        Runnable powers = new Runnable() {
            @Override
            public void run() {
                try{
                    spiderwoman.bioelectricGeneration(screen);
                    Thread.sleep(4000);

                    spiderwoman.spiderAura(screen);
                    Thread.sleep(4000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread powersSpiderwoman = new Thread(powers);
        powersSpiderwoman.start();
    }

    private static void mm(){
        Screen screen = new Screen();
        MilesMorales milesmorales = new MilesMorales(2011,
                "SpiderMan",
                "Miles Morales",
                "Enhanced strength, endurance, speed, reflexes, muscular density, and the uncanny ability to stick to any surface.",
                "After scientist Dr. Conrad Markus uses Parker's blood to recreate the formula that created Spider-Man, the Prowler(Aaron Davis) steals the formula, and in the process, one of the spiders created by Markus crawls into the Prowler's duffel bag. Days later, Miles is bitten by the spider during a visit to Aaron's apartment.");
        milesmorales.spiderData();
        Runnable powers = new Runnable() {
            @Override
            public void run() {
                try{
                    milesmorales.invisibility(screen);
                    Thread.sleep(4000);

                    milesmorales.energyBurst(screen);
                    Thread.sleep(4000);

                    milesmorales.venomBlast(screen);
                    Thread.sleep(4000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread powersMiles = new Thread(powers);
        powersMiles.start();
    }

    private static void future(){
        Screen screen = new Screen();
        Spiderman2099 spiderman2099 = new Spiderman2099(1992,
                "SpiderMan 2099",
                "Miguel O'hara",
                "Enhanced strength, endurance, speed, reflexes, muscular density, and the uncanny ability to stick to any surface.",
                "A brilliant Irish-Mexican geneticist living in Nueva York (a renamed New York City) in the year 2099 who attempts to recreate the abilities of the original Spider-Man in other people and later suffers a related accident that causes half of his DNA to be re-written with a spider's genetic code.");
        spiderman2099.spiderData();
        Runnable powers = new Runnable() {
            @Override
            public void run() {
                try{
                    spiderman2099.healingFactor(screen);
                    Thread.sleep(4000);

                    spiderman2099.venomFangs(screen);
                    Thread.sleep(4000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread powersSpider2099 = new Thread(powers);
        powersSpider2099.start();
    }


}
