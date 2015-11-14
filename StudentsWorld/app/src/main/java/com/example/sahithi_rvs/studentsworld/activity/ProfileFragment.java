package com.example.sahithi_rvs.studentsworld.activity;


import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sahithi_rvs.studentsworld.R;


public class ProfileFragment extends Fragment {

    // Progress Dialog Object
    ProgressDialog prgDialog;
    // Error Msg TextView Object
    TextView errorMsg;
    // First Name Edit View Object
    EditText firstnameET;
    // Last Name Edit View Object
    EditText lastnameET;
    // Start Degree Edit View Object
    EditText startdegreeET;
    // End Degree Edit View Object
    EditText enddegreeET;
    // Address Edit View Object
    EditText addressline1ET;
    // Address2 Edit View Object
    EditText addressline2ET;
    // College Edit View Object
    EditText collegeET;
    // DOB Edit View Object
    EditText dobET;
    // Mobile Edit View Object
    EditText mobileEt;
    // Degree Edit View Object
    EditText degreeET;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        //errorMsg = (TextView)rootView.findViewById(R.id.register_error);
        // Find Name Edit View control by ID
        firstnameET = (EditText)rootView.findViewById(R.id.first_name);
        // Find Email Edit View control by ID
        lastnameET = (EditText)rootView.findViewById(R.id.last_name);
        // Find Password Edit View control by ID
        startdegreeET = (EditText)rootView.findViewById(R.id.start_degree);
        // Instantiate Progress Dialog object
        enddegreeET = (EditText)rootView.findViewById(R.id.end_degree);
        // Instantiate Progress Dialog object
        addressline1ET = (EditText)rootView.findViewById(R.id.address_line1);
        // Instantiate Progress Dialog object
        addressline2ET = (EditText)rootView.findViewById(R.id.address_line2);
        // Instantiate Progress Dialog object
        dobET = (EditText)rootView.findViewById(R.id.dob);
        // Instantiate Progress Dialog object
        collegeET = (EditText)rootView.findViewById(R.id.college_name);
        // Find Mobile edit View Control by ID
        mobileEt = (EditText)rootView.findViewById(R.id.mobile_no);
        // Find Degree edit View Control by ID
        degreeET = (EditText)rootView.findViewById(R.id.degree);
        // Instantiate Progress Dialog object
       // prgDialog = new ProgressDialog(this);
        // Set Progress Dialog Text
        //prgDialog.setMessage("Please wait...");
        // Set Cancelable as False
        //prgDialog.setCancelable(false);

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
