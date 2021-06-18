package com.example.appnotes;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);
        initDrawer();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main, new FragmentNotes())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item_one) {
            Toast.makeText(this, "item one", Toast.LENGTH_LONG).show();
            return true;
        }
        if (item.getItemId() == R.id.item_two) {
            Toast.makeText(this, "item two", Toast.LENGTH_LONG).show();
            return true;
        }
        if (item.getItemId() == R.id.item_three) {
            Toast.makeText(this, "item three", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void initDrawer() {
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.app_name,
                R.string.app_name
        );
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.item_one_navigation) {
                    Toast.makeText(getBaseContext(), "item one", Toast.LENGTH_LONG).show();
                    return true;
                }
                if (item.getItemId() == R.id.item_two_navigation) {
                    Toast.makeText(getBaseContext(), "item two", Toast.LENGTH_LONG).show();
                    return true;
                }
                if (item.getItemId() == R.id.item_three_navigation) {
                    Toast.makeText(getBaseContext(), "item three", Toast.LENGTH_LONG).show();
                    return true;
                }
                if (item.getItemId() == R.id.item_settings) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.main, new SettingsFragment())
                            .commit();
                    return true;
                }
                return false;
            }
        });
    }

}
