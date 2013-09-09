/**
 * 
 */
package com.clay.japanese.common;

import android.support.v4.app.Fragment;

import com.clay.japanese.R;
import com.clay.japanese.fragments.BookmarkFragment;
import com.clay.japanese.fragments.GrammarFragment;
import com.clay.japanese.fragments.LessionFragment;
import com.clay.japanese.fragments.SettingFragment;
import com.clay.japanese.fragments.WordFragment;
import com.clay.japanese.fragments.WordNoteFragment;
import com.clay.japanese.fragments.MenuFragment.MenuListAdapter;

/**
 * @author Clay Zhong
 * @email zjclay@gmail.com
 * @date Jul 20, 2013
 * @version 0.1
 */
public class Menu {
    private Fragment fragment;

    public Menu(Fragment fragment) {
        this.fragment = fragment;
    }

    public void addItems(MenuListAdapter menuListAdapter) {
        Item channel = new Item(R.string.menu_channel);
        menuListAdapter.add(channel);
        menuListAdapter.add(new Item(R.string.menu_channel_lesson, android.R.drawable.ic_menu_search, channel));
        menuListAdapter.add(new Item(R.string.menu_channel_grammar, android.R.drawable.ic_menu_search, channel));
        menuListAdapter.add(new Item(R.string.menu_channel_word, android.R.drawable.ic_menu_search, channel));

        Item tool = new Item(R.string.menu_tool);
        menuListAdapter.add(tool);
        menuListAdapter.add(new Item(R.string.menu_tool_word_note, android.R.drawable.ic_menu_search, tool));
        menuListAdapter.add(new Item(R.string.menu_tool_bookmark, android.R.drawable.ic_menu_search, tool));

        Item system = new Item(R.string.menu_system);
        menuListAdapter.add(system);
        menuListAdapter.add(new Item(R.string.menu_system_setting, android.R.drawable.ic_menu_search, tool));
        menuListAdapter.add(new Item(R.string.menu_system_exit, android.R.drawable.ic_menu_search, tool));
    }

    public class Item {
        public int textId;
        public int icon;
        public String text;
        public Item parent;

        public Item(int textId) {
            this.textId = textId;
            this.text = this.getString(textId);
        }

        public Item(int textId, int icon, Item parent) {
            super();
            this.textId = textId;
            this.text = this.getString(textId);
            this.icon = icon;
            this.parent = parent;
        }

        protected String getString(int id) {
            return fragment.getString(id);
        }

        @Override
        public String toString() {
            return "Item [text=" + text + ", icon=" + icon + ", parent=" + parent + "]";
        }
    }

    public enum MenuItem {
        Lession(1), Grammar(2), Word(3), WordNote(5), Bookmark(6), Setting(8), Exit(9);

        int position;

        MenuItem(int position) {
            this.position = position;
        }

        public static MenuItem getItem(int position) {
            if (position == Lession.position) return Lession;
            else if (position == Grammar.position) return Grammar;
            else if (position == Word.position) return Word;
            else if (position == WordNote.position) return WordNote;
            else if (position == Bookmark.position) return Bookmark;
            else if (position == Setting.position) return Setting;
            else if (position == Exit.position) return Exit;
            else return null;
        }

        public static Fragment getMenuFragment(int position) {
            MenuItem item = getItem(position);

            if (Lession.equals(item)) return new LessionFragment();
            else if (Grammar.equals(item)) return new GrammarFragment();
            else if (Word.equals(item)) return new WordFragment();
            else if (WordNote.equals(item)) return new WordNoteFragment();
            else if (Bookmark.equals(item)) return new BookmarkFragment();
            else if (Setting.equals(item)) return new SettingFragment();
            else return null;
        }
    }
}