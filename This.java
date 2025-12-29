class Test{
    int x;
    int y;

    Test(int x, int y){

        this.x = x;
        this.y = y;
        System.out.println(this.x + " " + this.y);
    }

    // void display(){
    //     System.out.println(this.x);
    //     System.out.println(this.y);
    // }
}

public class This {
    public static void main(String[] args) {
        new Test(5,6);
        // T.display();
    }
    
}
