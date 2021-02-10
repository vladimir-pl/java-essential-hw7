public enum Animals {
  Deer(10);
  public int age;
  Animals(int age){
    this.age = age;
  }

  @Override
  public String toString(){
    return this.name() + ": age = " + age;
  }
}
