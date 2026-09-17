package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxt extends com.google.android.gms.internal.ads.zzayc {
    private final boolean zzh;

    public zzaxt(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "ErPP4PypQmbjNzzBcpPEb7SMjpueU0b2D5VyuZDUz95tFtao7lfnsWucNRKS/8//"
            java.lang.String r3 = "Gt05wIkB9VlCQDpYnwS+bvW/Sf4rdLdhAuNRhSCvQ2I="
            r6 = 61
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r8 = r8.zzs()
            r7.zzh = r8
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r4 = this;
            java.lang.reflect.Method r0 = r4.zze
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.zzawo r2 = r4.zza
            android.content.Context r2 = r2.zzb()
            r3 = 0
            r1[r3] = r2
            boolean r2 = r4.zzh
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.internal.ads.zzasm r2 = r4.zzd
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzasm r3 = r4.zzd     // Catch: java.lang.Throwable -> L2c
            r3.zzE(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }
}
