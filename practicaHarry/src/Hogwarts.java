public class Hogwarts {
    public static void main(String[] args) {
        Wizards();
    }

    private static void Wizards(){
        Wizard Tom = new Wizard("Tom Marvolo Riddle", "Male", "Slytherin", "Adder", "His own corpse");
        Wizard Dumbledore = new Wizard("Albus Percival Wulfric Brian Dumbledore", "Male", "Gryffindor", "Phoenix", "Ariana's corpse");
        Wizard Snape = new Wizard("Severus Snape", "Male", "Slytherin", "Doe", "Lord Voldemort");
        Wizard Lily = new Wizard("Lily Evans", "Female", "Gryffindor", "Doe", "Her sister Petunia");
        Wizard Sirius = new Wizard("Sirius Orion Black", "Male", "Gryffindor", "Large Dog", "Himself");

        Tom.wizardData();
        Dumbledore.wizardData();
        Snape.wizardData();
        Lily.wizardData();
        Sirius.wizardData();
    }
}
