package com.rahul.blx.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rahul.blx.Fragments.AccountFragment;
import com.rahul.blx.Fragments.CategoriesFragment;
import com.rahul.blx.Fragments.HomeFragment;
import com.rahul.blx.Fragments.LikesFragment;
import com.rahul.blx.Fragments.MessageFragment;
import com.rahul.blx.R;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        defView();
    }

    private void defView() {

        HomeFragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.flFragment, homeFragment, "home").addToBackStack("hello").commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.homefrag:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.messagefrag:

                    selectedFragment = new MessageFragment();
                    break;
                case R.id.categoriesfrag:
                    selectedFragment = new CategoriesFragment();
                    break;
                case R.id.likesfrag:
                    selectedFragment = new LikesFragment();
                    break;
                case R.id.accountfrag:
                    selectedFragment = new AccountFragment();
                    break;


            }
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, selectedFragment).addToBackStack("hello").commit();
            return true;
        }


    };


}