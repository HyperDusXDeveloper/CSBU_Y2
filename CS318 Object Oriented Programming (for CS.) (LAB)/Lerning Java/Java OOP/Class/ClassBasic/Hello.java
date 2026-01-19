class Hello {
    public static void main(String[] args) {
        Dog myDog = new Dog() ; // instance
        myDog.name = "Meyaa";
        myDog.bark();
        
        Dog myDog2 = new Dog();
        myDog2.name = "Ranny";
        myDog2.bark();
        
        System.out.println("Nice too Meet you Dog1 " + myDog.name + " And  My Dog2 " + myDog.name);
        
        Dog testDog = new Dog();
        testDog.age = 17 ;
        testDog.name = "Shibabububu";
        testDog.time();
        System.out.println("Count Dog Name : "+ testDog.Countname());
    }
}