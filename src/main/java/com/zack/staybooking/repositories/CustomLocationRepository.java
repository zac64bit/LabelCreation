package com.zack.staybooking.repositories;

import java.util.List;

public interface CustomLocationRepository {
    List<Long> searchByDistance(double lat, double lon, String distance);
}