package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxu extends com.google.android.gms.internal.ads.zzayc {
    private final java.lang.StackTraceElement[] zzh;

    public zzaxu(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13, java.lang.StackTraceElement[] r14) {
            r7 = this;
            java.lang.String r2 = "qb9dl/IB08b/6izFoDp5ONFGusaE64enfOjVCLWlhNF7+NrRoaDnYUmwC44nswXK"
            java.lang.String r3 = "+1rx5i0z5L53m4fOjp1rgOA40SLCpA1mGw0uq9igoow="
            r6 = 45
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
            r6 = this;
            java.lang.StackTraceElement[] r0 = r6.zzh
            if (r0 == 0) goto L48
            java.lang.reflect.Method r1 = r6.zze
            r2 = 0
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            java.lang.Object r0 = r1.invoke(r2, r4)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.ads.zzawf r1 = new com.google.android.gms.internal.ads.zzawf
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasm r2 = r6.zzd     // Catch: java.lang.Throwable -> L45
            java.lang.Long r4 = r1.zza     // Catch: java.lang.Throwable -> L45
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L45
            r2.zzF(r4)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r2 = r1.zzb     // Catch: java.lang.Throwable -> L45
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L3d
            com.google.android.gms.internal.ads.zzasm r2 = r6.zzd     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r1 = r1.zzc     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r3 == r1) goto L39
            r3 = 2
        L39:
            r2.zzac(r3)     // Catch: java.lang.Throwable -> L45
            goto L43
        L3d:
            com.google.android.gms.internal.ads.zzasm r1 = r6.zzd     // Catch: java.lang.Throwable -> L45
            r2 = 3
            r1.zzac(r2)     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L45:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r1
        L48:
            return
    }
}
