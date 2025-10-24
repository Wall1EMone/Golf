import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String lastname;
    private boolean status;
    private int id;
    private String level = "brons"; //Börjar alltid på brons
    private List<String> history = new ArrayList<>();
    private double hcp;


    public Member(){
    }
    public Member(String name, String lastname, boolean status, int id, String level, List<String> history, double hcp){
        this.name = name;
        this.lastname = lastname;
        this.status = status;
        this.id = id;
        this.level = level;
        this.history = history;
        this.hcp = hcp;
    }
    //Setter och Getter för name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    //Boolean
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    //Id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //Level
    public String getLevel(){
        return level;
    }
    public void setLevel(String level){
        this.level = level;
    }
    //List
    public List<String> getHistory(){
        return history;
    }
    public void setHistory(List<String> history){
        this.history = history;
    }
    public void addHistory(String input){
        history.add(input);
    }
    //Hcp
    public double getHcp(){
        return hcp;
    }
    public void setHcp(double hcp){
        this.hcp = hcp;
    }
    public void info(){
        System.out.println("name: " + name);
        System.out.println("Lastname: " + lastname);
        System.out.println("Status: " + (status ? "Medlem" : "Ej medlem"));//annan typ av if sats, (condition ? sant : falsk)
        System.out.println("Id: " + id);
        System.out.println("Level: " + level);
        System.out.println("Historik: " + history);
        System.out.println("Hcp: " + hcp);
    }
}
