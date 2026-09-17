package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
/* loaded from: classes2.dex */
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzai> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public com.google.android.gms.measurement.internal.zzqb zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public long zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public boolean zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final com.google.android.gms.measurement.internal.zzbh zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public long zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    public com.google.android.gms.measurement.internal.zzbh zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 11)
    public final long zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 12)
    public final com.google.android.gms.measurement.internal.zzbh zzk;

    static {
            com.google.android.gms.measurement.internal.zzaj r0 = new com.google.android.gms.measurement.internal.zzaj
            r0.<init>()
            com.google.android.gms.measurement.internal.zzai.CREATOR = r0
            return
    }

    zzai(com.google.android.gms.measurement.internal.zzai r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r0 = r3.zza
            r2.zza = r0
            java.lang.String r0 = r3.zzb
            r2.zzb = r0
            com.google.android.gms.measurement.internal.zzqb r0 = r3.zzc
            r2.zzc = r0
            long r0 = r3.zzd
            r2.zzd = r0
            boolean r0 = r3.zze
            r2.zze = r0
            java.lang.String r0 = r3.zzf
            r2.zzf = r0
            com.google.android.gms.measurement.internal.zzbh r0 = r3.zzg
            r2.zzg = r0
            long r0 = r3.zzh
            r2.zzh = r0
            com.google.android.gms.measurement.internal.zzbh r0 = r3.zzi
            r2.zzi = r0
            long r0 = r3.zzj
            r2.zzj = r0
            com.google.android.gms.measurement.internal.zzbh r3 = r3.zzk
            r2.zzk = r3
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzai(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.measurement.internal.zzqb r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) long r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) boolean r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) com.google.android.gms.measurement.internal.zzbh r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) long r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) com.google.android.gms.measurement.internal.zzbh r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) long r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) com.google.android.gms.measurement.internal.zzbh r14) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r6
            r0.zzf = r7
            r0.zzg = r8
            r0.zzh = r9
            r0.zzi = r11
            r0.zzj = r12
            r0.zzk = r14
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            java.lang.String r1 = r5.zza
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r2, r1, r3)
            java.lang.String r1 = r5.zzb
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r2, r1, r3)
            com.google.android.gms.measurement.internal.zzqb r1 = r5.zzc
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r2, r1, r7, r3)
            long r1 = r5.zzd
            r4 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r4, r1)
            boolean r1 = r5.zze
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r6, r2, r1)
            java.lang.String r1 = r5.zzf
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r2, r1, r3)
            com.google.android.gms.measurement.internal.zzbh r1 = r5.zzg
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r2, r1, r7, r3)
            long r1 = r5.zzh
            r4 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r4, r1)
            com.google.android.gms.measurement.internal.zzbh r1 = r5.zzi
            r2 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r2, r1, r7, r3)
            long r1 = r5.zzj
            r4 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r4, r1)
            com.google.android.gms.measurement.internal.zzbh r1 = r5.zzk
            r2 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r2, r1, r7, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
            return
    }
}
