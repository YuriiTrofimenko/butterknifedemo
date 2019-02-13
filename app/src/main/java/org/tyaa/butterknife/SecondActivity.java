package org.tyaa.butterknife;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Fragment secondFragment = new SecondFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
            .add(R.id.secondFragmentContainer, secondFragment, secondFragment.getTag())
            .commit();
    }
}
