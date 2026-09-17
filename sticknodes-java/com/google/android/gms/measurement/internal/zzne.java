package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzne extends com.google.android.gms.measurement.internal.zzaz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zza;

    zzne(com.google.android.gms.measurement.internal.zzny r1, com.google.android.gms.measurement.internal.zzjs r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r3.zza
            r0.zzg()
            boolean r1 = r0.zzaa()
            if (r1 != 0) goto Lc
            return
        Lc:
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Inactivity, disconnecting from the service"
            r1.zza(r2)
            r0.zzC()
            return
    }
}
