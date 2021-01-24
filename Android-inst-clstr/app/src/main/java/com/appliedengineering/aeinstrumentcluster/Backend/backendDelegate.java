package com.appliedengineering.aeinstrumentcluster.Backend;

import android.os.AsyncTask;
import android.os.SystemClock;

import com.appliedengineering.aeinstrumentcluster.Backend.*;

import org.zeromq.ZMQ;
import org.zeromq.ZMQException;

import java.nio.charset.Charset;

// Class design found here: https://stackoverflow.com/a/36155334/
public class backendDelegate extends AsyncTask<Void, Void, Void>{

    private volatile boolean isRunning = true;

    // options

    private String protocolString = "udp";
    private String connectionIPAddress = "";
    private String connectionPort = "";
    private String connectionAddress = "";
    private String connectionGroup = "";
    private int receiveReconnect = -1;
    private int receiveTimeout = -1;
    private int reconnectTimeout = -1;
    private int receiveBuffer = 60;

    // end options

    @Override
    protected void onCancelled(){
        isRunning = false;
        communication.deinit();
    }

    @Override
    protected Void doInBackground(Void... params) {

        while (isRunning){
<<<<<<< Updated upstream
            /*try {
                //System.out.println(communication.dish.recv());
=======
            try {
                System.out.println("testing recv - " + communication.sub.recvStr(Charset.defaultCharset()));
                /*byte[] buffer = communication.recv();
                if (buffer != null) {
                    System.out.println("recv: " + buffer.length);
                }*/
>>>>>>> Stashed changes
            }
            catch (ZMQException e){
                if (!e.equals(ZMQ.Error.EAGAIN)){
                    System.out.println("Error - " + e.getMessage());
                }
            }*/
            SystemClock.sleep(1000);
        }
        return null;
    }

    public backendDelegate(){
        communication.init();
<<<<<<< Updated upstream
        communication.connect("udp://224.0.0.1:28650", "telemetry", 3000, 10);
=======
        System.out.println(communication.connect("tcp://192.168.1.10:1234", "telemetry", 3000, 10));
>>>>>>> Stashed changes
    }

    // preferences
    private void loadPreferences(){

    }

    private void savePreferences(){

    }
    // end preferences

}
