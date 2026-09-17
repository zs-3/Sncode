package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzant implements com.google.android.gms.internal.ads.zzaoo {
    private final com.google.android.gms.internal.ads.zzamz zza;
    private final com.google.android.gms.internal.ads.zzej zzb;
    private int zzc;
    private int zzd;
    private com.google.android.gms.internal.ads.zzer zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzant(com.google.android.gms.internal.ads.zzamz r3) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            com.google.android.gms.internal.ads.zzej r3 = new com.google.android.gms.internal.ads.zzej
            r0 = 10
            byte[] r1 = new byte[r0]
            r3.<init>(r1, r0)
            r2.zzb = r3
            r3 = 0
            r2.zzc = r3
            return
    }

    private final void zze(int r1) {
            r0 = this;
            r0.zzc = r1
            r1 = 0
            r0.zzd = r1
            return
    }

    private final boolean zzf(com.google.android.gms.internal.ads.zzek r4, byte[] r5, int r6) {
            r3 = this;
            int r0 = r4.zzb()
            int r1 = r3.zzd
            int r1 = r6 - r1
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 1
            if (r0 > 0) goto L10
            return r1
        L10:
            if (r5 != 0) goto L16
            r4.zzM(r0)
            goto L1b
        L16:
            int r2 = r3.zzd
            r4.zzH(r5, r2, r0)
        L1b:
            int r4 = r3.zzd
            int r4 = r4 + r0
            r3.zzd = r4
            if (r4 != r6) goto L23
            return r1
        L23:
            r4 = 0
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zza(com.google.android.gms.internal.ads.zzek r20, int r21) throws com.google.android.gms.internal.ads.zzbo {
            r19 = this;
            r0 = r19
            r1 = r20
            com.google.android.gms.internal.ads.zzer r2 = r0.zze
            com.google.android.gms.internal.ads.zzdi.zzb(r2)
            r2 = r21 & 1
            java.lang.String r3 = "PesReader"
            r4 = -1
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L4f
            int r2 = r0.zzc
            if (r2 == 0) goto L4c
            if (r2 == r7) goto L4c
            if (r2 == r5) goto L47
            int r2 = r0.zzj
            if (r2 == r4) goto L38
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unexpected start indicator: expected "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r2 = " more bytes"
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r3, r2)
        L38:
            int r2 = r20.zze()
            if (r2 != 0) goto L40
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            com.google.android.gms.internal.ads.zzamz r8 = r0.zza
            r8.zzc(r2)
            goto L4c
        L47:
            java.lang.String r2 = "Unexpected start indicator reading extended header"
            com.google.android.gms.internal.ads.zzea.zzf(r3, r2)
        L4c:
            r0.zze(r7)
        L4f:
            r2 = r21
        L51:
            int r8 = r20.zzb()
            if (r8 <= 0) goto L205
            int r8 = r0.zzc
            if (r8 == 0) goto L1f6
            if (r8 == r7) goto L150
            if (r8 == r5) goto L8e
            int r8 = r20.zzb()
            int r9 = r0.zzj
            if (r9 != r4) goto L69
            r9 = 0
            goto L6b
        L69:
            int r9 = r8 - r9
        L6b:
            if (r9 <= 0) goto L76
            int r8 = r8 - r9
            int r9 = r20.zzd()
            int r9 = r9 + r8
            r1.zzK(r9)
        L76:
            com.google.android.gms.internal.ads.zzamz r9 = r0.zza
            r9.zza(r1)
            int r9 = r0.zzj
            if (r9 == r4) goto L1f2
            int r9 = r9 - r8
            r0.zzj = r9
            if (r9 != 0) goto L1f2
            com.google.android.gms.internal.ads.zzamz r8 = r0.zza
            r8.zzc(r6)
            r0.zze(r7)
            goto L1f2
        L8e:
            r8 = 10
            int r9 = r0.zzi
            int r8 = java.lang.Math.min(r8, r9)
            com.google.android.gms.internal.ads.zzej r9 = r0.zzb
            byte[] r9 = r9.zza
            boolean r8 = r0.zzf(r1, r9, r8)
            if (r8 == 0) goto L1f2
            r8 = 0
            int r9 = r0.zzi
            boolean r8 = r0.zzf(r1, r8, r9)
            if (r8 == 0) goto L1f2
            com.google.android.gms.internal.ads.zzej r8 = r0.zzb
            r8.zzl(r6)
            boolean r8 = r0.zzf
            r9 = 3
            r10 = 4
            if (r8 == 0) goto L136
            com.google.android.gms.internal.ads.zzej r8 = r0.zzb
            r8.zzn(r10)
            com.google.android.gms.internal.ads.zzej r8 = r0.zzb
            int r8 = r8.zzd(r9)
            long r11 = (long) r8
            com.google.android.gms.internal.ads.zzej r8 = r0.zzb
            r8.zzn(r7)
            com.google.android.gms.internal.ads.zzej r8 = r0.zzb
            r13 = 15
            int r8 = r8.zzd(r13)
            int r8 = r8 << r13
            com.google.android.gms.internal.ads.zzej r14 = r0.zzb
            r14.zzn(r7)
            com.google.android.gms.internal.ads.zzej r14 = r0.zzb
            int r14 = r14.zzd(r13)
            long r14 = (long) r14
            com.google.android.gms.internal.ads.zzej r5 = r0.zzb
            r5.zzn(r7)
            boolean r5 = r0.zzh
            r16 = 30
            if (r5 != 0) goto L126
            boolean r5 = r0.zzg
            if (r5 == 0) goto L126
            com.google.android.gms.internal.ads.zzej r5 = r0.zzb
            r5.zzn(r10)
            com.google.android.gms.internal.ads.zzej r5 = r0.zzb
            int r5 = r5.zzd(r9)
            long r4 = (long) r5
            long r4 = r4 << r16
            com.google.android.gms.internal.ads.zzej r10 = r0.zzb
            r10.zzn(r7)
            com.google.android.gms.internal.ads.zzej r10 = r0.zzb
            int r10 = r10.zzd(r13)
            int r10 = r10 << r13
            com.google.android.gms.internal.ads.zzej r6 = r0.zzb
            r6.zzn(r7)
            com.google.android.gms.internal.ads.zzej r6 = r0.zzb
            int r6 = r6.zzd(r13)
            r17 = r10
            long r9 = (long) r6
            com.google.android.gms.internal.ads.zzej r6 = r0.zzb
            r6.zzn(r7)
            com.google.android.gms.internal.ads.zzer r6 = r0.zze
            r18 = r8
            r13 = r17
            long r7 = (long) r13
            long r4 = r4 | r7
            long r4 = r4 | r9
            r6.zzb(r4)
            r4 = 1
            r0.zzh = r4
            goto L128
        L126:
            r18 = r8
        L128:
            long r4 = r11 << r16
            r6 = r18
            long r6 = (long) r6
            long r4 = r4 | r6
            long r4 = r4 | r14
            com.google.android.gms.internal.ads.zzer r6 = r0.zze
            long r4 = r6.zzb(r4)
            goto L13b
        L136:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L13b:
            boolean r6 = r0.zzk
            r7 = 1
            if (r7 == r6) goto L142
            r10 = 0
            goto L143
        L142:
            r10 = 4
        L143:
            r2 = r2 | r10
            com.google.android.gms.internal.ads.zzamz r6 = r0.zza
            r6.zzd(r4, r2)
            r4 = 3
            r0.zze(r4)
            r4 = -1
            goto L200
        L150:
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            byte[] r4 = r4.zza
            r5 = 9
            boolean r4 = r0.zzf(r1, r4, r5)
            if (r4 == 0) goto L1f1
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            r5 = 0
            r4.zzl(r5)
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            r6 = 24
            int r4 = r4.zzd(r6)
            r6 = 1
            if (r4 == r6) goto L187
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unexpected start code prefix: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r3, r4)
            r4 = -1
            r0.zzj = r4
            r7 = 0
            r9 = 2
            goto L1ed
        L187:
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            r7 = 8
            r4.zzn(r7)
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            r8 = 16
            int r8 = r4.zzd(r8)
            r9 = 5
            r4.zzn(r9)
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            boolean r4 = r4.zzp()
            r0.zzk = r4
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            r9 = 2
            r4.zzn(r9)
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            boolean r4 = r4.zzp()
            r0.zzf = r4
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            boolean r4 = r4.zzp()
            r0.zzg = r4
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            r10 = 6
            r4.zzn(r10)
            com.google.android.gms.internal.ads.zzej r4 = r0.zzb
            int r4 = r4.zzd(r7)
            r0.zzi = r4
            if (r8 != 0) goto L1ce
            r7 = -1
            r0.zzj = r7
        L1cb:
            r4 = -1
        L1cc:
            r7 = 2
            goto L1ed
        L1ce:
            int r8 = r8 + (-3)
            int r8 = r8 - r4
            r0.zzj = r8
            if (r8 >= 0) goto L1cb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Found negative packet payload size: "
            r4.append(r7)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r3, r4)
            r4 = -1
            r0.zzj = r4
            goto L1cc
        L1ed:
            r0.zze(r7)
            goto L200
        L1f1:
            r4 = -1
        L1f2:
            r5 = 0
            r6 = 1
            r9 = 2
            goto L200
        L1f6:
            r5 = 0
            r6 = 1
            r9 = 2
            int r7 = r20.zzb()
            r1.zzM(r7)
        L200:
            r5 = 2
            r6 = 0
            r7 = 1
            goto L51
        L205:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzb(com.google.android.gms.internal.ads.zzer r1, com.google.android.gms.internal.ads.zzade r2, com.google.android.gms.internal.ads.zzaon r3) {
            r0 = this;
            r0.zze = r1
            com.google.android.gms.internal.ads.zzamz r1 = r0.zza
            r1.zzb(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzc() {
            r1 = this;
            r0 = 0
            r1.zzc = r0
            r1.zzd = r0
            r1.zzh = r0
            com.google.android.gms.internal.ads.zzamz r0 = r1.zza
            r0.zze()
            return
    }

    public final boolean zzd(boolean r2) {
            r1 = this;
            int r2 = r1.zzc
            r0 = 3
            if (r2 != r0) goto Lc
            int r2 = r1.zzj
            r0 = -1
            if (r2 != r0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }
}
