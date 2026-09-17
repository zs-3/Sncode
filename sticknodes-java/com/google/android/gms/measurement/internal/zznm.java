package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzai zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzd;

    zznm(com.google.android.gms.measurement.internal.zzny r1, boolean r2, com.google.android.gms.measurement.internal.zzr r3, boolean r4, com.google.android.gms.measurement.internal.zzai r5, com.google.android.gms.measurement.internal.zzai r6) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r4.zzd
            com.google.android.gms.measurement.internal.zzgl r1 = com.google.android.gms.measurement.internal.zzny.zzi(r0)
            if (r1 != 0) goto L18
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Discarding data. Failed to send conditional user property to service"
            r0.zza(r1)
            return
        L18:
            com.google.android.gms.measurement.internal.zzr r2 = r4.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            boolean r3 = r4.zzb
            if (r3 == 0) goto L23
            r3 = 0
            goto L25
        L23:
            com.google.android.gms.measurement.internal.zzai r3 = r4.zzc
        L25:
            r0.zzP(r1, r3, r2)
            com.google.android.gms.measurement.internal.zzny.zzy(r0)
            return
    }
}
