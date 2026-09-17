package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzahd implements android.os.Parcelable.Creator {
    zzahd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzahe r0 = new com.google.android.gms.internal.ads.zzahe
            java.lang.String r1 = r4.readString()
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = r4.readString()
            java.lang.String[] r4 = r4.createStringArray()
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzgax.zzm(r4)
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzahe[] r1 = new com.google.android.gms.internal.ads.zzahe[r1]
            return r1
    }
}
