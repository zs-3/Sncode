package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgbb extends com.google.android.gms.internal.ads.zzgaq {
    java.lang.Object[] zzd;
    private int zze;

    public zzgbb() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    zzgbb(int r1) {
            r0 = this;
            r0.<init>(r1)
            int r1 = com.google.android.gms.internal.ads.zzgbc.zzh(r1)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.zzd = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgaq, com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgar zzb(java.lang.Object r1) {
            r0 = this;
            r0.zzf(r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgbb zzf(java.lang.Object r6) {
            r5 = this;
            java.util.Objects.requireNonNull(r6)
            java.lang.Object[] r0 = r5.zzd
            if (r0 == 0) goto L39
            int r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzgbc.zzh(r0)
            java.lang.Object[] r1 = r5.zzd
            int r2 = r1.length
            if (r0 > r2) goto L39
            int r0 = r1.length
            int r0 = r0 + (-1)
            int r1 = r6.hashCode()
            int r2 = com.google.android.gms.internal.ads.zzgap.zza(r1)
        L1d:
            r2 = r2 & r0
            java.lang.Object[] r3 = r5.zzd
            r4 = r3[r2]
            if (r4 != 0) goto L2f
            r3[r2] = r6
            int r0 = r5.zze
            int r0 = r0 + r1
            r5.zze = r0
            super.zza(r6)
            goto L38
        L2f:
            boolean r3 = r4.equals(r6)
            if (r3 != 0) goto L38
            int r2 = r2 + 1
            goto L1d
        L38:
            return r5
        L39:
            r0 = 0
            r5.zzd = r0
            super.zza(r6)
            return r5
    }

    public final com.google.android.gms.internal.ads.zzgbb zzg(java.lang.Object... r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.zzd
            r1 = 2
            if (r0 == 0) goto L10
            r0 = 0
        L6:
            if (r0 >= r1) goto L13
            r2 = r4[r0]
            r3.zzf(r2)
            int r0 = r0 + 1
            goto L6
        L10:
            r3.zzd(r4, r1)
        L13:
            return r3
    }

    public final com.google.android.gms.internal.ads.zzgbb zzh(java.lang.Iterable r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.lang.Object[] r0 = r1.zzd
            if (r0 == 0) goto L19
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            r1.zzf(r0)
            goto Lb
        L19:
            super.zzc(r2)
        L1c:
            return r1
    }

    public final com.google.android.gms.internal.ads.zzgbc zzi() {
            r9 = this;
            int r0 = r9.zzb
            if (r0 == 0) goto L56
            r1 = 1
            if (r0 == r1) goto L48
            java.lang.Object[] r2 = r9.zzd
            if (r2 == 0) goto L34
            int r0 = com.google.android.gms.internal.ads.zzgbc.zzh(r0)
            java.lang.Object[] r2 = r9.zzd
            int r2 = r2.length
            if (r0 != r2) goto L34
            int r0 = r9.zzb
            java.lang.Object[] r2 = r9.zza
            int r3 = r2.length
            boolean r3 = com.google.android.gms.internal.ads.zzgbc.zzt(r0, r3)
            if (r3 == 0) goto L23
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
        L23:
            r4 = r2
            com.google.android.gms.internal.ads.zzgcp r0 = new com.google.android.gms.internal.ads.zzgcp
            int r5 = r9.zze
            java.lang.Object[] r6 = r9.zzd
            int r2 = r6.length
            int r7 = r2 + (-1)
            int r8 = r9.zzb
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L42
        L34:
            int r0 = r9.zzb
            java.lang.Object[] r2 = r9.zza
            com.google.android.gms.internal.ads.zzgbc r0 = com.google.android.gms.internal.ads.zzgbc.zzk(r0, r2)
            int r2 = r0.size()
            r9.zzb = r2
        L42:
            r9.zzc = r1
            r1 = 0
            r9.zzd = r1
            return r0
        L48:
            java.lang.Object[] r0 = r9.zza
            r1 = 0
            r0 = r0[r1]
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzgda r1 = new com.google.android.gms.internal.ads.zzgda
            r1.<init>(r0)
            return r1
        L56:
            com.google.android.gms.internal.ads.zzgcp r0 = com.google.android.gms.internal.ads.zzgcp.zza
            return r0
    }
}
