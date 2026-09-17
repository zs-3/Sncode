package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzpj implements com.google.android.gms.internal.measurement.zzpi {
    public static final com.google.android.gms.internal.measurement.zzki zza = null;
    public static final com.google.android.gms.internal.measurement.zzki zzb = null;
    public static final com.google.android.gms.internal.measurement.zzki zzc = null;

    static {
            com.google.android.gms.internal.measurement.zzkf r0 = new com.google.android.gms.internal.measurement.zzkf
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = com.google.android.gms.internal.measurement.zzjx.zza(r1)
            r0.<init>(r1)
            com.google.android.gms.internal.measurement.zzkf r0 = r0.zzb()
            com.google.android.gms.internal.measurement.zzkf r0 = r0.zza()
            java.lang.String r1 = "measurement.set_default_event_parameters_with_backfill.client.dev"
            r2 = 0
            r0.zzf(r1, r2)
            java.lang.String r1 = "measurement.set_default_event_parameters_with_backfill.service"
            r3 = 1
            r0.zzf(r1, r3)
            java.lang.String r1 = "measurement.id.set_default_event_parameters.fix_service_request_ordering"
            r4 = 0
            r0.zzd(r1, r4)
            java.lang.String r1 = "measurement.set_default_event_parameters.fix_app_update_logging"
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzf(r1, r3)
            com.google.android.gms.internal.measurement.zzpj.zza = r1
            java.lang.String r1 = "measurement.set_default_event_parameters.fix_deferred_analytics_collection"
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzf(r1, r3)
            com.google.android.gms.internal.measurement.zzpj.zzb = r1
            java.lang.String r1 = "measurement.set_default_event_parameters.fix_service_request_ordering"
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzf(r1, r2)
            com.google.android.gms.internal.measurement.zzpj.zzc = r1
            java.lang.String r1 = "measurement.set_default_event_parameters.fix_subsequent_launches"
            r0.zzf(r1, r3)
            return
    }

    public zzpj() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzpj.zza
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zzb() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzpj.zzb
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzpi
    public final boolean zzc() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzpj.zzc
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
