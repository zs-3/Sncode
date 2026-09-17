package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhdf {
    private final java.util.ArrayDeque zza;

    private zzhdf() {
            r1 = this;
            r1.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.zza = r0
            return
    }

    /* synthetic */ zzhdf(com.google.android.gms.internal.ads.zzhde r1) {
            r0 = this;
            r0.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgzs zza(com.google.android.gms.internal.ads.zzhdf r2, com.google.android.gms.internal.ads.zzgzs r3, com.google.android.gms.internal.ads.zzgzs r4) {
            r2.zzb(r3)
            r2.zzb(r4)
            java.util.ArrayDeque r3 = r2.zza
            java.lang.Object r3 = r3.pop()
            com.google.android.gms.internal.ads.zzgzs r3 = (com.google.android.gms.internal.ads.zzgzs) r3
        Le:
            java.util.ArrayDeque r4 = r2.zza
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L26
            java.util.ArrayDeque r4 = r2.zza
            java.lang.Object r4 = r4.pop()
            com.google.android.gms.internal.ads.zzgzs r4 = (com.google.android.gms.internal.ads.zzgzs) r4
            com.google.android.gms.internal.ads.zzhdj r0 = new com.google.android.gms.internal.ads.zzhdj
            r1 = 0
            r0.<init>(r4, r3, r1)
            r3 = r0
            goto Le
        L26:
            return r3
    }

    private final void zzb(com.google.android.gms.internal.ads.zzgzs r6) {
            r5 = this;
            boolean r0 = r6.zzh()
            if (r0 == 0) goto La1
            int r0 = r6.zzd()
            int r0 = zzc(r0)
            int r1 = r0 + 1
            java.util.ArrayDeque r2 = r5.zza
            int r1 = com.google.android.gms.internal.ads.zzhdj.zzc(r1)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L9b
            java.util.ArrayDeque r2 = r5.zza
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzgzs r2 = (com.google.android.gms.internal.ads.zzgzs) r2
            int r2 = r2.zzd()
            if (r2 < r1) goto L2b
            goto L9b
        L2b:
            int r0 = com.google.android.gms.internal.ads.zzhdj.zzc(r0)
            java.util.ArrayDeque r1 = r5.zza
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.zzgzs r1 = (com.google.android.gms.internal.ads.zzgzs) r1
        L37:
            java.util.ArrayDeque r2 = r5.zza
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 != 0) goto L5d
            java.util.ArrayDeque r2 = r5.zza
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzgzs r2 = (com.google.android.gms.internal.ads.zzgzs) r2
            int r2 = r2.zzd()
            if (r2 >= r0) goto L5d
            java.util.ArrayDeque r2 = r5.zza
            java.lang.Object r2 = r2.pop()
            com.google.android.gms.internal.ads.zzgzs r2 = (com.google.android.gms.internal.ads.zzgzs) r2
            com.google.android.gms.internal.ads.zzhdj r4 = new com.google.android.gms.internal.ads.zzhdj
            r4.<init>(r2, r1, r3)
            r1 = r4
            goto L37
        L5d:
            com.google.android.gms.internal.ads.zzhdj r0 = new com.google.android.gms.internal.ads.zzhdj
            r0.<init>(r1, r6, r3)
        L62:
            java.util.ArrayDeque r6 = r5.zza
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L95
            int r6 = r0.zzd()
            int r6 = zzc(r6)
            int r6 = r6 + 1
            java.util.ArrayDeque r1 = r5.zza
            int r6 = com.google.android.gms.internal.ads.zzhdj.zzc(r6)
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzgzs r1 = (com.google.android.gms.internal.ads.zzgzs) r1
            int r1 = r1.zzd()
            if (r1 >= r6) goto L95
            java.util.ArrayDeque r6 = r5.zza
            java.lang.Object r6 = r6.pop()
            com.google.android.gms.internal.ads.zzgzs r6 = (com.google.android.gms.internal.ads.zzgzs) r6
            com.google.android.gms.internal.ads.zzhdj r1 = new com.google.android.gms.internal.ads.zzhdj
            r1.<init>(r6, r0, r3)
            r0 = r1
            goto L62
        L95:
            java.util.ArrayDeque r6 = r5.zza
            r6.push(r0)
            return
        L9b:
            java.util.ArrayDeque r0 = r5.zza
            r0.push(r6)
            return
        La1:
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzhdj
            if (r0 == 0) goto Lb6
            com.google.android.gms.internal.ads.zzhdj r6 = (com.google.android.gms.internal.ads.zzhdj) r6
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzhdj.zzg(r6)
            r5.zzb(r0)
            com.google.android.gms.internal.ads.zzgzs r6 = com.google.android.gms.internal.ads.zzhdj.zzB(r6)
            r5.zzb(r6)
            return
        Lb6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Has a new type of ByteString been created? Found "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
    }

    private static final int zzc(int r1) {
            int[] r0 = com.google.android.gms.internal.ads.zzhdj.zza
            int r1 = java.util.Arrays.binarySearch(r0, r1)
            if (r1 >= 0) goto Ld
            int r1 = r1 + 1
            int r1 = -r1
            int r1 = r1 + (-1)
        Ld:
            return r1
    }
}
