package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhf {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final long zzc;
    public final android.os.Bundle zzd;

    public zzhf(java.lang.String r1, java.lang.String r2, android.os.Bundle r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzd = r3
            r0.zzc = r4
            return
    }

    public static com.google.android.gms.measurement.internal.zzhf zzb(com.google.android.gms.measurement.internal.zzbh r7) {
            com.google.android.gms.measurement.internal.zzhf r6 = new com.google.android.gms.measurement.internal.zzhf
            java.lang.String r1 = r7.zza
            java.lang.String r2 = r7.zzc
            com.google.android.gms.measurement.internal.zzbf r0 = r7.zzb
            android.os.Bundle r3 = r0.zzc()
            long r4 = r7.zzd
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            return r6
    }

    public final java.lang.String toString() {
            r3 = this;
            android.os.Bundle r0 = r3.zzd
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "origin="
            r1.append(r2)
            java.lang.String r2 = r3.zzb
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

    public final com.google.android.gms.measurement.internal.zzbh zza() {
            r7 = this;
            com.google.android.gms.measurement.internal.zzbh r6 = new com.google.android.gms.measurement.internal.zzbh
            com.google.android.gms.measurement.internal.zzbf r2 = new com.google.android.gms.measurement.internal.zzbf
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r7.zzd
            r0.<init>(r1)
            r2.<init>(r0)
            java.lang.String r3 = r7.zzb
            java.lang.String r1 = r7.zza
            long r4 = r7.zzc
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            return r6
    }
}
