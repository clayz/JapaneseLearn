/**
 * 
 */
package com.clay.japanese.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;

import com.actionbarsherlock.view.Menu;
import com.clay.japanese.R;
import com.clay.japanese.fragments.MenuFragment;
import com.clay.japanese.services.ServiceManager;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 11, 2013
 * @version 0.1
 */
public abstract class BaseFrameActivity extends SlidingFragmentActivity {
    private int mTitleRes;
    protected ListFragment menuFragment;

    public BaseFrameActivity(int titleRes) {
        this.mTitleRes = titleRes;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setTitle(mTitleRes);

        // set the Behind View
        setBehindContentView(R.layout.menu_frame);

        if (savedInstanceState == null) {
            FragmentTransaction t = this.getSupportFragmentManager().beginTransaction();
            menuFragment = new MenuFragment();
            t.replace(R.id.menu_frame, menuFragment);
            t.commit();
        } else {
            menuFragment = (ListFragment) this.getSupportFragmentManager().findFragmentById(R.id.menu_frame);
        }

        // customize the SlidingMenu
        SlidingMenu sm = getSlidingMenu();
        sm.setShadowWidthRes(R.dimen.slidingmenu_shadow_width);
        sm.setShadowDrawable(R.drawable.shadow);
        sm.setBehindWidthRes(R.dimen.slidingmenu_width);
        sm.setFadeDegree(0.35f);
        sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ServiceManager.getInstance().release(this);
    }

    abstract public void switchFragment(Fragment fragment);
}
