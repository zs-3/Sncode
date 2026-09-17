package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "EventParamsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Iterable<java.lang.String> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzbf> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "z", id = 2)
    private final android.os.Bundle zza;

    static {
            com.google.android.gms.measurement.internal.zzbg r0 = new com.google.android.gms.measurement.internal.zzbg
            r0.<init>()
            com.google.android.gms.measurement.internal.zzbf.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzbf(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Bundle r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ android.os.Bundle zzb(com.google.android.gms.measurement.internal.zzbf r0) {
            android.os.Bundle r0 = r0.zza
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzbe r0 = new com.google.android.gms.measurement.internal.zzbe
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            android.os.Bundle r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            android.os.Bundle r0 = r3.zzc()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final int zza() {
            r1 = this;
            android.os.Bundle r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    public final android.os.Bundle zzc() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r2.zza
            r0.<init>(r1)
            return r0
    }

    final java.lang.Double zzd(java.lang.String r3) {
            r2 = this;
            android.os.Bundle r3 = r2.zza
            java.lang.String r0 = "value"
            double r0 = r3.getDouble(r0)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
    }

    final java.lang.Long zze(java.lang.String r3) {
            r2 = this;
            android.os.Bundle r0 = r2.zza
            long r0 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
    }

    final java.lang.Object zzf(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    final java.lang.String zzg(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zza
            java.lang.String r2 = r0.getString(r2)
            return r2
    }
}
