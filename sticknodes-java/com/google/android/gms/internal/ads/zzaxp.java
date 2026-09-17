package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxp extends com.google.android.gms.internal.ads.zzayc {
    private static volatile java.lang.String zzh;
    private static final java.lang.Object zzi = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzaxp.zzi = r0
            return
    }

    public zzaxp(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "Cjpz94Jf9g0GnoeURiYkrUgpYgxkMbj/9b/+FncAnrZMhBxpDl2Bsri9U5qLhwFe"
            java.lang.String r3 = "7Ejn4kVFfkIwTENQCsQUmu0CsZi/nLRRU7QLVgsNDkU="
            r6 = 1
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
            com.google.android.gms.internal.ads.zzasm r0 = r4.zzd
            java.lang.String r1 = "E"
            r0.zzB(r1)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaxp.zzh
            if (r0 != 0) goto L25
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaxp.zzi
            monitor-enter(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaxp.zzh     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L20
            java.lang.reflect.Method r1 = r4.zze     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzaxp.zzh = r1     // Catch: java.lang.Throwable -> L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
        L25:
            com.google.android.gms.internal.ads.zzasm r0 = r4.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasm r1 = r4.zzd     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = com.google.android.gms.internal.ads.zzaxp.zzh     // Catch: java.lang.Throwable -> L31
            r1.zzB(r2)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r1
    }
}
