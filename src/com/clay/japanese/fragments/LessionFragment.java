/**
 * 
 */
package com.clay.japanese.fragments;

import java.sql.SQLException;

import com.clay.japanese.R;
import com.clay.japanese.common.Pager;
import com.clay.japanese.db.models.Book;
import com.clay.japanese.services.BookService;
import com.clay.japanese.services.ServiceManager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 22, 2013
 * @version 0.1
 */
public class LessionFragment extends BaseListFragment {
    private static final String TAG = LessionFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lession, container, false);

        try {
            BookService bookService = ServiceManager.getInstance().getBookService(this.getActivity());
            Pager<Book> bookPager = bookService.list();

            BookListAdapter adapter = new BookListAdapter(this.getActivity());
            super.setListAdapter(adapter);

            for (Book book : bookPager.getData()) {
                Log.d(TAG, "Added book: " + book.getTitleJP());
                adapter.add(book);
            }
        } catch (SQLException e) {
            Log.e(TAG, "Initialize failed.", e);
            super.onError(inflater, container, savedInstanceState);
        }

        return view;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {}

    public class BookListAdapter extends ArrayAdapter<Book> {
        public BookListAdapter(Context context) {
            super(getActivity(), 0);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_book, null);
            final Book book = super.getItem(position);
            Log.d(TAG, "Render book: " + book.toString());

            ((TextView) convertView.findViewById(R.id.book_title)).setText(book.getTitleJP());
            ((TextView) convertView.findViewById(R.id.book_subtitle)).setText(book.getSubtitleJP());

            final int coverId = getResources().getIdentifier(book.getCover(), "drawable", getContext().getPackageName());
            ((ImageView) convertView.findViewById(R.id.book_cover)).setImageResource(coverId);

            convertView.setClickable(true);
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Click book: " + book.toString());
                }
            });

            return convertView;
        }
    }
}
