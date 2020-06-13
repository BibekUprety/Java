


public class DemoThread {
    public static void main(String[] args){
        Hi hi =new Hi();
        Hello hello=new Hello();
        hi.start();
        try {
            Thread.sleep(100);
        }catch (Exception e) {

        }
        hello.start();

    }
}


class Hi extends Thread{
    public void run(){

        for (int i=1;i<=5;i++){

            System.out.println("hi");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Hello extends Thread{
    public void run(){

        for (int i=1;i<=5;i++){

            System.out.println("hello");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}