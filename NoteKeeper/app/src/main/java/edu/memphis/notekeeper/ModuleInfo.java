package edu.memphis.notekeeper;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;

public class ModuleInfo implements Parcelable {

    private final String mModuleId;
    private final String mTitle;
    private boolean mIsComplete = false;

    public ModuleInfo(String moduleId, String title) {
        this (moduleId, title, false);
    }

    public ModuleInfo(String moduleId, String title, boolean isComplete) {
        this.mModuleId=moduleId;
        this.mTitle = title;
        this.mIsComplete = isComplete;
    }

    private ModuleInfo(Parcel source){
        mModuleId = source.readString();
        mTitle = source.readString();
        mIsComplete = source.readByte() == 1;
    }

    public String getModuleId() {
        return mModuleId;
    }

    public String getTitle() {
        return mTitle;
    }

    public boolean isComplete() {
        return mIsComplete;
    }

    public void setComplete(boolean complete) {
       mIsComplete = complete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModuleInfo that = (ModuleInfo) o;
        return mIsComplete == that.mIsComplete &&
                Objects.equals(mModuleId, that.mModuleId) &&
                Objects.equals(mTitle, that.mTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mModuleId, mTitle, mIsComplete);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mModuleId);
        parcel.writeString(mTitle);
        parcel.writeByte((byte)(mIsComplete ? 1:0));
    }

    public static final Creator<ModuleInfo> CREATOR =
            new Creator<ModuleInfo>(){
                @Override
                public ModuleInfo createFromParcel(Parcel parcel) {
                    return new ModuleInfo(parcel);
                }

                @Override
                public ModuleInfo[] newArray(int i) {
                    return new ModuleInfo[i];
                }
            };
}
