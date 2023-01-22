public  class NameResponse {
    private  int id;
    private  String name;
    public NameResponse(Name name){
        this.id = name.getId();
        this.name = name.getName();
    }
}