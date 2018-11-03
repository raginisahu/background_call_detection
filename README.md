# background_call_detection
this project can use for background call detection in react native


# react-native-call-checker

## Getting started

`$ npm install react-native-call-checker --save`

### Mostly automatic installation

`$ react-native link react-native-call-checker`

### Manual installation


#### Android

1. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-call-checker'
  	project(':react-native-call-checker').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-call-checker/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-call-checker')

or if your sdk verison is greater than 25 
     
      implementation project(':react-native-call-checker')

      
  	```
4. Insert the following lines inside the AndroidManifest.xml in `android/app/src/main/AndroidManifest.xml`:
  	```
	  <manifest ....>
                  <uses-permission android:name="android.permission.READ_PHONE_STATE"/>
                  <uses-permission android:name="android.permission.DISABLE_KEYGUARD" />
                  <uses-permission android:name="android.permission.WAKE_LOCK" />
	  		.....
			<application ...>
					.....
			        <receiver
						android:name="com.trucaller.PhoneStateReceiver"
						android:enabled="true"
						android:exported="true">
						<intent-filter>
		                               <action 
                                              android:name="com.android.vending.INSTALL_REFERRER"/>
					      </intent-filter>
        			</receiver>
   			</application>
      </manifest>
  	```

## Usage
//After installtion of this npm it work directly when you received the call in your  phone then Alert message dialog box will display on screen.
  
