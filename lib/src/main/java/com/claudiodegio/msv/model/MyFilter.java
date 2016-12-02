package com.claudiodegio.msv.model;

import android.view.View;

/**
 * Created by claud on 02/11/2016.
 */

public class MyFilter extends BaseElement {
    private int mId;
    private int mIconRefId;
    private int mIconBgColor;
    private int mType;

    public MyFilter(int type, String name, int id, int iconRefId, int iconBgColor) {
        super(name);
        this.mType = type;
        this.mIconRefId = iconRefId;
        this.mId = id;
        this.mIconBgColor = iconBgColor;
    }

    public MyFilter(int type, String name) {
        this(type, name, View.NO_ID, View.NO_ID, View.NO_ID);
    }

    public int getType() {
        return mType;
    }

    public int getIconBgColor() {
        return mIconBgColor;
    }

    public int getIconRefId() {
        return mIconRefId;
    }

    public int getId() {
        return mId;
    }


}
