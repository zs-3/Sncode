package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AdapterStatusParcelCreator")
/* loaded from: classes.dex */
public final class zzblu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzblu> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final java.lang.String zzd;

    static {
            com.google.android.gms.internal.ads.zzblv r0 = new com.google.android.gms.internal.ads.zzblv
            r0.<init>()
            com.google.android.gms.internal.ads.zzblu.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzblu(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            boolean r5 = r3.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            int r5 = r3.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            java.lang.String r5 = r3.zzd
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
