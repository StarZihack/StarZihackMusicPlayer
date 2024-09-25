package com.example.starzihackmusicplayer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import fragments.AlbumsFragment;
import fragments.ArtistsFragment;
import fragments.FoldersFragment;
import fragments.FoldersFragment;
import fragments.SongsFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position){
        switch (position){
            case 0:
                return new SongsFragment();
            case 1:
                return new ArtistsFragment();
            case 2:
                return new AlbumsFragment();
            case 3:
                return new FoldersFragment();
            default:
                return new SongsFragment();
        }
    }

    @Override
    public int getItemCount(){
        return 4; //Total number of tabs
    }
}
