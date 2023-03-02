package org.example;

import org.example.system.controller.SystemController;
import org.example.wiseList.controller.WiseListController;
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
            }
        }

    }
}

