package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes2.dex */
public final class zzqb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzqb> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final long zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final java.lang.Long zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final java.lang.String zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final java.lang.Double zzg;

    static {
            com.google.android.gms.measurement.internal.zzqc r0 = new com.google.android.gms.measurement.internal.zzqc
            r0.<init>()
            com.google.android.gms.measurement.internal.zzqb.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzqb(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.Long r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.Float r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.Double r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            r2 = 1
            if (r1 != r2) goto L1a
            if (r6 == 0) goto L19
            double r1 = r6.doubleValue()
            java.lang.Double r9 = java.lang.Double.valueOf(r1)
            goto L1a
        L19:
            r9 = 0
        L1a:
            r0.zzg = r9
            r0.zze = r7
            r0.zzf = r8
            return
    }

    zzqb(com.google.android.gms.measurement.internal.zzqd r7) {
            r6 = this;
            java.lang.String r1 = r7.zzc
            long r2 = r7.zzd
            java.lang.Object r4 = r7.zze
            java.lang.String r5 = r7.zzb
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            return
    }

    zzqb(java.lang.String r2, long r3, java.lang.Object r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0 = 2
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzf = r6
            r2 = 0
            if (r5 != 0) goto L19
            r1.zzd = r2
            r1.zzg = r2
            r1.zze = r2
            return
        L19:
            boolean r3 = r5 instanceof java.lang.Long
            if (r3 == 0) goto L26
            java.lang.Long r5 = (java.lang.Long) r5
            r1.zzd = r5
            r1.zzg = r2
            r1.zze = r2
            return
        L26:
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L33
            r1.zzd = r2
            r1.zzg = r2
            java.lang.String r5 = (java.lang.String) r5
            r1.zze = r5
            return
        L33:
            boolean r3 = r5 instanceof java.lang.Double
            if (r3 == 0) goto L40
            r1.zzd = r2
            java.lang.Double r5 = (java.lang.Double) r5
            r1.zzg = r5
            r1.zze = r2
            return
        L40:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "User attribute given of un-supported type"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzqc.zza(r0, r1, r2)
            return
    }

    public final java.lang.Object zza() {
            r1 = this;
            java.lang.Long r0 = r1.zzd
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Double r0 = r1.zzg
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.String r0 = r1.zze
            if (r0 == 0) goto Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }
}
