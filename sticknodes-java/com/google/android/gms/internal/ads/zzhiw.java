package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhiw implements com.google.android.gms.internal.ads.zzhii {
    private final java.util.List zza;
    private final java.util.List zzb;

    static {
            java.util.Set r0 = java.util.Collections.emptySet()
            com.google.android.gms.internal.ads.zzhij.zza(r0)
            return
    }

    /* synthetic */ zzhiw(java.util.List r1, java.util.List r2, com.google.android.gms.internal.ads.zzhiu r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzhiv zza(int r2, int r3) {
            com.google.android.gms.internal.ads.zzhiv r0 = new com.google.android.gms.internal.ads.zzhiv
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
            r1 = this;
            java.util.Set r0 = r1.zzc()
            return r0
    }

    public final java.util.Set zzc() {
            r7 = this;
            java.util.List r0 = r7.zza
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r2 = r7.zzb
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.List r2 = r7.zzb
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L19:
            if (r4 >= r2) goto L34
            java.util.List r5 = r7.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.zzhir r5 = (com.google.android.gms.internal.ads.zzhir) r5
            java.lang.Object r5 = r5.zzb()
            java.util.Collection r5 = (java.util.Collection) r5
            int r6 = r5.size()
            int r0 = r0 + r6
            r1.add(r5)
            int r4 = r4 + 1
            goto L19
        L34:
            java.util.HashSet r0 = com.google.android.gms.internal.ads.zzhif.zza(r0)
            java.util.List r2 = r7.zza
            int r2 = r2.size()
            r4 = 0
        L3f:
            if (r4 >= r2) goto L56
            java.util.List r5 = r7.zza
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.zzhir r5 = (com.google.android.gms.internal.ads.zzhir) r5
            java.lang.Object r5 = r5.zzb()
            java.util.Objects.requireNonNull(r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L3f
        L56:
            int r2 = r1.size()
        L5a:
            if (r3 >= r2) goto L7a
            java.lang.Object r4 = r1.get(r3)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r4 = r4.iterator()
        L66:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r4.next()
            java.util.Objects.requireNonNull(r5)
            r0.add(r5)
            goto L66
        L77:
            int r3 = r3 + 1
            goto L5a
        L7a:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }
}
