package ch07.exam;

// 추상 클래스
public abstract class HttpServlet {
    public abstract void service(); // 추상 메서드
}

// LoginServlet 클래스
class LoginServlet extends HttpServlet {
    @Override
    public void service() {
        System.out.println("로그인 합니다.");
    }
}

// FileDownloadServlet 클래스
class FileDownloadServlet extends HttpServlet {
    @Override
    public void service() {
        System.out.println("파일 다운로드 합니다.");
    }
}

// 실행 클래스
class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());          // 출력: 로그인 합니다.
        method(new FileDownloadServlet());   // 출력: 파일 다운로드 합니다.
    }

    // 매개변수 다형성 활용
    public static void method(HttpServlet servlet) {
        servlet.service();
    }
}
