public abstract class Shape  implements Measurable{
    protected String name;
    //constructor
    public Shape(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }

}
