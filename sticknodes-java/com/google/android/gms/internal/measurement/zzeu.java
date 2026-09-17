package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
abstract class zzeu implements java.lang.Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzk;

    zzeu(com.google.android.gms.internal.measurement.zzff r3, boolean r4) {
            r2 = this;
            r2.zzk = r3
            r2.<init>()
            com.google.android.gms.common.util.Clock r0 = r3.zza
            long r0 = r0.currentTimeMillis()
            r2.zzh = r0
            com.google.android.gms.common.util.Clock r3 = r3.zza
            long r0 = r3.elapsedRealtime()
            r2.zzi = r0
            r2.zzj = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r4.zzk
            boolean r0 = com.google.android.gms.internal.measurement.zzff.zzR(r0)
            if (r0 == 0) goto Lc
            r4.zzb()
            return
        Lc:
            r4.zza()     // Catch: java.lang.Exception -> L10
            return
        L10:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzff r1 = r4.zzk
            r2 = 0
            boolean r3 = r4.zzj
            com.google.android.gms.internal.measurement.zzff.zzt(r1, r0, r2, r3)
            r4.zzb()
            return
    }

    abstract void zza() throws android.os.RemoteException;

    protected void zzb() {
            r0 = this;
            return
    }
}
