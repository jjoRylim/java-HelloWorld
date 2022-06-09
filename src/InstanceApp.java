import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {
    // class를 사용할때 consturctor를 가지고 있으면 Instance로 사용할 수 있다.
    //
    public static void main(String[] args) throws IOException { // IOException = I/O오류 예외
        /* 생산자(consturctor)앞에 new를 붙이면 생산자가 복제되어 인스턴스가 되고
           그 인스턴스에 어떤 값이 들어오는지 규제하기위해 앞에 class 이름을 넣는다
         */
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();
    }
}
