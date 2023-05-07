package edu; // 클래스 파일이 속한 패키지의 이름과 같아야 한다

import java.util.Scanner; // 다른 패키지에 있는 클래스를 가져올 때 사용한다

class 외부클래스 {} // .java 파일에 여러 개의 클래스 파일이 포함될 수 있다

public class 클래스_파일의_구조 { // public이 붙은 클래스는 파일 이름과 같아야 한다

    int a = 1; // 인스턴스 변수
    static int b = 1; // 클래스 변수


    void c () { // 메소드
        int d = 1; // 지역 변수
    }

    클래스_파일의_구조() {} // 생성자는 클래스와 이름이 같다

}
