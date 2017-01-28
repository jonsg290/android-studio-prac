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

/**
 * {@link   News} represents a item that one might buy from the pizza place
 * It contains a name, a price, and an image for that food item.
 */
public class News {

    private String title;

    private String date;

    private String cat;

    private String urlLink;

    /**
     * Create a new food object.
     *
     * @param dTitle is the title of the news thing
     * @param dDate is the date the news thing was first published
     * @param dCat is the type of news thing
     * @param dUrlLink  is the url for the title clicked
     */
    public News(String dTitle, String dDate, String dCat, String dUrlLink) {
        title = dTitle;
        date = dDate;
        cat = dCat;
        urlLink = dUrlLink;
    }


    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getCat() {
        return cat;
    }

    public String getUrlLink() {
        return urlLink;
    }
}



