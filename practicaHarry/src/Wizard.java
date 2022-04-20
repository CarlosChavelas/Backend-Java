public class Wizard {
    private String name;
    private String gender;
    private String house;
    private String patronus;
    private String boggart;

    public Wizard(String name, String gender, String house, String patronus, String boggart){
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.patronus = patronus;
        this.boggart = boggart;
    }


    public String getName() {  return name;  }
    public String getGender() {  return gender;  }
    public String getHouse() {  return house;  }
    public String getPatronus() {  return patronus;  }
    public String getBoggart() {  return boggart;  }


    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setGender(String gender){
        if (!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean sethouse(String house){
        if (!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public void wizardData(){
        System.out.println("\nName: "+ name +
                "\nGender: "+ gender +
                "\nHouse: "+ house +
                "\nPatronus: "+ patronus +
                "\nBoggart: "+ boggart);
    }
}

