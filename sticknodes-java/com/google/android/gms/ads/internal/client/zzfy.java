package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SearchAdRequestParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14})
/* loaded from: classes.dex */
public final class zzfy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzfy> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 15)
    public final java.lang.String zza;

    static {
            com.google.android.gms.ads.internal.client.zzfz r0 = new com.google.android.gms.ads.internal.client.zzfz
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzfy.CREATOR = r0
            return
    }

    public zzfy(com.google.android.gms.ads.search.SearchAdRequest r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.getQuery()
            r0.zza = r1
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzfy(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 15) java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 15
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
