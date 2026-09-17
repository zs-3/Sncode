package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznw implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzb;

    zznw(com.google.android.gms.measurement.internal.zznx r1, com.google.android.gms.common.ConnectionResult r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.measurement.internal.zznx r0 = r5.zzb
            com.google.android.gms.measurement.internal.zzny r0 = r0.zza
            r1 = 0
            com.google.android.gms.measurement.internal.zzny.zzv(r0, r1)
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzbo
            boolean r2 = r2.zzx(r1, r3)
            if (r2 == 0) goto L49
            com.google.android.gms.common.ConnectionResult r2 = r5.zza
            int r2 = r2.getErrorCode()
            r3 = 7777(0x1e61, float:1.0898E-41)
            if (r2 != r3) goto L49
            java.util.concurrent.ScheduledExecutorService r2 = com.google.android.gms.measurement.internal.zzny.zzm(r0)
            if (r2 != 0) goto L2e
            r2 = 1
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r2)
            com.google.android.gms.measurement.internal.zzny.zzu(r0, r2)
        L2e:
            java.util.concurrent.ScheduledExecutorService r0 = com.google.android.gms.measurement.internal.zzny.zzm(r0)
            com.google.android.gms.measurement.internal.zznv r2 = new com.google.android.gms.measurement.internal.zznv
            r2.<init>(r5)
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzY
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r2, r3, r1)
            return
        L49:
            com.google.android.gms.measurement.internal.zzny.zzw(r0)
            return
    }
}
