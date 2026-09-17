package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzol {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzop zza;
    private com.google.android.gms.measurement.internal.zzok zzb;

    zzol(com.google.android.gms.measurement.internal.zzop r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    final void zza(long r9) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzok r6 = new com.google.android.gms.measurement.internal.zzok
            com.google.android.gms.measurement.internal.zzop r7 = r8.zza
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r2 = r0.currentTimeMillis()
            r0 = r6
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r4)
            r8.zzb = r6
            android.os.Handler r9 = com.google.android.gms.measurement.internal.zzop.zzh(r7)
            com.google.android.gms.measurement.internal.zzok r10 = r8.zzb
            r0 = 2000(0x7d0, double:9.88E-321)
            r9.postDelayed(r10, r0)
            return
    }

    final void zzb() {
            r5 = this;
            com.google.android.gms.measurement.internal.zzop r0 = r5.zza
            r0.zzg()
            com.google.android.gms.measurement.internal.zzok r1 = r5.zzb
            if (r1 == 0) goto L10
            android.os.Handler r2 = com.google.android.gms.measurement.internal.zzop.zzh(r0)
            r2.removeCallbacks(r1)
        L10:
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhn r2 = r2.zzn
            r3 = 0
            r2.zza(r3)
            r0.zzm(r3)
            com.google.android.gms.measurement.internal.zzam r2 = r1.zzf()
            r3 = 0
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaZ
            boolean r2 = r2.zzx(r3, r4)
            if (r2 == 0) goto L4c
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzlw r2 = r0.zzq()
            boolean r2 = r2.zzap()
            if (r2 == 0) goto L4c
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Retrying trigger URI registration in foreground"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzlw r0 = r0.zzq()
            r0.zzU()
        L4c:
            return
    }
}
