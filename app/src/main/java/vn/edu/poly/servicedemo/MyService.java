package vn.edu.poly.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("HELLO", "Service chay roi!!!");

        String data = intent.getStringExtra("data");
        Log.e("DATA", data);

        


        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.

        Log.e("HELLO", "Service chay roi!!!");

        throw new UnsupportedOperationException("Not yet implemented");


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "onDestroy");
    }


}
