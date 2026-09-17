package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlj(com.google.android.gms.measurement.internal.zzlw r1, com.google.android.gms.internal.measurement.zzcy r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r8.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzop r1 = r1.zzv()
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            com.google.android.gms.measurement.internal.zzjx r2 = r2.zzh()
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r2 = r2.zzr(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzl()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.zza(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            com.google.android.gms.common.util.Clock r4 = r1.zzaU()
            long r4 = r4.currentTimeMillis()
            boolean r2 = r2.zzp(r4)
            if (r2 != 0) goto L28
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhp r2 = r2.zzl
            long r4 = r2.zza()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            com.google.android.gms.measurement.internal.zzht r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhp r1 = r1.zzl
            long r1 = r1.zza()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.internal.measurement.zzcy r2 = r8.zza
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            long r3 = r1.longValue()
            r0.zzY(r2, r3)
            return
        L6d:
            com.google.android.gms.internal.measurement.zzcy r0 = r8.zza     // Catch: android.os.RemoteException -> L73
            r0.zze(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzlw r1 = r8.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.zzb(r2, r0)
            return
    }
}
