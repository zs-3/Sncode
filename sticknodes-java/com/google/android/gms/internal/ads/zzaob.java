package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaob implements com.google.android.gms.internal.ads.zzaoo {
    private final com.google.android.gms.internal.ads.zzaoa zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaob(com.google.android.gms.internal.ads.zzaoa r2) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            com.google.android.gms.internal.ads.zzek r2 = new com.google.android.gms.internal.ads.zzek
            r0 = 32
            r2.<init>(r0)
            r1.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zza(com.google.android.gms.internal.ads.zzek r7, int r8) {
            r6 = this;
            r0 = 1
            r8 = r8 & r0
            r1 = -1
            if (r8 == 0) goto Lf
            int r2 = r7.zzm()
            int r3 = r7.zzd()
            int r3 = r3 + r2
            goto L10
        Lf:
            r3 = -1
        L10:
            boolean r2 = r6.zzf
            r4 = 0
            if (r2 != 0) goto L16
            goto L1f
        L16:
            if (r8 == 0) goto Lf7
            r6.zzf = r4
            r7.zzL(r3)
            r6.zzd = r4
        L1f:
            int r8 = r7.zzb()
            if (r8 <= 0) goto Lf7
            int r8 = r6.zzd
            r2 = 3
            if (r8 >= r2) goto La6
            if (r8 != 0) goto L3c
            int r8 = r7.zzm()
            int r3 = r7.zzd()
            int r3 = r3 + r1
            r7.zzL(r3)
            r3 = 255(0xff, float:3.57E-43)
            if (r8 == r3) goto Ldf
        L3c:
            int r8 = r7.zzb()
            int r3 = r6.zzd
            int r3 = 3 - r3
            int r8 = java.lang.Math.min(r8, r3)
            com.google.android.gms.internal.ads.zzek r3 = r6.zzb
            byte[] r3 = r3.zzN()
            int r5 = r6.zzd
            r7.zzH(r3, r5, r8)
            int r3 = r6.zzd
            int r3 = r3 + r8
            r6.zzd = r3
            if (r3 != r2) goto L1f
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            r8.zzL(r4)
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            r8.zzK(r2)
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            r8.zzM(r0)
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            int r3 = r8.zzm()
            r5 = r3 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L75
            r5 = 1
            goto L76
        L75:
            r5 = 0
        L76:
            int r8 = r8.zzm()
            r6.zze = r5
            r3 = r3 & 15
            int r3 = r3 << 8
            r8 = r8 | r3
            int r8 = r8 + r2
            r6.zzc = r8
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            int r8 = r8.zzc()
            int r2 = r6.zzc
            if (r8 >= r2) goto L1f
            r8 = 4098(0x1002, float:5.743E-42)
            com.google.android.gms.internal.ads.zzek r3 = r6.zzb
            int r3 = r3.zzc()
            int r3 = r3 + r3
            int r2 = java.lang.Math.max(r2, r3)
            int r8 = java.lang.Math.min(r8, r2)
            com.google.android.gms.internal.ads.zzek r2 = r6.zzb
            r2.zzF(r8)
            goto L1f
        La6:
            int r2 = r7.zzb()
            int r3 = r6.zzc
            int r3 = r3 - r8
            int r8 = java.lang.Math.min(r2, r3)
            com.google.android.gms.internal.ads.zzek r2 = r6.zzb
            byte[] r2 = r2.zzN()
            int r3 = r6.zzd
            r7.zzH(r2, r3, r8)
            int r2 = r6.zzd
            int r2 = r2 + r8
            r6.zzd = r2
            int r8 = r6.zzc
            if (r2 != r8) goto L1f
            boolean r2 = r6.zze
            if (r2 == 0) goto Le2
            com.google.android.gms.internal.ads.zzek r2 = r6.zzb
            byte[] r2 = r2.zzN()
            int r8 = com.google.android.gms.internal.ads.zzeu.zze(r2, r4, r8, r1)
            if (r8 != 0) goto Ldf
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            int r2 = r6.zzc
            int r2 = r2 + (-4)
            r8.zzK(r2)
            goto Le7
        Ldf:
            r6.zzf = r0
            return
        Le2:
            com.google.android.gms.internal.ads.zzek r2 = r6.zzb
            r2.zzK(r8)
        Le7:
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            r8.zzL(r4)
            com.google.android.gms.internal.ads.zzaoa r8 = r6.zza
            com.google.android.gms.internal.ads.zzek r2 = r6.zzb
            r8.zza(r2)
            r6.zzd = r4
            goto L1f
        Lf7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzb(com.google.android.gms.internal.ads.zzer r2, com.google.android.gms.internal.ads.zzade r3, com.google.android.gms.internal.ads.zzaon r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaoa r0 = r1.zza
            r0.zzb(r2, r3, r4)
            r2 = 1
            r1.zzf = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzc() {
            r1 = this;
            r0 = 1
            r1.zzf = r0
            return
    }
}
