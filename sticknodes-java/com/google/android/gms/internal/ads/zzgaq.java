package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzgaq extends com.google.android.gms.internal.ads.zzgar {
    java.lang.Object[] zza;
    int zzb;
    boolean zzc;

    zzgaq(int r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "initialCapacity"
            com.google.android.gms.internal.ads.zzfzu.zza(r2, r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.zza = r2
            r2 = 0
            r1.zzb = r2
            return
    }

    private final void zzf(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.zza
            int r1 = r0.length
            r2 = 0
            if (r1 >= r4) goto L13
            int r4 = com.google.android.gms.internal.ads.zzgar.zze(r1, r4)
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.zza = r4
            r3.zzc = r2
            return
        L13:
            boolean r4 = r3.zzc
            if (r4 == 0) goto L21
            java.lang.Object r4 = r0.clone()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r3.zza = r4
            r3.zzc = r2
        L21:
            return
    }

    public final com.google.android.gms.internal.ads.zzgaq zza(java.lang.Object r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            int r0 = r3.zzb
            int r0 = r0 + 1
            r3.zzf(r0)
            java.lang.Object[] r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r1 + 1
            r3.zzb = r2
            r0[r1] = r4
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgar zzb(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public final com.google.android.gms.internal.ads.zzgar zzc(java.lang.Iterable r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L23
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r3.zzb
            int r2 = r0.size()
            int r1 = r1 + r2
            r3.zzf(r1)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgas
            if (r1 != 0) goto L16
            goto L23
        L16:
            com.google.android.gms.internal.ads.zzgas r0 = (com.google.android.gms.internal.ads.zzgas) r0
            java.lang.Object[] r4 = r3.zza
            int r1 = r3.zzb
            int r4 = r0.zza(r4, r1)
            r3.zzb = r4
            return r3
        L23:
            java.util.Iterator r4 = r4.iterator()
        L27:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            r3.zzb(r0)
            goto L27
        L35:
            return r3
    }

    final void zzd(java.lang.Object[] r4, int r5) {
            r3 = this;
            r5 = 2
            com.google.android.gms.internal.ads.zzgch.zzb(r4, r5)
            int r0 = r3.zzb
            int r0 = r0 + r5
            r3.zzf(r0)
            java.lang.Object[] r0 = r3.zza
            int r1 = r3.zzb
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r1, r5)
            int r4 = r3.zzb
            int r4 = r4 + r5
            r3.zzb = r4
            return
    }
}
