 class Position{
    private String name;
    
    
    public Position(String name) {
        this.name = name;
    }


    public String getName(){
        return name;
    }

}


class Employee{
    private String name;
   
    private Position[] positions;
    private int count=0;
   

    public Employee(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.positions = Position[];
    }





}
