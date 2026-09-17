package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzahk implements android.os.Parcelable.Creator {
    zzahk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<com.google.android.gms.internal.ads.zzahm> r1 = com.google.android.gms.internal.ads.zzahm.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r3.readList(r0, r1)
            com.google.android.gms.internal.ads.zzahn r3 = new com.google.android.gms.internal.ads.zzahn
            r3.<init>(r0)
            return r3
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzahn[] r1 = new com.google.android.gms.internal.ads.zzahn[r1]
            return r1
    }
}
