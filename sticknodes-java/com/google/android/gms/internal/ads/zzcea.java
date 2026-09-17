package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcea {
    private final java.util.ArrayList zza;
    private long zzb;

    zzcea() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            return
    }

    final long zza() {
            r6 = this;
            java.util.ArrayList r0 = r6.zza
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzgu r1 = (com.google.android.gms.internal.ads.zzgu) r1
            java.util.Map r1 = r1.zze()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r3 = "content-length"
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.RuntimeException -> L52
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.RuntimeException -> L52
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.RuntimeException -> L52
            if (r3 == 0) goto L1e
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.RuntimeException -> L52
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.RuntimeException -> L52
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.RuntimeException -> L52
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.RuntimeException -> L52
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.RuntimeException -> L52
            long r4 = r6.zzb     // Catch: java.lang.RuntimeException -> L52
            long r2 = java.lang.Math.max(r4, r2)     // Catch: java.lang.RuntimeException -> L52
            r6.zzb = r2     // Catch: java.lang.RuntimeException -> L52
            goto L1e
        L52:
            goto L1e
        L54:
            r0.remove()
            goto L6
        L58:
            long r0 = r6.zzb
            return r0
    }

    final void zzb(com.google.android.gms.internal.ads.zzgu r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.zza
            r0.add(r2)
            return
    }
}
