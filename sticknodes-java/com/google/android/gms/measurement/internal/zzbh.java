package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "EventParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzbh> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final com.google.android.gms.measurement.internal.zzbf zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final long zzd;

    static {
            com.google.android.gms.measurement.internal.zzbi r0 = new com.google.android.gms.measurement.internal.zzbi
            r0.<init>()
            com.google.android.gms.measurement.internal.zzbh.CREATOR = r0
            return
    }

    zzbh(com.google.android.gms.measurement.internal.zzbh r2, long r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r0 = r2.zza
            r1.zza = r0
            com.google.android.gms.measurement.internal.zzbf r0 = r2.zzb
            r1.zzb = r0
            java.lang.String r2 = r2.zzc
            r1.zzc = r2
            r1.zzd = r3
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbh(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.measurement.internal.zzbf r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzbf r0 = r3.zzb
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "origin="
            r1.append(r2)
            java.lang.String r2 = r3.zzc
            r1.append(r2)
            java.lang.String r2 = ",name="
            r1.append(r2)
            java.lang.String r2 = r3.zza
            r1.append(r2)
            java.lang.String r2 = ",params="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzbi.zza(r0, r1, r2)
            return
    }
}
