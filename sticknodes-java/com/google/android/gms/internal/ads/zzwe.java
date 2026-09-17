package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzwe extends com.google.android.gms.internal.ads.zztx implements com.google.android.gms.internal.ads.zzvv {
    private final com.google.android.gms.internal.ads.zzgf zza;
    private final com.google.android.gms.internal.ads.zzrv zzb;
    private final int zzc;
    private boolean zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private com.google.android.gms.internal.ads.zzhh zzh;
    private com.google.android.gms.internal.ads.zzbc zzi;
    private final com.google.android.gms.internal.ads.zzwb zzj;
    private final com.google.android.gms.internal.ads.zzze zzk;

    /* synthetic */ zzwe(com.google.android.gms.internal.ads.zzbc r1, com.google.android.gms.internal.ads.zzgf r2, com.google.android.gms.internal.ads.zzwb r3, com.google.android.gms.internal.ads.zzrv r4, com.google.android.gms.internal.ads.zzze r5, int r6, com.google.android.gms.internal.ads.zzwd r7) {
            r0 = this;
            r0.<init>()
            r0.zzi = r1
            r0.zza = r2
            r0.zzj = r3
            r0.zzb = r4
            r0.zzk = r5
            r0.zzc = r6
            r1 = 1
            r0.zzd = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r1
            return
    }

    private final void zzw() {
            r25 = this;
            r0 = r25
            com.google.android.gms.internal.ads.zzwr r10 = new com.google.android.gms.internal.ads.zzwr
            long r8 = r0.zze
            boolean r11 = r0.zzf
            boolean r1 = r0.zzg
            com.google.android.gms.internal.ads.zzbc r14 = r25.zzJ()
            if (r1 == 0) goto L13
            com.google.android.gms.internal.ads.zzav r1 = r14.zzc
            goto L14
        L13:
            r1 = 0
        L14:
            r21 = r1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = r6
            r4 = r6
            r12 = 0
            r15 = 0
            r20 = r14
            r14 = r15
            r17 = 0
            r18 = 0
            r19 = 0
            r1 = r10
            r22 = r8
            r24 = r10
            r16 = r11
            r10 = r22
            r1.<init>(r2, r4, r6, r8, r10, r12, r14, r16, r17, r18, r19, r20, r21)
            boolean r1 = r0.zzd
            if (r1 == 0) goto L42
            com.google.android.gms.internal.ads.zzwa r10 = new com.google.android.gms.internal.ads.zzwa
            r1 = r24
            r10.<init>(r0, r1)
            goto L45
        L42:
            r1 = r24
            r10 = r1
        L45:
            r0.zzo(r10)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzG(com.google.android.gms.internal.ads.zzuw r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzvz r1 = (com.google.android.gms.internal.ads.zzvz) r1
            r1.zzN()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final com.google.android.gms.internal.ads.zzuw zzI(com.google.android.gms.internal.ads.zzuy r17, com.google.android.gms.internal.ads.zzza r18, long r19) {
            r16 = this;
            r14 = r16
            com.google.android.gms.internal.ads.zzgf r0 = r14.zza
            com.google.android.gms.internal.ads.zzgg r2 = r0.zza()
            com.google.android.gms.internal.ads.zzhh r0 = r14.zzh
            if (r0 == 0) goto Lf
            r2.zzf(r0)
        Lf:
            com.google.android.gms.internal.ads.zzbc r0 = r16.zzJ()
            com.google.android.gms.internal.ads.zzax r0 = r0.zzb
            java.util.Objects.requireNonNull(r0)
            android.net.Uri r1 = r0.zza
            com.google.android.gms.internal.ads.zzwb r0 = r14.zzj
            com.google.android.gms.internal.ads.zzvz r15 = new com.google.android.gms.internal.ads.zzvz
            r16.zzb()
            com.google.android.gms.internal.ads.zzua r3 = new com.google.android.gms.internal.ads.zzua
            com.google.android.gms.internal.ads.zzadg r0 = r0.zza
            r3.<init>(r0)
            com.google.android.gms.internal.ads.zzrv r4 = r14.zzb
            com.google.android.gms.internal.ads.zzrq r5 = r16.zzc(r17)
            com.google.android.gms.internal.ads.zzze r6 = r14.zzk
            com.google.android.gms.internal.ads.zzvh r7 = r16.zze(r17)
            r10 = 0
            int r11 = r14.zzc
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r12 = com.google.android.gms.internal.ads.zzeu.zzr(r8)
            r0 = r15
            r8 = r16
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r15
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final synchronized com.google.android.gms.internal.ads.zzbc zzJ() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbc r0 = r1.zzi     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zza(long r4, boolean r6, boolean r7) {
            r3 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto Lb
            long r4 = r3.zze
        Lb:
            boolean r0 = r3.zzd
            if (r0 != 0) goto L1e
            long r0 = r3.zze
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L1e
            boolean r0 = r3.zzf
            if (r0 != r6) goto L1e
            boolean r0 = r3.zzg
            if (r0 != r7) goto L1e
            return
        L1e:
            r3.zze = r4
            r3.zzf = r6
            r3.zzg = r7
            r4 = 0
            r3.zzd = r4
            r3.zzw()
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected final void zzn(com.google.android.gms.internal.ads.zzhh r1) {
            r0 = this;
            r0.zzh = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            java.util.Objects.requireNonNull(r1)
            r0.zzb()
            r0.zzw()
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx
    protected final void zzq() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzva
    public final synchronized void zzt(com.google.android.gms.internal.ads.zzbc r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzi = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzz() {
            r0 = this;
            return
    }
}
