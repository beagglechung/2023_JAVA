import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CallbackTest_not {
    public static void main(String[] args) {
        // Timer 객체를 생성하고 ActionListener를 구현하는 익명 내부 클래스를 사용하여 이벤트 핸들러를 정의합니다.
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("beep");
            }
        });

        // 타이머를 시작합니다. 이로 인해 주기적으로 "beep"가 출력됩니다.
        t.start();

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // InterruptedException이 발생할 경우 아무 작업도 수행하지 않습니다.
            }
        }
    }
}
