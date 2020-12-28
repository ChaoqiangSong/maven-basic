package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }
  
  public void doSomethingSynchronized(){
    synchronized (this.getClass()) {  // Noncompliant
      // ...
    }
  }

}

public class Outie {
  private int i=0;

  private void increment() {  // Noncompliant
    i++;
  }

  public class Innie {
    public void doTheThing() {
      Outie.this.increment();
    }
  }
}
