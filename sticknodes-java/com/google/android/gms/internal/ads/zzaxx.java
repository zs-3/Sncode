package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxx extends com.google.android.gms.internal.ads.zzayc {
    private static volatile java.lang.Long zzh;
    private static final java.lang.Object zzi = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzaxx.zzi = r0
            return
    }

    public zzaxx(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "FIygBXZrpziR+Pp2xmzyZ9k6GUcrj9kWbY5XuUd40ERy2hxHTKqhUwfuGSusXUTd"
            java.lang.String r3 = "t4LignzpQnyAJJAZeU8P3GGD0dgmuTMT4n9grwU+EMc="
            r6 = 33
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r4 = this;
            java.lang.Long r0 = com.google.android.gms.internal.ads.zzaxx.zzh
            if (r0 != 0) goto L1e
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaxx.zzi
            monitor-enter(r0)
            java.lang.Long r1 = com.google.android.gms.internal.ads.zzaxx.zzh     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L19
            java.lang.reflect.Method r1 = r4.zze     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L1b
            com.google.android.gms.internal.ads.zzaxx.zzh = r1     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        L1e:
            com.google.android.gms.internal.ads.zzasm r0 = r4.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasm r1 = r4.zzd     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r2 = com.google.android.gms.internal.ads.zzaxx.zzh     // Catch: java.lang.Throwable -> L2e
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L2e
            r1.zzV(r2)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
    }
}
