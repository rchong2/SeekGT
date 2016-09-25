package doggied1g1ts.seekgt;


import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Chris on 9/24/2016.
 */

public class GPSManager extends AppCompatActivity {

    LocationManager locationManager = null;

    MyLocationListener locationListener = null;
    public void getSelfGPS(){
        if (locationManager == null)
            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (locationListener == null)
            locationListener = new MyLocationListener();


        locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER, 5000, 10, locationListener);



    }



}

/*---------- Listener class to get coordinates ------------- */
class MyLocationListener implements LocationListener {



    @Override
    public void onLocationChanged(Location loc) {

    }

    @Override
    public void onProviderDisabled(String provider) {}

    @Override
    public void onProviderEnabled(String provider) {}


    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {}
}
