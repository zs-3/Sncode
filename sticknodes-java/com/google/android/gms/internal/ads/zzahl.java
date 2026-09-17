package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzahl implements android.os.Parcelable.Creator {
    zzahl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r7) {
            r6 = this;
            long r1 = r7.readLong()
            long r3 = r7.readLong()
            int r5 = r7.readInt()
            com.google.android.gms.internal.ads.zzahm r7 = new com.google.android.gms.internal.ads.zzahm
            r0 = r7
            r0.<init>(r1, r3, r5)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzahm[] r1 = new com.google.android.gms.internal.ads.zzahm[r1]
            return r1
    }
}
