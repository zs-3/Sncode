package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgaz {
    java.lang.Object[] zza;
    int zzb;
    com.google.android.gms.internal.ads.zzgay zzc;

    public zzgaz() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    zzgaz(int r1) {
            r0 = this;
            r0.<init>()
            int r1 = r1 + r1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    private final void zzd(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.zza
            int r1 = r0.length
            int r3 = r3 + r3
            if (r3 <= r1) goto L10
            int r3 = com.google.android.gms.internal.ads.zzgar.zze(r1, r3)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.zza = r3
        L10:
            return
    }

    public final com.google.android.gms.internal.ads.zzgaz zza(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.zzb
            int r0 = r0 + 1
            r3.zzd(r0)
            com.google.android.gms.internal.ads.zzfzu.zzb(r4, r5)
            java.lang.Object[] r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r1 + r1
            r0[r2] = r4
            int r2 = r2 + 1
            r0[r2] = r5
            int r1 = r1 + 1
            r3.zzb = r1
            return r3
    }

    public final com.google.android.gms.internal.ads.zzgaz zzb(java.lang.Iterable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L11
            int r0 = r2.zzb
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r0 = r0 + r1
            r2.zzd(r0)
        L11:
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.zza(r1, r0)
            goto L15
        L2d:
            return r2
    }

    public final com.google.android.gms.internal.ads.zzgba zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgay r0 = r2.zzc
            if (r0 != 0) goto L16
            int r0 = r2.zzb
            java.lang.Object[] r1 = r2.zza
            com.google.android.gms.internal.ads.zzgco r0 = com.google.android.gms.internal.ads.zzgco.zzj(r0, r1, r2)
            com.google.android.gms.internal.ads.zzgay r1 = r2.zzc
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = r1.zza()
            throw r0
        L16:
            java.lang.IllegalArgumentException r0 = r0.zza()
            throw r0
    }
}
