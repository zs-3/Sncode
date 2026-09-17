package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzck {
    public static final com.google.android.gms.internal.ads.zzck zza = null;
    private final com.google.android.gms.internal.ads.zzgax zzb;

    static {
            com.google.android.gms.internal.ads.zzck r0 = new com.google.android.gms.internal.ads.zzck
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzn()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzck.zza = r0
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            return
    }

    public zzck(java.util.List r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzl(r1)
            r0.zzb = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<com.google.android.gms.internal.ads.zzck> r0 = com.google.android.gms.internal.ads.zzck.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            com.google.android.gms.internal.ads.zzck r3 = (com.google.android.gms.internal.ads.zzck) r3
            com.google.android.gms.internal.ads.zzgax r0 = r2.zzb
            com.google.android.gms.internal.ads.zzgax r3 = r3.zzb
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzb
            int r0 = r0.hashCode()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgax zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzb
            return r0
    }

    public final boolean zzb(int r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.zzgax r2 = r4.zzb
            int r2 = r2.size()
            if (r1 >= r2) goto L24
            com.google.android.gms.internal.ads.zzgax r2 = r4.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzcj r2 = (com.google.android.gms.internal.ads.zzcj) r2
            boolean r3 = r2.zzc()
            if (r3 == 0) goto L21
            int r2 = r2.zza()
            if (r2 == r5) goto L1f
            goto L21
        L1f:
            r5 = 1
            return r5
        L21:
            int r1 = r1 + 1
            goto L2
        L24:
            return r0
    }
}
