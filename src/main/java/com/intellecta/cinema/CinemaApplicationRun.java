package com.intellecta.cinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CinemaApplicationRun {

    public static void main(String[] args) {

        SpringApplication.run(CinemaApplicationRun.class, args);
        List<Viewer> viewerList = new ArrayList<>();
        Viewer viewer1 = new Viewer("TestViewer1", 15, 2);
        Viewer viewer2 = new Viewer("TestViewer2", 23, 10);
        Viewer viewer3 = new Viewer("TestViewer3", 44, 123);
        Viewer viewer4 = new Viewer("TestViewer4", 12, 1);
        Viewer viewer5 = new Viewer("TestViewer5", 67, 23422);
        viewerList.add(viewer1);
        viewerList.add(viewer2);
        viewerList.add(viewer3);
        viewerList.add(viewer4);
        viewerList.add(viewer5);
        System.out.println(ViewerStatistics.averageAge(viewerList));
    }

}
