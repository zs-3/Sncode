package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaoh implements com.google.android.gms.internal.ads.zzaoa {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaoj zza;
    private final com.google.android.gms.internal.ads.zzej zzb;

    public zzaoh(com.google.android.gms.internal.ads.zzaoj r3) {
            r2 = this;
            r2.zza = r3
            r2.<init>()
            com.google.android.gms.internal.ads.zzej r3 = new com.google.android.gms.internal.ads.zzej
            r0 = 4
            byte[] r1 = new byte[r0]
            r3.<init>(r1, r0)
            r2.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zza(com.google.android.gms.internal.ads.zzek r10) {
            r9 = this;
            int r0 = r10.zzm()
            if (r0 == 0) goto L7
            goto L74
        L7:
            int r0 = r10.zzm()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L74
            r0 = 6
            r10.zzM(r0)
            int r0 = r10.zzb()
            r1 = 4
            int r0 = r0 / r1
            r2 = 0
            r3 = 0
        L1b:
            if (r3 >= r0) goto L6b
            com.google.android.gms.internal.ads.zzej r4 = r9.zzb
            r10.zzG(r4, r1)
            com.google.android.gms.internal.ads.zzej r4 = r9.zzb
            r5 = 16
            int r5 = r4.zzd(r5)
            r6 = 3
            r4.zzn(r6)
            r4 = 13
            if (r5 != 0) goto L38
            com.google.android.gms.internal.ads.zzej r5 = r9.zzb
            r5.zzn(r4)
            goto L68
        L38:
            com.google.android.gms.internal.ads.zzej r5 = r9.zzb
            int r4 = r5.zzd(r4)
            com.google.android.gms.internal.ads.zzaoj r5 = r9.zza
            android.util.SparseArray r5 = com.google.android.gms.internal.ads.zzaoj.zzg(r5)
            java.lang.Object r5 = r5.get(r4)
            if (r5 != 0) goto L68
            com.google.android.gms.internal.ads.zzaoj r5 = r9.zza
            android.util.SparseArray r6 = com.google.android.gms.internal.ads.zzaoj.zzg(r5)
            com.google.android.gms.internal.ads.zzaob r7 = new com.google.android.gms.internal.ads.zzaob
            com.google.android.gms.internal.ads.zzaoi r8 = new com.google.android.gms.internal.ads.zzaoi
            r8.<init>(r5, r4)
            r7.<init>(r8)
            r6.put(r4, r7)
            com.google.android.gms.internal.ads.zzaoj r4 = r9.zza
            int r5 = com.google.android.gms.internal.ads.zzaoj.zza(r4)
            int r5 = r5 + 1
            com.google.android.gms.internal.ads.zzaoj.zzo(r4, r5)
        L68:
            int r3 = r3 + 1
            goto L1b
        L6b:
            com.google.android.gms.internal.ads.zzaoj r10 = r9.zza
            android.util.SparseArray r10 = com.google.android.gms.internal.ads.zzaoj.zzg(r10)
            r10.remove(r2)
        L74:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zzb(com.google.android.gms.internal.ads.zzer r1, com.google.android.gms.internal.ads.zzade r2, com.google.android.gms.internal.ads.zzaon r3) {
            r0 = this;
            return
    }
}
