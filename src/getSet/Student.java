package getSet;
public class Student                                                                                                                                                                                                                                                                                       {
    //a
    private String name;
    private int edad;
    //c
    public Student(){
        this.name ="Mario";
    }    
    public Student(String name){
        this.name =name;
    }    
     public Student(String name, int edad){
        this.name =name;
        this.edad=edad;
    }
    //me    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}