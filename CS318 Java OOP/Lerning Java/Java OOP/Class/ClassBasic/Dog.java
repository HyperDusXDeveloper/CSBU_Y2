class Dog {
    // คุณสมบัติ Instance
    String name = "Dog";
    String breed ;
    int age ;
    
    // Medthod
    void bark(){
        System.out.println(name + " Says : Woof! Woof!");
    }
    void fetch(String item){
        System.out.println(name + "is Fetching " + item + ".");
    }
    
    void time(){
        System.out.println("Dog Name : "+ name + " Age : " + age);
    }

    int Countname (){
        return name.length();
    }
}