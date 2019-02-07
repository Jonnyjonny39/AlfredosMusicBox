package com.example.jonnyjonny.alfredosmusicbox;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        setupViewPager();
    }

    private void setupViewPager() {
       SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
       adapter.addFragment(new AboutMeFragment());
       adapter.addFragment(new MusicFragment());
       adapter.addFragment(new ContactFragment());
       adapter.addFragment(new BassInYourFaceFragment());
        ViewPager vp=(ViewPager)findViewById(R.id.viewPager);
        vp.setAdapter(adapter);
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tabs);
         tabLayout.setupWithViewPager(vp);
         tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
         tabLayout.setTabTextColors(getResources().getColor(android.R.color.background_light),getResources().getColor(android.R.color.black));

         tabLayout.getTabAt(0).setText("About Me");
         tabLayout.getTabAt(1).setText("My Music");
         tabLayout.getTabAt(2).setText("Contact Me");
         tabLayout.getTabAt(3).setText("Bass In Your Face!");
    }
    class SectionsPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment>mFragmentList=new ArrayList<>();
        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }
        public void addFragment(Fragment fragment){
            mFragmentList.add(fragment);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share_menu2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item_share4:
                switch (item.getItemId()){
                    case R.id.menu_item_share4:
                        try{
                            Intent shareIntent=new Intent(Intent.ACTION_SEND);
                            shareIntent.setType("text/plain");
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Alfredo's MusicBox");
                            String shareMessage="Come Check Out My Music!";
                            shareMessage=shareMessage+"https://www.alfredosgroove.com";
                            shareIntent.putExtra(Intent.EXTRA_TEXT,shareMessage);
                            startActivity(Intent.createChooser(shareIntent,"Choose One"));

                        }catch (Exception e){
                            e.printStackTrace();
                        }

                        break;
                }}
        return super.onOptionsItemSelected(item);
    }
}
