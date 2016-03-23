/**********************************************************************
 * Title: Solar Compass
 * Description: Android app for finding directions using the sun
 * Author: Agnibho Mondal
 * Website: http://code.agnibho.com/solarcompass
 **********************************************************************
 Copyright (c) 2016 Agnibho Mondal
 All rights reserved
 **********************************************************************
 This file is part of Solar Compass.

 Solar Compass is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Solar Compass is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Solar Compass.  If not, see <http://www.gnu.org/licenses/>.
 **********************************************************************/

package com.agnibho.android.solarcompass;

import sparta.checkers.quals.Sink;

import static sparta.checkers.quals.FlowPermissionString.DISPLAY;

public class LocationData {
    private static LocationData ourInstance = new LocationData();

    public static LocationData getInstance() {
        return ourInstance;
    }

    private LocationData() {
    }

    @Sink(DISPLAY) private double latitude;
    @Sink(DISPLAY) private double longitude;
    private boolean available=false;

    protected void setCoordinate(@Sink(DISPLAY) double lat, @Sink(DISPLAY) double lon){
        latitude=lat;
        longitude=lon;
        available=true;
    }
    protected @Sink(DISPLAY) double getLatitude(){
        return latitude;
    }
    protected @Sink(DISPLAY) double getLongitude(){
        return longitude;
    }
    protected boolean isAvailable() { return available; }
}
