package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdy {
    public final java.lang.Object zza;
    private com.google.android.gms.internal.ads.zzz zzb;
    private boolean zzc;
    private boolean zzd;

    public zzdy(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.internal.ads.zzz r1 = new com.google.android.gms.internal.ads.zzz
            r1.<init>()
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
            java.lang.Class<com.google.android.gms.internal.ads.zzdy> r0 = com.google.android.gms.internal.ads.zzdy.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            java.lang.Object r0 = r2.zza
            com.google.android.gms.internal.ads.zzdy r3 = (com.google.android.gms.internal.ads.zzdy) r3
            java.lang.Object r3 = r3.zza
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final void zza(int r2, com.google.android.gms.internal.ads.zzdw r3) {
            r1 = this;
            boolean r0 = r1.zzd
            if (r0 != 0) goto L14
            r0 = -1
            if (r2 == r0) goto Lc
            com.google.android.gms.internal.ads.zzz r0 = r1.zzb
            r0.zza(r2)
        Lc:
            r2 = 1
            r1.zzc = r2
            java.lang.Object r2 = r1.zza
            r3.zza(r2)
        L14:
            return
    }

    public final void zzb(com.google.android.gms.internal.ads.zzdx r3) {
            r2 = this;
            boolean r0 = r2.zzd
            if (r0 != 0) goto L1d
            boolean r0 = r2.zzc
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzz r0 = r2.zzb
            com.google.android.gms.internal.ads.zzab r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzz r1 = new com.google.android.gms.internal.ads.zzz
            r1.<init>()
            r2.zzb = r1
            r1 = 0
            r2.zzc = r1
            java.lang.Object r1 = r2.zza
            r3.zza(r1, r0)
        L1d:
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzdx r3) {
            r2 = this;
            r0 = 1
            r2.zzd = r0
            boolean r0 = r2.zzc
            if (r0 == 0) goto L15
            r0 = 0
            r2.zzc = r0
            java.lang.Object r0 = r2.zza
            com.google.android.gms.internal.ads.zzz r1 = r2.zzb
            com.google.android.gms.internal.ads.zzab r1 = r1.zzb()
            r3.zza(r0, r1)
        L15:
            return
    }
}
