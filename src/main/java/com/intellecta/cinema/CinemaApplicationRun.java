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
        Cinema film = new Cinema("Inception", "triller", 1.6f);
        ArrayList<Cinema> filmList = new ArrayList<>();
        filmList.add(film);
        Viewer viewer1 = new Viewer("TestViewer1", 15, filmList);
        Viewer viewer2 = new Viewer("TestViewer2", 23, filmList);
        Viewer viewer3 = new Viewer("TestViewer3", 44, filmList);
        Viewer viewer4 = new Viewer("TestViewer4", 12, filmList);
        Viewer viewer5 = new Viewer("TestViewer5", 67, filmList);
        viewerList.add(viewer1);
        viewerList.add(viewer2);
        viewerList.add(viewer3);
        viewerList.add(viewer4);
        viewerList.add(viewer5);
        System.out.println(ViewerStatistics.averageAge(viewerList));
    }

}
