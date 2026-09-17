package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzpg implements com.google.android.gms.internal.measurement.zzpf {
    public static final com.google.android.gms.internal.measurement.zzki zza = null;

    static {
            com.google.android.gms.internal.measurement.zzkf r0 = new com.google.android.gms.internal.measurement.zzkf
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = com.google.android.gms.internal.measurement.zzjx.zza(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.measurement.zzkf r0 = r0.zzb()
            com.google.android.gms.internal.measurement.zzkf r0 = r0.zza()
            java.lang.String r1 = "measurement.client.3p_consent_state_v1"
            r2 = 1
            r0.zzf(r1, r2)
            java.lang.String r1 = "measurement.service.consent_state_v1_W36"
            r0.zzf(r1, r2)
            java.lang.String r1 = "measurement.service.storage_consent_support_version"
            r2 = 203600(0x31b50, double:1.00592E-318)
            com.google.android.gms.internal.measurement.zzki r0 = r0.zzd(r1, r2)
            com.google.android.gms.internal.measurement.zzpg.zza = r0
            return
    }

    public zzpg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final long zza() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzpg.zza
            java.lang.Object r0 = r0.zzb()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }
}
