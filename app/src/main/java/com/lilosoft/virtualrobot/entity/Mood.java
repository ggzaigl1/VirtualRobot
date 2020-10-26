package com.lilosoft.virtualrobot.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.faceunity.fuenum.FUEmotionType;

/**
 * 表情
 */
public class Mood extends EntityParcelable {
    public static final Parcelable.Creator<Mood> CREATOR = new Parcelable.Creator<Mood>() {
        @Override
        public Mood createFromParcel(Parcel source) {
            return new Mood(source);
        }

        @Override
        public Mood[] newArray(int size) {
            return new Mood[size];
        }
    };

    private FUEmotionType type;

    public Mood(FUEmotionType type, String name) {
        this.type = type;
        this.name = name;
    }

    protected Mood(Parcel in) {
        super(in);
        this.type = in.readParcelable(FUEmotionType.class.getClassLoader());
    }

    @Override
    public String toString() {
        return "Mood{" +
                " Type=" + type +
                '}';
    }

    public FUEmotionType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Mood mood = (Mood) o;

        return type.getValue() == mood.type.getValue();
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.type, flags);
    }
}
