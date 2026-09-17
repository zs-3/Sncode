package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzawz extends com.google.android.gms.internal.ads.zzayc {
    public zzawz(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "HKR8yJb1bSJu8LVlqpKC/lk4sWm3Ji10GkyhxRQoJd2Yb8vz2/7ATJhGRkBQpjA8"
            java.lang.String r3 = "3Dv+WIEpWKEbBzcuP3SgLUV0aXQTnDSdpPKu/RzIzoY="
            r6 = 89
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r3 = this;
            java.lang.reflect.Method r0 = r3.zze
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.ads.zzasm r1 = r3.zzd
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzasm r2 = r3.zzd     // Catch: java.lang.Throwable -> L16
            r2.zzg(r0)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
    }
}
