package androidx.fragment.app;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = null;
    final java.util.List<java.lang.String> mFragments;
    final java.util.List<androidx.fragment.app.BackStackRecordState> mTransactions;


    static {
            androidx.fragment.app.BackStackState$1 r0 = new androidx.fragment.app.BackStackState$1
            r0.<init>()
            androidx.fragment.app.BackStackState.CREATOR = r0
            return
    }

    BackStackState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mFragments = r0
            android.os.Parcelable$Creator<androidx.fragment.app.BackStackRecordState> r0 = androidx.fragment.app.BackStackRecordState.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.mTransactions = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<java.lang.String> r2 = r0.mFragments
            r1.writeStringList(r2)
            java.util.List<androidx.fragment.app.BackStackRecordState> r2 = r0.mTransactions
            r1.writeTypedList(r2)
            return
    }
}
