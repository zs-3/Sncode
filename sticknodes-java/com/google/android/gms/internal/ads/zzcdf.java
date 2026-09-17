package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdf {
    private long zza;

    public zzcdf() {
            r0 = this;
            r0.<init>()
            return
    }

    public final long zza(java.nio.ByteBuffer r9) {
            r8 = this;
            long r0 = r8.zza
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L9
            return r0
        L9:
            java.nio.ByteBuffer r9 = r9.duplicate()     // Catch: java.lang.Throwable -> L64
            r9.flip()     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzcde r0 = new com.google.android.gms.internal.ads.zzcde     // Catch: java.lang.Throwable -> L64
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzarn r9 = new com.google.android.gms.internal.ads.zzarn     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzcdi r1 = com.google.android.gms.internal.ads.zzcdi.zzb     // Catch: java.lang.Throwable -> L64
            r9.<init>(r0, r1)     // Catch: java.lang.Throwable -> L64
            java.util.List r9 = r9.zzd()     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L64
        L24:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L64
            r1 = 0
            if (r0 == 0) goto L38
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzarp r0 = (com.google.android.gms.internal.ads.zzarp) r0     // Catch: java.lang.Throwable -> L64
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzarr     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L24
            com.google.android.gms.internal.ads.zzarr r0 = (com.google.android.gms.internal.ads.zzarr) r0     // Catch: java.lang.Throwable -> L64
            goto L39
        L38:
            r0 = r1
        L39:
            java.util.List r9 = r0.zzd()     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L64
        L41:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L54
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzarp r0 = (com.google.android.gms.internal.ads.zzarp) r0     // Catch: java.lang.Throwable -> L64
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzars     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L41
            r1 = r0
            com.google.android.gms.internal.ads.zzars r1 = (com.google.android.gms.internal.ads.zzars) r1     // Catch: java.lang.Throwable -> L64
        L54:
            long r4 = r1.zzc()     // Catch: java.lang.Throwable -> L64
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            long r0 = r1.zzd()     // Catch: java.lang.Throwable -> L64
            long r4 = r4 / r0
            r8.zza = r4     // Catch: java.lang.Throwable -> L64
            return r4
        L64:
            return r2
    }
}
