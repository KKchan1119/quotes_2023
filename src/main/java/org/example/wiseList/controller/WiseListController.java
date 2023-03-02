package org.example.wiseList.controller;

import org.example.wiseList.entity.WiseList;
import org.example.Container;

import java.util.ArrayList;
import java.util.List;

public class WiseListController {
    private int count;
    private final List<WiseList> wiseList;

    public WiseListController(){
        count = 0;
        wiseList = new ArrayList<>();
    }
    public void write(){
        int id = count +1;
        System.out.printf("명언 : ");
        String input = Container.getScanner().nextLine();
        System.out.printf("작가 : ");
        String writer = Container.getScanner().nextLine();
        WiseList wiseList1 = new WiseList(count, input, writer);
        wiseList.add(wiseList1);
        count = id;
        System.out.println(count+"번 명언이 등록되었습니다.");
    }

    public void list(){
        System.out.println("번호 / 작가 / 명언");
        System.out.println("-".repeat(30));
        for(int i = 0; i < wiseList.size(); i++) {
            WiseList wiseList1 = wiseList.get(i);

            System.out.printf("%d / %s / %s\n", wiseList1.getId(), wiseList1.getWriterName(), wiseList1.getContent());

        }
    }
}

