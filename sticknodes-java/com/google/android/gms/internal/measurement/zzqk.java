package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzqk implements com.google.android.gms.internal.measurement.zzqj {
    public static final com.google.android.gms.internal.measurement.zzki zza = null;

    static {
            com.google.android.gms.internal.measurement.zzkf r0 = new com.google.android.gms.internal.measurement.zzkf
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = com.google.android.gms.internal.measurement.zzjx.zza(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.measurement.zzkf r0 = r0.zzb()
            com.google.android.gms.internal.measurement.zzkf r0 = r0.zza()
            java.lang.String r1 = "measurement.gmscore_feature_tracking"
            r2 = 1
            r0.zzf(r1, r2)
            java.lang.String r1 = "measurement.gmscore_client_telemetry"
            r2 = 0
            com.google.android.gms.internal.measurement.zzki r0 = r0.zzf(r1, r2)
            com.google.android.gms.internal.measurement.zzqk.zza = r0
            return
    }

    public zzqk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final boolean zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzqk.zza
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
