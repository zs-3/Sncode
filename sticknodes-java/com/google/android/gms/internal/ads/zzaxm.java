package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxm extends com.google.android.gms.internal.ads.zzayc {
    private final com.google.android.gms.internal.ads.zzawg zzh;

    public zzaxm(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13, com.google.android.gms.internal.ads.zzawg r14) {
            r7 = this;
            java.lang.String r2 = "qmKK3b5gFczPFV6EXQK4o/dThX0H+NXEfphwaNTcj5pJFkabLh1X9vORrSfnOkeV"
            java.lang.String r3 = "GajzmnIGCWKypTldGXdzGSwHW6ZZV69Bh6cWfmyAJmA="
            r6 = 94
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzh = r14
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r4 = this;
            java.lang.reflect.Method r0 = r4.zze
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.zzawg r2 = r4.zzh
            java.util.List r2 = r2.zza()
            r3 = 0
            r1[r3] = r2
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzasm r1 = r4.zzd
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzasm r2 = r4.zzd     // Catch: java.lang.Throwable -> L27
            int r0 = com.google.android.gms.internal.ads.zzasy.zza(r0)     // Catch: java.lang.Throwable -> L27
            r2.zzae(r0)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r0
    }
}
