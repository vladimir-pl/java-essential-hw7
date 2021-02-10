public enum Vehicles {
  Car(10000, "black");

  private int price;
  private String colour;

  Vehicles(int price, String colour){
    this.price = price;
    this.colour = colour;
  }

  public String getColour(){
    return colour;
  }

  @Override
  public String toString(){
    return this.name() + ": price = " + price + ", colour " + this.getColour();
  }
}
