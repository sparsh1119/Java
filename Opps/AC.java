public class AC {
    String name;
    int capacity;
    int temp;

    boolean flag = false;

    public void display(){
        if(flag){
            System.out.println("AC is on");
            System.out.println(name);
            System.out.println(capacity);
            System.out.println(temp);
        }
        else{
            System.out.println("AC is not on");
        }
    }

    public void on(){
        flag = true;
        temp = 20;
        name = "BlueStar";
        capacity = 4;
    }

    public void off(){
        flag = false;
        temp =0 ;
        System.out.println("Ac is off");
    }

    public void increaseTemp(){
        if (flag) {
            temp++;
        }else{
            System.out.println("Turn on AC first");
        }
    }

    public void decreaseTemp(){
        if(flag){
            temp--;
        }else{
            System.out.println("Turn on AC");
        }
    }
}
