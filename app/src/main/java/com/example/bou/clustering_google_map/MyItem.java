package com.example.bou.clustering_google_map;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class MyItem implements ClusterItem {
    LatLng latLng;
    String Title;
    String Snippet;

    public MyItem(double lat,double lon) {
        latLng = new LatLng(lat,lon);
    }

    public MyItem(double lat, double lon, String title, String snippet) {
        Title = title;
        Snippet = snippet;
        latLng = new LatLng(lat,lon);
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setSnippet(String snippet) {
        Snippet = snippet;
    }

    @Override
    public LatLng getPosition() {
        return latLng;
    }

    @Override
    public String getTitle() {
        return Title;
    }

    @Override
    public String getSnippet() {
        return Snippet;
    }
}
