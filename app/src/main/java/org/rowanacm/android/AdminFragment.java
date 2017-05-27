package org.rowanacm.android;

import android.os.Bundle;
import android.support.annotation.LayoutRes;

import javax.inject.Inject;

import butterknife.OnClick;


public class AdminFragment extends BaseFragment {

    @Inject AdminManager adminManager;

    public AdminFragment() {

    }

    public static AdminFragment newInstance() {
        AdminFragment fragment = new AdminFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        ((AcmApplication)getActivity().getApplication()).getAcmComponent().inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public @LayoutRes int getLayout() {
        return R.layout.fragment_admin;
    }

    @Override
    public String getTitle() {
        return "ADMIN";
    }

    @OnClick(R.id.enable_attendance_button)
    public void enableAttendance() {
        adminManager.setAttendanceEnabled(true);
    }

    @OnClick(R.id.disable_attendance_button)
    public void disableAttendance() {
        adminManager.setAttendanceEnabled(false);
    }


}
