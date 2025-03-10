import java.util.Scanner;

// 주석은 자바스크립트와 같음. 단축키도 같음. (ctrl + /, cmd  + /)
/*
여러 줄 주석
*/
public class Solution01 { // 클래스 -> 이런 거는 시작을 대문자로 나머지를 소문자로 하고
    // 만약에 스페이스가 있다면 대문자로 바꾸고 다시 소문자 -> 파스칼케이스 => 팡셰? 철학자가 책을 이렇게 씀... PascalCase
    // 시작은 일단 소문자로하고 띄어쓰기가 있을 때 대문자로 한다 -> 카멜케이스 (중간중간 낙타등) camelCase (JS, C, Java, dart)
    // 다 일단 소문자인데 스페이스를 언더바로 -> 스네이크케이스 snake_case (DB, Python, shell)
    // ............. ........ 대시, 마이너스 -> 케밥케이스 kebab-case (CSS)
    // 다 대문자인 스네이크 케이스 -> 스크리밍 스네이크케이스 SCREAMING_SNAKE_CASE (상수값, 설정값)
    // String Manipulation > Switch Case... > 참고. 혹은... 이거 언제 누군가가 TIL 했던 것 같은데?

    public static void main(String[] args) {
        System.out.println("Hello World"); // 근데 이거는 3차 진입 장벽임. 왜?
        // 1차 진입 장벽 -> JDK를 받아와서 -> Java Home Setting -> Java를 cmd에서 찍어봄.
        // 2차 진입 장벽 -> (vscode 없었던 시절) sublime text
        //  (atom이면 다행이야 심지 그냥 메모장, 심지어 워드패드일수도 있음)에서 이 전 과정을 진행
        // -> 색상 하이라이트나 자동완성이 없음. (뭔가 잘못되도 잘못된 것 모름)
        // 4차 진입 장벽 -> 이걸 '수동으로 컴파일'해야함. 그래서 차라리 Visual Studio 환경 내에서 C나 C++ 배우는게 더 쉬운 시절이 있었음.
        // Eclipse가 보편화되기 전에. -> 그럼에도 Eclipse조차도... 1차를 해결주지 못함. 2차도 좀 애매했음 (IDE로서 좋은 성능 아님)
        // 그 당시를 이겨낸 백엔드 현 7년차 이상? (PO) 존경하세요... 존중 받아야함. 그 이유만으로. (살아남았다는 것?)
        // 디버거? -> 아니 디버거를 돌리는 것보다 콘솔 찍는게 진짜 정말 더 나은 시절이 있었다니까... 정말정말...
        // 중단점? 중단점 돌리다가 뻗어요. 램 부족해서. 이클립스는. 스프링에서야 TDD가 되는거지. Servlet JSP에서 TDD해봐... 빌드가 15분 걸리는데 TDD를 어떻게 해
        // 톰캣 껐다 키는데 5분. DB 연결하는데 5분. 뭔가 선결조건 해결(배치, 크론잡...)하는데 5분. -> 30분(?????)
        // 거의 쓸 일이 없다!!!
        // 나머지는 뭐 볼 일 없음 왜? -> 우리 로거를 중심으로 할것임. prinf 찍고 뭐하고... 어... 제 방향아님.
        // 필요하면? ai한테 물어보세요. 정처기 시험칠 거 아니면 거의 현업에서 prinf 쓸일 없음.
        // println의 의미 -> ln -> line 줄바꿈 -> 줄바꿈을 수동으로 붙여줘야한다. 메서드가 붙여줌.
        // 주의해야할 점: 여긴 백틱이 없어요. 문자열 보간이 없어요. -> 다 하나하나 +로 붙여줘야함.
        // 없어요. 진짜요. 없어요. 진짜 없어요. 정말 없어요. `${}` 그거 다 코틀린임. 이런 비슷하게 있다? 다트거나 코틀린임.
        // 유사한 문법으로 MessageFormat이 있는데 기본 문법이 아님. 포맷팅이 있긴한데? 메인의 그런게 아님...
        // 여러 언어로 인해서 뇌가 뒤죽박죽 된거임. 밥먹고 할건데 가장 흔한 실수. String == String. [1, 2, 3]; 생각만해도 즐거워...
        // Ctrl 또는 Cmd 누르시고 (혹은 cmd + b) 메서드나 클래스 내부 보기 -> Translation으로 주석 블록 지정하고 우클릭 -> 문서번역
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 입력"); // sout
        String name = scanner.nextLine(); // 지금 입력한 값을 받고 다음줄로 넘어가겠다 (입력이 일어남)
        System.out.println("안녕하세요 " + name);
        scanner.close();
        System.out.println("끝");
    }
}
