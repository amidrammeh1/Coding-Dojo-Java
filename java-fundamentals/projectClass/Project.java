public class Project {
  private String name;
  private String description;

  // The constructors
  public Project(){
    this.name = "";
    this.description = "";
  }

  public Project(String name){
    this.name = name;
  }

  public Project(String name, String description){
    this.name = name;
    this.description = description;
  }

  //Getters and Setters

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getDescription(){
    return description;
  }

public void setDescription(String description){
  this.description = description;
}

}
