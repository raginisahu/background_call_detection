package com.trucaller;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.content.BroadcastReceiver;
import java.util.Arrays;
import java.util.List;
import android.util.Log;
import android.telephony.TelephonyManager;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.WindowManager;
import java.io.IOException;


public class PhoneStateReceiver extends BroadcastReceiver
{

	 private static String mLastState;
	@Override
	public void onReceive(Context context, Intent intent)
	{
		try {
			 String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
			 String incomingnumber =intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
			// Toast.makeText(context,"incoming call" ,Toast.LENGTH_LONG).show();
		  if (!state.equals(mLastState)&&state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
         mLastState = state;
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
        alertDialogBuilder.setTitle("Incoming Call Notification");
				alertDialogBuilder.setMessage("Ringing Number Is : "+incomingnumber);
				alertDialogBuilder.setNegativeButton("cancel",
        new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) 
            {
             dialog.cancel();

                
            }
        });
				AlertDialog alertDialog = alertDialogBuilder.create();
				alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();

				
		  	Log.d("Caller_Service", "inside on PhoneStateReceiver  tr tast Function");       
      }
		} 
		catch (Exception e) 
		{
			Log.d("Caller_Service", "Error "+e);
			e.printStackTrace();	
	  }
		 
		  Log.d("Caller_Service", "inside on PhoneStateReceiver Function");   
  }

    
}




