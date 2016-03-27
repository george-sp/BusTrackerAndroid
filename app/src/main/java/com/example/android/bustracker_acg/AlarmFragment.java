package com.example.android.bustracker_acg;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by giorgos on 3/26/2016.
 */

public class AlarmFragment extends Fragment {

    // LOG_TAG
    protected static final String TAG = "Alarm Fragment";
    // TimePickerFragment
//    private TimePickerFragment timePickerFragment;
    // Construct the data source
    ArrayList<Calendar> calendars = new ArrayList<Calendar>();
    // AlarmListAdapter
    static AlarmListAdapter alarmListAdapter;


    // Every fragment must have a default empty constructor.
    public AlarmFragment(){}


    /*
    Overriding the lifecycle methods
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.e(TAG, "onAttach()");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate()");

        // Create the adapter to convert the array to views
        alarmListAdapter = new AlarmListAdapter(getActivity(), calendars);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView()");
        return inflater.inflate(R.layout.fragment_alarm, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(TAG, "onViewCreated()");


        // Attach the adapter to the ListView
        ListView listView = (ListView) view.findViewById(R.id.alarm_list_view);
        listView.setAdapter(alarmListAdapter);


        ImageButton createAlarmButton = (ImageButton) view.findViewById(R.id.create_alarm_button);
        createAlarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){


            }
        });

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onActivityCreated()");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e(TAG, "onViewStateRestored()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart()  ============");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onDetach()");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            //do when hidden
            Log.e(TAG, "do when hidden");

        } else {
            //do when shown
            Log.e(TAG, "do when shown");
        }
    }


//    public static class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
//
//        private int selectedHours;
//        private int selectedMinutes;
//
//        final Calendar calendar = Calendar.getInstance();
//
//        @Override
//        public Dialog onCreateDialog(Bundle savedInstanceState){
//
//            // Use the current time as the default values for the time picker
//            int hour = calendar.get(Calendar.HOUR_OF_DAY);
//            int minute = calendar.get(Calendar.MINUTE);
//
//            // Create and return a new instance of TimePickerDialog
//            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), TimePickerDialog.THEME_DEVICE_DEFAULT_DARK,this, hour, minute,
//                    DateFormat.is24HourFormat(getActivity()));
//            timePickerDialog.setTitle("Set your own alarm");
//            return timePickerDialog;
//        }
//
//        //onTimeSet() callback method
//        public void onTimeSet(TimePicker view, int hourOfDay, int minute){
//            // Do something with the user chosen time
//            selectedHours = hourOfDay;
//            selectedMinutes = minute;
//
//
////            calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
////            calendar.set(Calendar.MINUTE, minute);
////            // Add it to listAdapter
////            alarmListAdapter.add(calendar);
//        }
//
//        public int getSelectedHours(){
//            return selectedHours;
//        }
//
//        public int getSelectedMinutes(){
//            return selectedMinutes;
//        }
//
//    }


}