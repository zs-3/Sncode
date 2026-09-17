package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzkv implements java.lang.Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzkv(com.google.android.gms.measurement.internal.zzlw r1, boolean r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r7.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            boolean r2 = r1.zzJ()
            boolean r3 = r1.zzI()
            boolean r4 = r7.zza
            r1.zzF(r4)
            if (r3 != r4) goto L24
            com.google.android.gms.measurement.internal.zzhe r3 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            java.lang.String r6 = "Default data collection state already set to"
            r3.zzb(r6, r5)
        L24:
            boolean r3 = r1.zzJ()
            if (r3 == r2) goto L34
            boolean r3 = r1.zzJ()
            boolean r5 = r1.zzI()
            if (r3 == r5) goto L49
        L34:
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzl()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "Default data collection is different than actual status"
            r1.zzc(r4, r3, r2)
        L49:
            com.google.android.gms.measurement.internal.zzlw.zzG(r0)
            return
    }
}
