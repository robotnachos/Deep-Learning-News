package com.example.android.deeplearningnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sal on 3/7/17.
 */

public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        News currentNewsItem = getItem(position);

        TextView headline = (TextView) listItemView.findViewById(R.id.title);
        headline.setText(currentNewsItem.getHeadline());

        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentNewsItem.getAuthor());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentNewsItem.getDate());

        TextView section = (TextView) listItemView.findViewById(R.id.section);
        section.setText(currentNewsItem.getSection());

        return listItemView;

    }

}
