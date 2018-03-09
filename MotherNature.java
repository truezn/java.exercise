public abstract class MotherNature {
    private String windName; 
    private String fireName; 
    private String woodName; 
    public MotherNature(String wind, String fire, String wood){
        this.windName = wind; 
        this.fireName = fire; 
        this.woodName = wood; 
    };

    // get methods 
    public String getWind(){
        return this.windName; 
    }; 
    public String getFire(){
        return this.fireName; 
    };
    public String getWood(){
        return this.woodName;
    }; 
    
}