package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzqq implements com.google.android.gms.internal.measurement.zzqp {
    public static final com.google.android.gms.internal.measurement.zzki zza = null;
    public static final com.google.android.gms.internal.measurement.zzki zzb = null;
    public static final com.google.android.gms.internal.measurement.zzki zzc = null;
    public static final com.google.android.gms.internal.measurement.zzki zzd = null;
    public static final com.google.android.gms.internal.measurement.zzki zze = null;
    public static final com.google.android.gms.internal.measurement.zzki zzf = null;

    static {
            com.google.android.gms.internal.measurement.zzkf r0 = new com.google.android.gms.internal.measurement.zzkf
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = com.google.android.gms.internal.measurement.zzjx.zza(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.measurement.zzkf r0 = r0.zzb()
            com.google.android.gms.internal.measurement.zzkf r0 = r0.zza()
            java.lang.String r1 = "measurement.test.boolean_flag"
            r2 = 0
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzf(r1, r2)
            com.google.android.gms.internal.measurement.zzqq.zza = r1
            java.lang.String r1 = "measurement.test.cached_long_flag"
            r2 = -1
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzd(r1, r2)
            com.google.android.gms.internal.measurement.zzqq.zzb = r1
            java.lang.String r1 = "measurement.test.double_flag"
            r4 = -4609434218613702656(0xc008000000000000, double:-3.0)
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzc(r1, r4)
            com.google.android.gms.internal.measurement.zzqq.zzc = r1
            java.lang.String r1 = "measurement.test.int_flag"
            r4 = -2
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzd(r1, r4)
            com.google.android.gms.internal.measurement.zzqq.zzd = r1
            java.lang.String r1 = "measurement.test.long_flag"
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzd(r1, r2)
            com.google.android.gms.internal.measurement.zzqq.zze = r1
            java.lang.String r1 = "measurement.test.string_flag"
            java.lang.String r2 = "---"
            com.google.android.gms.internal.measurement.zzki r0 = r0.zze(r1, r2)
            com.google.android.gms.internal.measurement.zzqq.zzf = r0
            return
    }

    public zzqq() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final double zza() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzqq.zzc
            java.lang.Object r0 = r0.zzb()
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzb() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzqq.zzb
            java.lang.Object r0 = r0.zzb()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzc() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzqq.zzd
            java.lang.Object r0 = r0.zzb()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzd() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzqq.zze
            java.lang.Object r0 = r0.zzb()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final java.lang.String zze() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzqq.zzf
            java.lang.Object r0 = r0.zzb()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zzf() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzqq.zza
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
