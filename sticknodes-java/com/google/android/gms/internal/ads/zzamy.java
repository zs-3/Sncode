package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamy implements com.google.android.gms.internal.ads.zzamz {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzaeh[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf;

    public zzamy(java.util.List r3) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            int r3 = r3.size()
            com.google.android.gms.internal.ads.zzaeh[] r3 = new com.google.android.gms.internal.ads.zzaeh[r3]
            r2.zzb = r3
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzf = r0
            return
    }

    private final boolean zzf(com.google.android.gms.internal.ads.zzek r3, int r4) {
            r2 = this;
            int r0 = r3.zzb()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r3 = r3.zzm()
            if (r3 == r4) goto L10
            r2.zzc = r1
        L10:
            int r3 = r2.zzd
            int r3 = r3 + (-1)
            r2.zzd = r3
            boolean r3 = r2.zzc
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r6) {
            r5 = this;
            boolean r0 = r5.zzc
            if (r0 == 0) goto L3a
            int r0 = r5.zzd
            r1 = 2
            if (r0 != r1) goto L11
            r0 = 32
            boolean r0 = r5.zzf(r6, r0)
            if (r0 == 0) goto L3a
        L11:
            int r0 = r5.zzd
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1d
            boolean r0 = r5.zzf(r6, r1)
            if (r0 == 0) goto L3a
        L1d:
            int r0 = r6.zzd()
            int r2 = r6.zzb()
            com.google.android.gms.internal.ads.zzaeh[] r3 = r5.zzb
        L27:
            int r4 = r3.length
            if (r1 >= r4) goto L35
            r4 = r3[r1]
            r6.zzL(r0)
            r4.zzq(r6, r2)
            int r1 = r1 + 1
            goto L27
        L35:
            int r6 = r5.zze
            int r6 = r6 + r2
            r5.zze = r6
        L3a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r6, com.google.android.gms.internal.ads.zzaon r7) {
            r5 = this;
            r0 = 0
        L1:
            com.google.android.gms.internal.ads.zzaeh[] r1 = r5.zzb
            int r1 = r1.length
            if (r0 >= r1) goto L47
            java.util.List r1 = r5.zza
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzaok r1 = (com.google.android.gms.internal.ads.zzaok) r1
            r7.zzc()
            int r2 = r7.zza()
            r3 = 3
            com.google.android.gms.internal.ads.zzaeh r2 = r6.zzw(r2, r3)
            com.google.android.gms.internal.ads.zzad r3 = new com.google.android.gms.internal.ads.zzad
            r3.<init>()
            java.lang.String r4 = r7.zzb()
            r3.zzL(r4)
            java.lang.String r4 = "application/dvbsubs"
            r3.zzZ(r4)
            byte[] r4 = r1.zzb
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r3.zzM(r4)
            java.lang.String r1 = r1.zza
            r3.zzP(r1)
            com.google.android.gms.internal.ads.zzaf r1 = r3.zzaf()
            r2.zzl(r1)
            com.google.android.gms.internal.ads.zzaeh[] r1 = r5.zzb
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1
        L47:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r11) {
            r10 = this;
            boolean r11 = r10.zzc
            if (r11 == 0) goto L2d
            long r0 = r10.zzf
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzaeh[] r0 = r10.zzb
            r1 = 0
        L19:
            int r2 = r0.length
            if (r1 >= r2) goto L2b
            r3 = r0[r1]
            long r4 = r10.zzf
            r6 = 1
            int r7 = r10.zze
            r8 = 0
            r9 = 0
            r3.zzs(r4, r6, r7, r8, r9)
            int r1 = r1 + 1
            goto L19
        L2b:
            r10.zzc = r11
        L2d:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long r1, int r3) {
            r0 = this;
            r3 = r3 & 4
            if (r3 != 0) goto L5
            return
        L5:
            r3 = 1
            r0.zzc = r3
            r0.zzf = r1
            r1 = 0
            r0.zze = r1
            r1 = 2
            r0.zzd = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
            r2 = this;
            r0 = 0
            r2.zzc = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzf = r0
            return
    }
}
