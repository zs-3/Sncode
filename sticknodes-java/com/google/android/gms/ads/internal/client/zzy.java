package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AppOpenAdOptionsParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzy> CREATOR = null;

    @com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zza;

    static {
            com.google.android.gms.ads.internal.client.zzz r0 = new com.google.android.gms.ads.internal.client.zzz
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzy.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzy(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) @com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation int r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
