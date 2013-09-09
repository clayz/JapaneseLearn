package com.clay.japanese.fragments;

import com.clay.japanese.R;
import com.clay.japanese.activities.BaseFrameActivity;
import com.clay.japanese.common.Menu;
import com.clay.japanese.common.Menu.Item;
import com.clay.japanese.common.Menu.MenuItem;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 12, 2013
 * @version 0.1
 */
public class MenuFragment extends ListFragment {
    private static final String TAG = MenuFragment.class.getSimpleName();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.menu, null);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MenuListAdapter adapter = new MenuListAdapter(this.getActivity());
        new Menu(this).addItems(adapter);
        super.setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Fragment fragment = MenuItem.getMenuFragment(position);
        if (fragment != null) ((BaseFrameActivity) this.getActivity()).switchFragment(fragment);
    }

    public class MenuListAdapter extends ArrayAdapter<Item> {
        public MenuListAdapter(Context context) {
            super(context, 0);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Item item = super.getItem(position);
            Log.d(TAG, "Add menu item: " + item.toString());

            if (item.parent == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_menu, null);
                ((TextView) convertView.findViewById(R.id.row_menu_section)).setText(item.text);
            } else {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.row, null);

                TextView row = (TextView) convertView.findViewById(R.id.row);
                row.setText(item.text);
                row.setCompoundDrawablesWithIntrinsicBounds(item.icon, 0, 0, 0);
            }

            return convertView;
        }
    }
}
