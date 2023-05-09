package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile(){
        System.out.println("신상 정보 출력 테스트");
    }
    public void empInformation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("사원의 이름: ");
        String name = scan.next();
        System.out.println("이름은 " + name + "입니다.");
    }
}
