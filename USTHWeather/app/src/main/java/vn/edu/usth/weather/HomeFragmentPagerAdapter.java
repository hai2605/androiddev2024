import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import vn.edu.usth.weather.WeatherAndForecastFragment;

public class HomeFragmentPagerAdapter extends FragmentStateAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
    public HomeFragmentPagerAdapter(AppCompatActivity fm) {
        super(fm);
    }
    @Override
    public int getItemCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @Override
    public Fragment createFragment(int page) {
// returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0: new WeatherAndForecastFragment();
            case 1: new WeatherAndForecastFragment();
            case 2: new WeatherAndForecastFragment();
        }
        return new WeatherAndForecastFragment(); // failsafe
    }

    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }
}