package com.example.android.deeplearningnews;

/**
 * Created by sal on 3/7/17.
 */

public class News{

    private String mHeadline;
    private String mAuthor;
    private String mDate;
    private String mSection;

    /**
     *
     * @param headline The title of the article
     * @param author The author of the article
     * @param date The date that is the article was published
     * @param section The section of newspaper the article belongs to.
     */
    public News(String headline, String author, String date, String section){

        mHeadline = headline;
        mAuthor = author;
        mDate = date;
        mSection = section;

    }

    public String getHeadline(){
        return mHeadline;
    }

    public String getAuthor(){
        return mAuthor;
    }

    public String getDate(){
        return mDate;
    }

    public String getSection(){
        return mSection;
    }
}

