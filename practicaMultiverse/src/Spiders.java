public class Spiders {
    private String alias;
    private String identity;
    private int id;
    private String description;
    private String abilities;

    public Spiders(int id, String alias, String identity,String abilities, String description){
        this.id = id;
        this.alias = alias;
        this.identity = identity;
        this.description = description;
        this.abilities = abilities;
    }

    public int getId() {  return id;  }
    public String getAlias() {  return alias;  }
    public String getIdentity() {  return identity;  }
    public String getAbilities() {  return abilities;  }
    public String getDescription() {  return description;  }


    public boolean setId(int id){
        if(id>0){
            this.id = 0;
            return true;
        }else
            return false;
    }

    public boolean setAlias(String alias){
        if(!alias.isEmpty()){
            this.alias = alias;
            return true;
        }else
            return false;
    }

    public boolean setIdentity(String identity){
        if(!identity.isEmpty()){
            this.identity = identity;
            return true;
        }else
            return false;
    }

    public boolean setAbilities( String abilities){
        if(!abilities.isEmpty()){
            this.abilities = abilities;
            return true;
        }else
            return false;
    }

    public boolean setDescription(String description){
        if(!description.isEmpty()){
            this.description = description;
            return true;
        }else
            return false;
    }


    public String spiderData(){
        return
                "ID: "+id+
                "\nALIAS: "+alias+
                "\nIDENTITY: "+identity+
                "\nABILITIES: "+abilities+
                "\nDESCRIPTION: "+description+"\n";
    }
}
