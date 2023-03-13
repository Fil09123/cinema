package com.intellecta.cinema;

import javax.swing.text.View;
import java.util.List;

public class ViewerStatistics {
    public static int averageAge(List<Viewer> viewers) {
        int sumAge = 0;
        for (Viewer viewer: viewers
             ) {
            sumAge += viewer.getAge();
        }
        return sumAge / viewers.size();
    }
}
