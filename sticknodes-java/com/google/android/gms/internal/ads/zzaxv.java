package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxv extends com.google.android.gms.internal.ads.zzayc {
    public zzaxv(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "0kr13TIqRr0Mkim2K4wTtB+PeWlqdIn0V95/3g6ojAuM6jvjN6OT9QeeEcwm9v6h"
            java.lang.String r3 = "pwlWlXowmv5MgDBY81mya6zXLrSMULDo97qGgXQvfFI="
            r6 = 51
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r5 = this;
            com.google.android.gms.internal.ads.zzasm r0 = r5.zzd
            monitor-enter(r0)
            java.lang.reflect.Method r1 = r5.zze     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzawj r2 = new com.google.android.gms.internal.ads.zzawj     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzasm r1 = r5.zzd     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r3 = r2.zza     // Catch: java.lang.Throwable -> L2c
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L2c
            r1.zzp(r3)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzasm r1 = r5.zzd     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r2 = r2.zzb     // Catch: java.lang.Throwable -> L2c
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L2c
            r1.zzq(r2)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1
    }
}
