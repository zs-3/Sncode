package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzpq {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.ads.zzpr zzb;

    public zzpq(android.os.Handler r1, com.google.android.gms.internal.ads.zzpr r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final void zza(java.lang.Exception r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpk r1 = new com.google.android.gms.internal.ads.zzpk
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzb(java.lang.Exception r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpl r1 = new com.google.android.gms.internal.ads.zzpl
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzps r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpi r1 = new com.google.android.gms.internal.ads.zzpi
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzps r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpj r1 = new com.google.android.gms.internal.ads.zzpj
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zze(java.lang.String r10, long r11, long r13) {
            r9 = this;
            android.os.Handler r0 = r9.zza
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.zzpo r8 = new com.google.android.gms.internal.ads.zzpo
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r6)
            r0.post(r8)
        L11:
            return
    }

    public final void zzf(java.lang.String r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpp r1 = new com.google.android.gms.internal.ads.zzpp
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzg(com.google.android.gms.internal.ads.zzia r3) {
            r2 = this;
            r3.zza()
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzpf r1 = new com.google.android.gms.internal.ads.zzpf
            r1.<init>(r2, r3)
            r0.post(r1)
        Lf:
            return
    }

    public final void zzh(com.google.android.gms.internal.ads.zzia r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpe r1 = new com.google.android.gms.internal.ads.zzpe
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzi(com.google.android.gms.internal.ads.zzaf r3, com.google.android.gms.internal.ads.zzib r4) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpm r1 = new com.google.android.gms.internal.ads.zzpm
            r1.<init>(r2, r3, r4)
            r0.post(r1)
        Lc:
            return
    }

    final /* synthetic */ void zzj(java.lang.Exception r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zza(r2)
            return
    }

    final /* synthetic */ void zzk(java.lang.Exception r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zzh(r2)
            return
    }

    final /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzps r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zzi(r2)
            return
    }

    final /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzps r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zzj(r2)
            return
    }

    final /* synthetic */ void zzn(java.lang.String r8, long r9, long r11) {
            r7 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r1 = r7.zzb
            r2 = r8
            r3 = r9
            r5 = r11
            r1.zzb(r2, r3, r5)
            return
    }

    final /* synthetic */ void zzo(java.lang.String r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zzc(r2)
            return
    }

    final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzia r2) {
            r1 = this;
            r2.zza()
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zzd(r2)
            return
    }

    final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzia r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zze(r2)
            return
    }

    final /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzaf r2, com.google.android.gms.internal.ads.zzib r3) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zzf(r2, r3)
            return
    }

    final /* synthetic */ void zzs(long r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zzg(r2)
            return
    }

    final /* synthetic */ void zzt(boolean r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r0 = r1.zzb
            r0.zzn(r2)
            return
    }

    final /* synthetic */ void zzu(int r8, long r9, long r11) {
            r7 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzpr r1 = r7.zzb
            r2 = r8
            r3 = r9
            r5 = r11
            r1.zzk(r2, r3, r5)
            return
    }

    public final void zzv(long r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpg r1 = new com.google.android.gms.internal.ads.zzpg
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzw(boolean r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzpn r1 = new com.google.android.gms.internal.ads.zzpn
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzx(int r10, long r11, long r13) {
            r9 = this;
            android.os.Handler r0 = r9.zza
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.zzph r8 = new com.google.android.gms.internal.ads.zzph
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r6)
            r0.post(r8)
        L11:
            return
    }
}
