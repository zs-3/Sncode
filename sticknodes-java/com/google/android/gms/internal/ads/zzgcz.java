package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgcz {
    static int zza(java.util.Set r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = 0
        L18:
            int r1 = r1 + r2
            goto L6
        L1a:
            return r1
    }

    public static com.google.android.gms.internal.ads.zzgcy zzb(java.util.Set r1, java.util.Set r2) {
            java.lang.String r0 = "set1"
            com.google.android.gms.internal.ads.zzfxz.zzc(r1, r0)
            java.lang.String r0 = "set2"
            com.google.android.gms.internal.ads.zzfxz.zzc(r2, r0)
            com.google.android.gms.internal.ads.zzgct r0 = new com.google.android.gms.internal.ads.zzgct
            r0.<init>(r1, r2)
            return r0
    }

    public static java.util.Set zzc(java.util.Set r1, com.google.android.gms.internal.ads.zzfya r2) {
            boolean r0 = r1 instanceof java.util.SortedSet
            if (r0 == 0) goto L25
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzgcu
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzgcu r1 = (com.google.android.gms.internal.ads.zzgcu) r1
            com.google.android.gms.internal.ads.zzfya r0 = r1.zzb
            com.google.android.gms.internal.ads.zzfya r2 = com.google.android.gms.internal.ads.zzfyd.zza(r0, r2)
            com.google.android.gms.internal.ads.zzgcv r0 = new com.google.android.gms.internal.ads.zzgcv
            java.util.Collection r1 = r1.zza
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            r0.<init>(r1, r2)
            goto L24
        L1c:
            com.google.android.gms.internal.ads.zzgcv r0 = new com.google.android.gms.internal.ads.zzgcv
            java.util.Objects.requireNonNull(r1)
            r0.<init>(r1, r2)
        L24:
            return r0
        L25:
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzgcu
            if (r0 == 0) goto L3b
            com.google.android.gms.internal.ads.zzgcu r1 = (com.google.android.gms.internal.ads.zzgcu) r1
            com.google.android.gms.internal.ads.zzfya r0 = r1.zzb
            com.google.android.gms.internal.ads.zzfya r2 = com.google.android.gms.internal.ads.zzfyd.zza(r0, r2)
            com.google.android.gms.internal.ads.zzgcu r0 = new com.google.android.gms.internal.ads.zzgcu
            java.util.Collection r1 = r1.zza
            java.util.Set r1 = (java.util.Set) r1
            r0.<init>(r1, r2)
            return r0
        L3b:
            com.google.android.gms.internal.ads.zzgcu r0 = new com.google.android.gms.internal.ads.zzgcu
            java.util.Objects.requireNonNull(r1)
            r0.<init>(r1, r2)
            return r0
    }

    static boolean zzd(java.util.Set r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1c
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1c
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1c
            return r0
        L1c:
            return r2
    }

    static boolean zze(java.util.Set r2, java.util.Collection r3) {
            java.util.Objects.requireNonNull(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzgcf
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzgcf r3 = (com.google.android.gms.internal.ads.zzgcf) r3
            java.util.Set r3 = r3.zza()
        Ld:
            boolean r0 = r3 instanceof java.util.Set
            if (r0 == 0) goto L36
            int r0 = r3.size()
            int r1 = r2.size()
            if (r0 <= r1) goto L36
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L20:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L20
            r2.remove()
            r0 = 1
            goto L20
        L35:
            return r0
        L36:
            java.util.Iterator r3 = r3.iterator()
            boolean r2 = zzf(r2, r3)
            return r2
    }

    static boolean zzf(java.util.Set r2, java.util.Iterator r3) {
            r0 = 0
        L1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L1
        L11:
            return r0
    }
}
