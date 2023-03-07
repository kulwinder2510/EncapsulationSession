package inheritancePackage;

public class Child extends Parent{
//    int d = 9;
//    public void printA(){
//        System.out.println(a);
//    }
//    }



        int d=9;
        public void printA(){
        System.out.println(a);
        }
        public void display(){
            super.display();
            System.out.println("child is displaying");
        }
}