package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzba zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlq(com.google.android.gms.measurement.internal.zzlw r1, com.google.android.gms.measurement.internal.zzba r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r6.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu
            r2.zzg()
            com.google.android.gms.measurement.internal.zzba r3 = r2.zzf()
            com.google.android.gms.measurement.internal.zzba r4 = r6.zza
            int r5 = r4.zza()
            int r3 = r3.zza()
            boolean r3 = com.google.android.gms.measurement.internal.zzjx.zzs(r5, r3)
            if (r3 == 0) goto L5f
            android.content.SharedPreferences r2 = r2.zzb()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = r4.zzj()
            java.lang.String r5 = "dma_consent_settings"
            r2.putString(r5, r3)
            r2.apply()
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Setting DMA consent(FE)"
            r1.zzb(r2, r4)
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzny r1 = r0.zzu()
            boolean r1 = r1.zzac()
            if (r1 == 0) goto L56
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            r0.zzU()
            return
        L56:
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            r1 = 0
            r0.zzR(r1)
            return
        L5f:
            com.google.android.gms.measurement.internal.zzhe r0 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzi()
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Lower precedence consent source ignored, proposed source"
            r0.zzb(r2, r1)
            return
    }
}
