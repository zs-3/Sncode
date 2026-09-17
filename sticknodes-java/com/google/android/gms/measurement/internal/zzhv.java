package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhv implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhw zza;
    private final java.lang.String zzb;

    zzhv(com.google.android.gms.measurement.internal.zzhw r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String zza(com.google.android.gms.measurement.internal.zzhv r0) {
            java.lang.String r0 = r0.zzb
            return r0
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            r2 = this;
            if (r4 == 0) goto L4b
            com.google.android.gms.internal.measurement.zzbr r3 = com.google.android.gms.internal.measurement.zzbq.zzb(r4)     // Catch: java.lang.RuntimeException -> L38
            if (r3 != 0) goto L1a
            com.google.android.gms.measurement.internal.zzhw r3 = r2.zza     // Catch: java.lang.RuntimeException -> L38
            com.google.android.gms.measurement.internal.zzio r3 = r3.zza     // Catch: java.lang.RuntimeException -> L38
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.RuntimeException -> L38
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()     // Catch: java.lang.RuntimeException -> L38
            java.lang.String r4 = "Install Referrer Service implementation was not found"
            r3.zza(r4)     // Catch: java.lang.RuntimeException -> L38
            return
        L1a:
            com.google.android.gms.measurement.internal.zzhw r4 = r2.zza     // Catch: java.lang.RuntimeException -> L38
            com.google.android.gms.measurement.internal.zzio r4 = r4.zza     // Catch: java.lang.RuntimeException -> L38
            com.google.android.gms.measurement.internal.zzhe r0 = r4.zzaW()     // Catch: java.lang.RuntimeException -> L38
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: java.lang.RuntimeException -> L38
            java.lang.String r1 = "Install Referrer Service connected"
            r0.zza(r1)     // Catch: java.lang.RuntimeException -> L38
            com.google.android.gms.measurement.internal.zzil r4 = r4.zzaX()     // Catch: java.lang.RuntimeException -> L38
            com.google.android.gms.measurement.internal.zzhu r0 = new com.google.android.gms.measurement.internal.zzhu     // Catch: java.lang.RuntimeException -> L38
            r0.<init>(r2, r3, r2)     // Catch: java.lang.RuntimeException -> L38
            r4.zzq(r0)     // Catch: java.lang.RuntimeException -> L38
            return
        L38:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzhw r4 = r2.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r0 = "Exception occurred while calling Install Referrer API"
            r4.zzb(r0, r3)
            return
        L4b:
            com.google.android.gms.measurement.internal.zzhw r3 = r2.zza
            com.google.android.gms.measurement.internal.zzio r3 = r3.zza
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.String r4 = "Install Referrer connection returned with null binder"
            r3.zza(r4)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhw r2 = r1.zza
            com.google.android.gms.measurement.internal.zzio r2 = r2.zza
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r0 = "Install Referrer Service disconnected"
            r2.zza(r0)
            return
    }
}
