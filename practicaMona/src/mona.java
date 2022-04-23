public class mona {

    public static void monaData(){
        System.out.println("I am Mona the OctoCat, introducing some of my other forms: \n");
    }

    private String name;
    private String id;
    private String from;
    private String hobbies;


    public String getId(){  return id;  }
    public String getName(){  return name;  }
    public String getFrom() {  return from;  }
    public String getHobbies(){  return hobbies;  }

    public boolean setId(String id){
        if (!id.isEmpty()){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setFrom(String from){
        if (!from.isEmpty()){
            this.from = from;
            return true;
        }else
            return false;
    }

    public boolean setHobbies(String hobbies){
        if (!hobbies.isEmpty()){
            this.hobbies = hobbies;
            return true;
        }else
            return false;
    }
}
