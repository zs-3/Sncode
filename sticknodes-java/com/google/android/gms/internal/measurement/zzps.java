package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzps implements com.google.android.gms.internal.measurement.zzpr {
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
            java.lang.String r1 = "measurement.service.audience.fix_skip_audience_with_failed_filters"
            r2 = 1
            r0.zzf(r1, r2)
            java.lang.String r1 = "measurement.audience.refresh_event_count_filters_timestamp"
            r2 = 0
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzf(r1, r2)
            com.google.android.gms.internal.measurement.zzps.zza = r1
            java.lang.String r1 = "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters"
            com.google.android.gms.internal.measurement.zzki r1 = r0.zzf(r1, r2)
            com.google.android.gms.internal.measurement.zzps.zzb = r1
            java.lang.String r1 = "measurement.audience.use_bundle_timestamp_for_event_count_filters"
            com.google.android.gms.internal.measurement.zzki r0 = r0.zzf(r1, r2)
            com.google.android.gms.internal.measurement.zzps.zzc = r0
            return
    }

    public zzps() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzb() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzps.zza
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzc() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzps.zzb
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzd() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzki r0 = com.google.android.gms.internal.measurement.zzps.zzc
            java.lang.Object r0 = r0.zzb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
