package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzanl implements com.google.android.gms.internal.ads.zzamz {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final com.google.android.gms.internal.ads.zzadt zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private com.google.android.gms.internal.ads.zzaeh zze;
    private java.lang.String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzanl() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzanl(java.lang.String r4, int r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.zzg = r0
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r2 = 4
            r1.<init>(r2)
            r3.zza = r1
            byte[] r1 = r1.zzN()
            r2 = -1
            r1[r0] = r2
            com.google.android.gms.internal.ads.zzadt r0 = new com.google.android.gms.internal.ads.zzadt
            r0.<init>()
            r3.zzb = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzm = r0
            r3.zzc = r4
            r3.zzd = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(com.google.android.gms.internal.ads.zzek r12) {
            r11 = this;
            com.google.android.gms.internal.ads.zzaeh r0 = r11.zze
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
        L5:
            int r0 = r12.zzb()
            if (r0 <= 0) goto L138
            int r0 = r11.zzg
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto Lf0
            if (r0 == r2) goto L57
            int r0 = r12.zzb()
            int r1 = r11.zzl
            int r4 = r11.zzh
            int r1 = r1 - r4
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.zzaeh r1 = r11.zze
            r1.zzq(r12, r0)
            int r1 = r11.zzh
            int r1 = r1 + r0
            r11.zzh = r1
            int r0 = r11.zzl
            if (r1 < r0) goto L5
            long r0 = r11.zzm
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L3b
            goto L3c
        L3b:
            r2 = 0
        L3c:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            com.google.android.gms.internal.ads.zzaeh r4 = r11.zze
            long r5 = r11.zzm
            r7 = 1
            int r8 = r11.zzl
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            long r0 = r11.zzm
            long r4 = r11.zzk
            long r0 = r0 + r4
            r11.zzm = r0
            r11.zzh = r3
            r11.zzg = r3
            goto L5
        L57:
            int r0 = r12.zzb()
            int r4 = r11.zzh
            r5 = 4
            int r4 = 4 - r4
            int r0 = java.lang.Math.min(r0, r4)
            com.google.android.gms.internal.ads.zzek r4 = r11.zza
            byte[] r4 = r4.zzN()
            int r6 = r11.zzh
            r12.zzH(r4, r6, r0)
            int r4 = r11.zzh
            int r4 = r4 + r0
            r11.zzh = r4
            if (r4 < r5) goto L5
            com.google.android.gms.internal.ads.zzek r0 = r11.zza
            r0.zzL(r3)
            com.google.android.gms.internal.ads.zzadt r0 = r11.zzb
            com.google.android.gms.internal.ads.zzek r4 = r11.zza
            int r4 = r4.zzg()
            boolean r0 = r0.zza(r4)
            if (r0 != 0) goto L8f
            r11.zzh = r3
            r11.zzg = r2
            goto L5
        L8f:
            com.google.android.gms.internal.ads.zzadt r0 = r11.zzb
            int r4 = r0.zzc
            r11.zzl = r4
            boolean r4 = r11.zzi
            if (r4 != 0) goto Le0
            int r4 = r0.zzg
            long r6 = (long) r4
            int r0 = r0.zzd
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r8
            long r8 = (long) r0
            long r6 = r6 / r8
            r11.zzk = r6
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r4 = r11.zzf
            r0.zzL(r4)
            com.google.android.gms.internal.ads.zzadt r4 = r11.zzb
            java.lang.String r4 = r4.zzb
            r0.zzZ(r4)
            r4 = 4096(0x1000, float:5.74E-42)
            r0.zzQ(r4)
            com.google.android.gms.internal.ads.zzadt r4 = r11.zzb
            int r4 = r4.zze
            r0.zzz(r4)
            com.google.android.gms.internal.ads.zzadt r4 = r11.zzb
            int r4 = r4.zzd
            r0.zzaa(r4)
            java.lang.String r4 = r11.zzc
            r0.zzP(r4)
            int r4 = r11.zzd
            r0.zzX(r4)
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzaf()
            com.google.android.gms.internal.ads.zzaeh r4 = r11.zze
            r4.zzl(r0)
            r11.zzi = r2
        Le0:
            com.google.android.gms.internal.ads.zzek r0 = r11.zza
            r0.zzL(r3)
            com.google.android.gms.internal.ads.zzaeh r0 = r11.zze
            com.google.android.gms.internal.ads.zzek r2 = r11.zza
            r0.zzq(r2, r5)
            r11.zzg = r1
            goto L5
        Lf0:
            byte[] r0 = r12.zzN()
            int r4 = r12.zzd()
            int r5 = r12.zze()
        Lfc:
            if (r4 >= r5) goto L133
            int r6 = r4 + 1
            r7 = r0[r4]
            r8 = r7 & 255(0xff, float:3.57E-43)
            r9 = 255(0xff, float:3.57E-43)
            if (r8 != r9) goto L10a
            r8 = 1
            goto L10b
        L10a:
            r8 = 0
        L10b:
            boolean r9 = r11.zzj
            if (r9 == 0) goto L117
            r7 = r7 & 224(0xe0, float:3.14E-43)
            r9 = 224(0xe0, float:3.14E-43)
            if (r7 != r9) goto L117
            r7 = 1
            goto L118
        L117:
            r7 = 0
        L118:
            r11.zzj = r8
            if (r7 == 0) goto L131
            r12.zzL(r6)
            r11.zzj = r3
            com.google.android.gms.internal.ads.zzek r3 = r11.zza
            byte[] r3 = r3.zzN()
            r0 = r0[r4]
            r3[r2] = r0
            r11.zzh = r1
            r11.zzg = r2
            goto L5
        L131:
            r4 = r6
            goto Lfc
        L133:
            r12.zzL(r5)
            goto L5
        L138:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(com.google.android.gms.internal.ads.zzade r2, com.google.android.gms.internal.ads.zzaon r3) {
            r1 = this;
            r3.zzc()
            java.lang.String r0 = r3.zzb()
            r1.zzf = r0
            int r3 = r3.zza()
            r0 = 1
            com.google.android.gms.internal.ads.zzaeh r2 = r2.zzw(r3, r0)
            r1.zze = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long r1, int r3) {
            r0 = this;
            r0.zzm = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
            r2 = this;
            r0 = 0
            r2.zzg = r0
            r2.zzh = r0
            r2.zzj = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzm = r0
            return
    }
}
