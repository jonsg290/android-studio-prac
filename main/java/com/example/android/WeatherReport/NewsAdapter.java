/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.WeatherReport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.onClick;

/**
 * {@link NewsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link News} objects.
 */
public class NewsAdapter extends ArrayAdapter<News>  {

    /** Resource ID for the background color for this list of words */
    //private int mColorResourceId;

    /**
     * Create a new {@link NewsAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param scoop is the list of {@link News} to be displayed.
     */
    public NewsAdapter(Context context, ArrayList<News> scoop) {
        super(context, 0, scoop);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.weather_list_item, parent, false);
        }

        // Get the {@link food} object located at this position in the list
        News currentES= getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView artView = (TextView) listItemView.findViewById(R.id.art);
        // Get the mag from the currentES object and set this text on
        // the magView
        artView.setText( currentES.getCat() + "| " + currentES.getTitle());





        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView date = (TextView) listItemView.findViewById(R.id.dat);
        // Get the location from the currentES object and set this text on
        // the locView.
        String ct = currentES.getDate();
        date.setText(ct);


        TextView url = (TextView) listItemView.findViewById(R.id.curl);
        String u = currentES.getUrlLink();
        url.setText(u);



        //TextView maxtView = (TextView) listItemView.findViewById(R.id.maxt);
        // Get the date from the currentES object and set this text on
        // the dateView.
       // String cmxt = currentES.getCat() + "°";
       // maxtView.setText(cmxt);

       // TextView mintView = (TextView) listItemView.findViewById(R.id.mint);
        // Get the date from the currentES object and set this text on
        // the dateView.
        //String urlT = currentES.getUrlLink();
       // mintView.setText(urlT);



        //get text from zip code input
        // Set the theme color for the list item
        //View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        //int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        //textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.

        return listItemView;

    }

}