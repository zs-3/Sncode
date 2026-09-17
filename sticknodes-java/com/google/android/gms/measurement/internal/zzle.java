package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzle implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzle(com.google.android.gms.measurement.internal.zzlw r1, long r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r9.zzb
            r0.zzg()
            r0.zza()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzd()
            java.lang.String r3 = "Resetting analytics data (FE)"
            r2.zza(r3)
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzop r3 = r2.zzv()
            r3.zzg()
            com.google.android.gms.measurement.internal.zzon r3 = r3.zzb
            r3.zza()
            com.google.android.gms.measurement.internal.zzgs r3 = r2.zzh()
            r3.zzq()
            com.google.android.gms.measurement.internal.zzio r3 = r0.zzu
            boolean r3 = r3.zzJ()
            r3 = r3 ^ 1
            com.google.android.gms.measurement.internal.zzht r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhp r4 = r1.zzc
            long r5 = r9.zza
            r4.zzb(r5)
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzu
            com.google.android.gms.measurement.internal.zzht r5 = r4.zzm()
            com.google.android.gms.measurement.internal.zzhr r5 = r5.zzq
            java.lang.String r5 = r5.zza()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r6 = 0
            if (r5 != 0) goto L57
            com.google.android.gms.measurement.internal.zzhr r5 = r1.zzq
            r5.zzb(r6)
        L57:
            com.google.android.gms.measurement.internal.zzhp r5 = r1.zzk
            r7 = 0
            r5.zzb(r7)
            com.google.android.gms.measurement.internal.zzhp r5 = r1.zzl
            r5.zzb(r7)
            com.google.android.gms.measurement.internal.zzam r4 = r4.zzf()
            boolean r4 = r4.zzA()
            if (r4 != 0) goto L70
            r1.zzn(r3)
        L70:
            com.google.android.gms.measurement.internal.zzhr r4 = r1.zzr
            r4.zzb(r6)
            com.google.android.gms.measurement.internal.zzhp r4 = r1.zzs
            r4.zzb(r7)
            com.google.android.gms.measurement.internal.zzho r1 = r1.zzt
            r1.zzb(r6)
            com.google.android.gms.measurement.internal.zzny r1 = r2.zzu()
            r1.zzO()
            com.google.android.gms.measurement.internal.zzop r1 = r2.zzv()
            com.google.android.gms.measurement.internal.zzoo r1 = r1.zza
            r1.zza()
            r0.zzc = r3
            com.google.android.gms.measurement.internal.zzny r0 = r2.zzu()
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.zzE(r1)
            return
    }
}
