package org.example;

import org.example.system.controller.SystemController;
import org.example.wiseList.controller.WiseListController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public void run() {
        System.out.println("== 명언 앱 ==");

        SystemController systemController = new SystemController();
        WiseListController wiseListController = new WiseListController();

        while (true) {
            System.out.printf("명령) ");
            //trim() = 좌우 공백 제거
            String cmd = Container.getScanner().nextLine().trim();

            if (cmd.equals("등록")) {
                wiseListController.write();
            } else if (cmd.equals("목록")) {
                wiseListController.list();
            } else if (cmd.equals("종료")) {
                systemController.exit();
                break;
            } else if(cmd.startsWith("삭제")){//cmd가 삭제로 시작하는지 확인

                String[] cmdBits = cmd.split("\\?", 2); //기준 ? 로 나누고 최대 2개까지

                String actionCode = cmdBits[0];
                Map<String, String> params = new HashMap<>();

                String[] paramsBits = cmdBits[1].split("&");

               for(String paramStr : paramsBits){
                    String[] paramStrBits = paramStr.split("=", 2);

                    String key = paramStrBits[0];
                    String value =paramStrBits[1];

                    params.put(key, value);
               }

                System.out.printf("actionCode : %s\n", actionCode);
                System.out.printf("params : %s\n", params);

                wiseListController.remove();
            }
        }

    }
}

