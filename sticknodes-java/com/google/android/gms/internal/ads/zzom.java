package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzom {
    public final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzol zzb;
    private final java.lang.Object zzc;

    static {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 31
            if (r0 >= r1) goto Le
            com.google.android.gms.internal.ads.zzom r0 = new com.google.android.gms.internal.ads.zzom
            java.lang.String r1 = ""
            r0.<init>(r1)
            return
        Le:
            int r0 = com.google.android.gms.internal.ads.zzol.zzb
            return
    }

    public zzom(android.media.metrics.LogSessionId r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzol r0 = new com.google.android.gms.internal.ads.zzol
            r0.<init>(r2)
            r1.<init>()
            r1.zzb = r0
            r1.zza = r3
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.zzc = r2
            return
    }

    public zzom(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 31
            if (r0 >= r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r2.zza = r3
            r3 = 0
            r2.zzb = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzom
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzom r5 = (com.google.android.gms.internal.ads.zzom) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            com.google.android.gms.internal.ads.zzol r1 = r4.zzb
            com.google.android.gms.internal.ads.zzol r3 = r5.zzb
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.zzc
            java.lang.Object r5 = r5.zzc
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.google.android.gms.internal.ads.zzol r0 = r3.zzb
            r2 = 1
            r1[r2] = r0
            java.lang.Object r0 = r3.zzc
            r2 = 2
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    public final android.media.metrics.LogSessionId zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzol r0 = r1.zzb
            java.util.Objects.requireNonNull(r0)
            android.media.metrics.LogSessionId r0 = r0.zza
            return r0
    }
}
