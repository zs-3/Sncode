package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "HttpResponseParcelCreator")
/* loaded from: classes.dex */
public final class zzblj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzblj> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final boolean zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final byte[] zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final java.lang.String[] zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final java.lang.String[] zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final boolean zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final long zzh;

    static {
            com.google.android.gms.internal.ads.zzblk r0 = new com.google.android.gms.internal.ads.zzblk
            r0.<init>()
            com.google.android.gms.internal.ads.zzblj.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzblj(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String[] r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String[] r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) boolean r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) long r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            boolean r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            java.lang.String r5 = r3.zzb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            int r5 = r3.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            byte[] r5 = r3.zzd
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r5, r2)
            java.lang.String[] r5 = r3.zze
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r4, r1, r5, r2)
            java.lang.String[] r5 = r3.zzf
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r4, r1, r5, r2)
            boolean r5 = r3.zzg
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            long r1 = r3.zzh
            r5 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
