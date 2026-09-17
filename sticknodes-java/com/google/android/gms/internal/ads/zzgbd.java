package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgbd {
    public static java.lang.Object zza(java.lang.Iterable r1, java.lang.Object r2) {
            com.google.android.gms.internal.ads.zzgcs r0 = new com.google.android.gms.internal.ads.zzgcs
            com.google.android.gms.internal.ads.zzgct r1 = (com.google.android.gms.internal.ads.zzgct) r1
            r0.<init>(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L12
            java.lang.Object r1 = r0.next()
            return r1
        L12:
            return r2
    }

    public static boolean zzb(java.lang.Iterable r2, com.google.android.gms.internal.ads.zzfya r3) {
            boolean r0 = r2 instanceof java.util.RandomAccess
            if (r0 == 0) goto L12
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L12
            java.util.List r2 = (java.util.List) r2
            java.util.Objects.requireNonNull(r3)
            boolean r2 = zzd(r2, r3)
            return r2
        L12:
            java.util.Iterator r2 = r2.iterator()
            java.util.Objects.requireNonNull(r3)
            r0 = 0
        L1a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.zza(r1)
            if (r1 == 0) goto L1a
            r2.remove()
            r0 = 1
            goto L1a
        L2f:
            return r0
    }

    private static void zzc(java.util.List r2, com.google.android.gms.internal.ads.zzfya r3, int r4, int r5) {
            int r0 = r2.size()
        L4:
            int r0 = r0 + (-1)
            if (r0 <= r5) goto L16
            java.lang.Object r1 = r2.get(r0)
            boolean r1 = r3.zza(r1)
            if (r1 == 0) goto L4
            r2.remove(r0)
            goto L4
        L16:
            int r5 = r5 + (-1)
            if (r5 < r4) goto L1e
            r2.remove(r5)
            goto L16
        L1e:
            return
    }

    private static boolean zzd(java.util.List r6, com.google.android.gms.internal.ads.zzfya r7) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r6.size()
            r4 = 1
            if (r1 >= r3) goto L27
            java.lang.Object r3 = r6.get(r1)
            boolean r5 = r7.zza(r3)
            if (r5 != 0) goto L24
            if (r1 <= r2) goto L22
            r6.set(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L1a java.lang.UnsupportedOperationException -> L1e
            goto L22
        L1a:
            zzc(r6, r7, r2, r1)
            return r4
        L1e:
            zzc(r6, r7, r2, r1)
            return r4
        L22:
            int r2 = r2 + 1
        L24:
            int r1 = r1 + 1
            goto L3
        L27:
            int r7 = r6.size()
            java.util.List r6 = r6.subList(r2, r7)
            r6.clear()
            if (r1 == r2) goto L35
            return r4
        L35:
            return r0
    }
}
