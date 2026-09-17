package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "VideoOptionsParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzgb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzgb> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final boolean zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final boolean zzc;

    static {
            com.google.android.gms.ads.internal.client.zzgc r0 = new com.google.android.gms.ads.internal.client.zzgc
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzgb.CREATOR = r0
            return
    }

    public zzgb(com.google.android.gms.ads.VideoOptions r3) {
            r2 = this;
            boolean r0 = r3.getStartMuted()
            boolean r1 = r3.getCustomControlsRequested()
            boolean r3 = r3.getClickToExpandRequested()
            r2.<init>(r0, r1, r3)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzgb(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            boolean r4 = r2.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r4)
            boolean r4 = r2.zzb
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r4)
            boolean r4 = r2.zzc
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
