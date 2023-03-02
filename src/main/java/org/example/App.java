package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private final Scanner sc;

    public App(Scanner sc){
        this.sc = sc;
    }

        public void run() {
            int count = 0;

            System.out.println("== 명언 앱 ==");
            List<WiseList> wiseList = new ArrayList<>();

            while(true) {
                System.out.printf("명령) ");
                //trim() = 좌우 공백 제거
                String cmd = sc.nextLine().trim();
                if(cmd.equals("등록")){
                    int id = count +1;
                    System.out.printf("명언 : ");
                    String input = sc.nextLine();
                    System.out.printf("작가 : ");
                    String writer = sc.nextLine();
                    WiseList wiseList1 = new WiseList(count, input, writer);
                    wiseList.add(wiseList1);
                    count = id;
                    System.out.println(count+"번 명언이 등록되었습니다.");
                }

                if(cmd.equals("목록")){
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------------");
                    System.out.println("생성된 명언 수: "+wiseList.size());
                }



                if(cmd.equals("종료")){
                    break;
                }
            }
    }
}
