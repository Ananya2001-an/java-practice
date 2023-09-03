package oops.enums;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        public, static, final
//        type is Week
//        can create child enums
//        can have methods if implements some interface
//        cant extend classes since already extends Enum and multiple inheritance is not allowed

//        can have constructors
//        this is not public or protected, only private and default
//        since we cant create objects of enums, we cant call the constructor
//        but the constructor is called for all the enums (so only for the enums that are defined)
//        don't want to create new ones
        Week(){
            System.out.println("Constructor called for : " + this);
        }
    }

    public static void main(String[] args) {
//        constructor is called for all the enums
        Week day = Week.Monday;
        System.out.println(day);
    }
}
