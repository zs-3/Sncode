package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzno implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zze;

    zzno(com.google.android.gms.measurement.internal.zzny r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.measurement.internal.zzr r4, com.google.android.gms.internal.measurement.zzcy r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.measurement.internal.zzny r1 = r6.zze     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            com.google.android.gms.measurement.internal.zzgl r2 = com.google.android.gms.measurement.internal.zzny.zzi(r1)     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            if (r2 != 0) goto L2a
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            java.lang.String r3 = "Failed to get conditional properties; not connected to service"
            java.lang.String r4 = r6.zza     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            java.lang.String r5 = r6.zzb     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            r2.zzc(r3, r4, r5)     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            com.google.android.gms.measurement.internal.zzqf r1 = r1.zzw()
            com.google.android.gms.internal.measurement.zzcy r2 = r6.zzd
        L26:
            r1.zzU(r2, r0)
            return
        L2a:
            com.google.android.gms.measurement.internal.zzr r3 = r6.zzc     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            java.lang.String r4 = r6.zza     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            java.lang.String r5 = r6.zzb     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            java.util.List r2 = r2.zzi(r4, r5, r3)     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            java.util.ArrayList r0 = com.google.android.gms.measurement.internal.zzqf.zzK(r2)     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            com.google.android.gms.measurement.internal.zzny.zzy(r1)     // Catch: java.lang.Throwable -> L3f android.os.RemoteException -> L41
            goto L57
        L3f:
            r1 = move-exception
            goto L62
        L41:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzny r2 = r6.zze     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "Failed to get conditional properties; remote exception"
            java.lang.String r4 = r6.zza     // Catch: java.lang.Throwable -> L3f
            java.lang.String r5 = r6.zzb     // Catch: java.lang.Throwable -> L3f
            r2.zzd(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L3f
        L57:
            com.google.android.gms.measurement.internal.zzny r1 = r6.zze
            com.google.android.gms.internal.measurement.zzcy r2 = r6.zzd
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzqf r1 = r1.zzw()
            goto L26
        L62:
            com.google.android.gms.measurement.internal.zzny r2 = r6.zze
            com.google.android.gms.internal.measurement.zzcy r3 = r6.zzd
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            r2.zzU(r3, r0)
            throw r1
    }
}
