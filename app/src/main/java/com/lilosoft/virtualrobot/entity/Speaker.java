package com.lilosoft.virtualrobot.entity;

import android.os.Parcel;

/**
 * @author Richie on 2019.03.27
 */
public class Speaker extends EntityParcelable {
    public static final Creator<Speaker> CREATOR = new Creator<Speaker>() {
        @Override
        public Speaker createFromParcel(Parcel source) {
            return new Speaker(source);
        }

        @Override
        public Speaker[] newArray(int size) {
            return new Speaker[size];
        }
    };
    private String code;

    public Speaker(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Speaker() {
    }

    protected Speaker(Parcel in) {
        super(in);
        this.code = in.readString();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "code='" + code + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(this.code);
    }
}
