// 연결된 예외
public class Main {

    public static void main(String[] args) {
        try {
            // 예외 생성
            NumberFormatException ex = new NumberFormatException("가짜 예외이유");

            // 원인 예외 설정(지정한 예외를 원인 예외로 등록)
            ex.initCause(new NullPointerException("진짜 예외이유"));

            // 예외를 직접 던집니다.
            throw ex;
        } catch (NumberFormatException ex) {
            // 예외 로그 출력
            ex.printStackTrace();
            // 예외 원인 조회 후 출력
            ex.getCause().printStackTrace();
        }

        // checked exception 을 감싸서 unchecked exception 안에 넣습니다.
        throw new RuntimeException(new Exception("이것이 진짜 예외 이유 입니다."));
    }
}

    // 출력
//    Caused by: java.lang.NullPointerException: 진짜 예외이유