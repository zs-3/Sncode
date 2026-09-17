package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxb extends com.google.android.gms.internal.ads.zzayc {
    private static final com.google.android.gms.internal.ads.zzayd zzh = null;
    private final android.content.Context zzi;

    static {
            com.google.android.gms.internal.ads.zzayd r0 = new com.google.android.gms.internal.ads.zzayd
            r0.<init>()
            com.google.android.gms.internal.ads.zzaxb.zzh = r0
            return
    }

    public zzaxb(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13, android.content.Context r14) {
            r7 = this;
            java.lang.String r2 = "5UR6HKB81c0cBAmhqUCkwnSn0PivsbvOC36lSRnvbJazdJtsmM3DNCGH8hJ11MS9"
            java.lang.String r3 = "UrsneQ7OIRNo8EjOO9YdieQqewqlcsXgRCgjv7EyHmQ="
            r6 = 29
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzi = r14
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r7 = this;
            com.google.android.gms.internal.ads.zzasm r0 = r7.zzd
            java.lang.String r1 = "E"
            r0.zzn(r1)
            android.content.Context r0 = r7.zzi
            com.google.android.gms.internal.ads.zzayd r1 = com.google.android.gms.internal.ads.zzaxb.zzh
            java.lang.String r0 = r0.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r1.zza(r0)
            java.lang.Object r1 = r0.get()
            r2 = 1
            if (r1 != 0) goto L39
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L34
            java.lang.reflect.Method r1 = r7.zze     // Catch: java.lang.Throwable -> L36
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L36
            r5 = 0
            android.content.Context r6 = r7.zzi     // Catch: java.lang.Throwable -> L36
            r4[r5] = r6     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.invoke(r3, r4)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L36
            r0.set(r1)     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r1
        L39:
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.ads.zzasm r1 = r7.zzd
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzasm r3 = r7.zzd     // Catch: java.lang.Throwable -> L51
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = com.google.android.gms.internal.ads.zzatx.zza(r0, r2)     // Catch: java.lang.Throwable -> L51
            r3.zzn(r0)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            return
        L51:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r0
    }
}
