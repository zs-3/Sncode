package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "InterstitialAdParameterParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzk extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.zzk> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final boolean zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final float zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final int zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public final boolean zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    public final boolean zzi;

    static {
            com.google.android.gms.ads.internal.zzl r0 = new com.google.android.gms.ads.internal.zzl
            r0.<init>()
            com.google.android.gms.ads.internal.zzk.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzk(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) float r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) int r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) boolean r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) boolean r9) {
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
            r0.zzi = r9
            return
    }

    public zzk(boolean r11, boolean r12, boolean r13, float r14, int r15, boolean r16, boolean r17, boolean r18) {
            r10 = this;
            r3 = 0
            r6 = -1
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            boolean r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            boolean r5 = r3.zzb
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            java.lang.String r5 = r3.zzc
            r1 = 4
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            boolean r5 = r3.zzd
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            float r5 = r3.zze
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r4, r1, r5)
            int r5 = r3.zzf
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            boolean r5 = r3.zzg
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            boolean r5 = r3.zzh
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            boolean r5 = r3.zzi
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r5)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
