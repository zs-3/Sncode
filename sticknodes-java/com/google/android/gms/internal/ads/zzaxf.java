package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxf extends com.google.android.gms.internal.ads.zzayc {
    private final long zzh;

    public zzaxf(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, long r12, int r14, int r15) {
            r7 = this;
            java.lang.String r2 = "MyezUX/G4B4IwyhTDkP3w1lDN+jx4NQ6UyU5K5beVZyubOhn8Q7qD9UAXT+3eaCC"
            java.lang.String r3 = "vDxCHtRyDtZtywG/lqG2i2wEAK0QRlsYMxcEu2Y9QxY="
            r6 = 25
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzh = r12
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r8 = this;
            java.lang.reflect.Method r0 = r8.zze
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.internal.ads.zzasm r2 = r8.zzd
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzasm r3 = r8.zzd     // Catch: java.lang.Throwable -> L2f
            r3.zzt(r0)     // Catch: java.lang.Throwable -> L2f
            long r3 = r8.zzh     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L2d
            com.google.android.gms.internal.ads.zzasm r5 = r8.zzd     // Catch: java.lang.Throwable -> L2f
            long r0 = r0 - r3
            r5.zzT(r0)     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.zzasm r0 = r8.zzd     // Catch: java.lang.Throwable -> L2f
            long r3 = r8.zzh     // Catch: java.lang.Throwable -> L2f
            r0.zzU(r3)     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }
}
