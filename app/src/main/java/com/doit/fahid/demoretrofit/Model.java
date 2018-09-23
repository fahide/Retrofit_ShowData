package com.doit.fahid.demoretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by FAHID on 9/23/2018.
 */

public class Model {

    @SerializedName("Course_code")
    private String id;
    @SerializedName("Course_title")
    private String session;
    @SerializedName("Credits")
    private String credits;
    @SerializedName("Semester")
    private String Semester;

    public String getCredits() {
        return credits;
    }

    public String getSemester() {
        return Semester;
    }

    public String getId() {
        return id;
    }

    public String getSession() {
        return session;
    }
}
