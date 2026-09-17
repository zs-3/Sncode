package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaqn {
    public static final boolean zza = false;
    private final java.util.List zzb;
    private boolean zzc;

    static {
            boolean r0 = com.google.android.gms.internal.ads.zzaqo.zzb
            com.google.android.gms.internal.ads.zzaqn.zza = r0
            return
    }

    zzaqn() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            return
    }

    protected final void finalize() throws java.lang.Throwable {
            r2 = this;
            boolean r0 = r2.zzc
            if (r0 != 0) goto L11
            java.lang.String r0 = "Request on the loose"
            r2.zzb(r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Marker log finalized without finish() - uncaught exit point for request"
            com.google.android.gms.internal.ads.zzaqo.zzb(r1, r0)
        L11:
            return
    }

    public final synchronized void zza(java.lang.String r9, long r10) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzc     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L18
            java.util.List r0 = r8.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzaqm r7 = new com.google.android.gms.internal.ads.zzaqm     // Catch: java.lang.Throwable -> L20
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L20
            r1 = r7
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L20
            r0.add(r7)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r8)
            return
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            java.lang.String r10 = "Marker added to finished log"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L20
            throw r9     // Catch: java.lang.Throwable -> L20
        L20:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public final synchronized void zzb(java.lang.String r10) {
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            r9.zzc = r0     // Catch: java.lang.Throwable -> L7f
            java.util.List r1 = r9.zzb     // Catch: java.lang.Throwable -> L7f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7f
            r2 = 0
            r4 = 0
            if (r1 != 0) goto L11
            r7 = r2
            goto L2c
        L11:
            java.util.List r1 = r9.zzb     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzaqm r1 = (com.google.android.gms.internal.ads.zzaqm) r1     // Catch: java.lang.Throwable -> L7f
            long r5 = r1.zzc     // Catch: java.lang.Throwable -> L7f
            java.util.List r1 = r9.zzb     // Catch: java.lang.Throwable -> L7f
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L7f
            int r7 = r7 + (-1)
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzaqm r1 = (com.google.android.gms.internal.ads.zzaqm) r1     // Catch: java.lang.Throwable -> L7f
            long r7 = r1.zzc     // Catch: java.lang.Throwable -> L7f
            long r7 = r7 - r5
        L2c:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L31
            goto L7d
        L31:
            java.util.List r1 = r9.zzb     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzaqm r1 = (com.google.android.gms.internal.ads.zzaqm) r1     // Catch: java.lang.Throwable -> L7f
            long r1 = r1.zzc     // Catch: java.lang.Throwable -> L7f
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L7f
            r5[r4] = r6     // Catch: java.lang.Throwable -> L7f
            r5[r0] = r10     // Catch: java.lang.Throwable -> L7f
            java.lang.String r10 = "(%-4d ms) %s"
            com.google.android.gms.internal.ads.zzaqo.zza(r10, r5)     // Catch: java.lang.Throwable -> L7f
            java.util.List r10 = r9.zzb     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L7f
        L51:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzaqm r5 = (com.google.android.gms.internal.ads.zzaqm) r5     // Catch: java.lang.Throwable -> L7f
            long r6 = r5.zzc     // Catch: java.lang.Throwable -> L7f
            long r1 = r6 - r1
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            r8[r4] = r1     // Catch: java.lang.Throwable -> L7f
            long r1 = r5.zzb     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            r8[r0] = r1     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = r5.zza     // Catch: java.lang.Throwable -> L7f
            r8[r3] = r1     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "(+%-4d) [%2d] %s"
            com.google.android.gms.internal.ads.zzaqo.zza(r1, r8)     // Catch: java.lang.Throwable -> L7f
            r1 = r6
            goto L51
        L7d:
            monitor-exit(r9)
            return
        L7f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }
}
