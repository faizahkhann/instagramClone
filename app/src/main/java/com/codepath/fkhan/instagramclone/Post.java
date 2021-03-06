package com.codepath.fkhan.instagramclone;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")

public class Post extends ParseObject {
    public static final String KEY_DESCRIPTION = "Description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATED = "createdAt";


    public String getDescription () {
        return getString (KEY_DESCRIPTION); //getString is from ParseObject class
    }

    public void setDescription (String description) {
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage () {
        return getParseFile (KEY_IMAGE); //getParseFile is from ParseObject class
    }

    public void setImage (ParseFile parseFile) {
        put (KEY_IMAGE, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser (ParseUser user) {
        put (KEY_USER, user);
    }
}
