package com.example.gresa_pc.openprject.ui.view;

import com.example.gresa_pc.openprject.model.ParkingSite;
import java.util.List;

/**
 * Created by Gresa-PC on 3/29/2017.
 */

public interface ParkingSitesContract {
    interface LoadListenerParkingSites {
        void onLoadedParkingSites(List<ParkingSite> parkingSiteList);
        void onErrorParkingSites(String message);
    }
    void getParkings(LoadListenerParkingSites listener);
}
