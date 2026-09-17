package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzabp {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.ads.zzabq zzb;

    public zzabp(android.os.Handler r1, com.google.android.gms.internal.ads.zzabq r2) {
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

    public final void zza(java.lang.String r10, long r11, long r13) {
            r9 = this;
            android.os.Handler r0 = r9.zza
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.zzabf r8 = new com.google.android.gms.internal.ads.zzabf
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

    public final void zzb(java.lang.String r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzabo r1 = new com.google.android.gms.internal.ads.zzabo
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzia r3) {
            r2 = this;
            r3.zza()
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzabn r1 = new com.google.android.gms.internal.ads.zzabn
            r1.<init>(r2, r3)
            r0.post(r1)
        Lf:
            return
    }

    public final void zzd(int r3, long r4) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzabh r1 = new com.google.android.gms.internal.ads.zzabh
            r1.<init>(r2, r3, r4)
            r0.post(r1)
        Lc:
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzia r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzabl r1 = new com.google.android.gms.internal.ads.zzabl
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzaf r3, com.google.android.gms.internal.ads.zzib r4) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzabm r1 = new com.google.android.gms.internal.ads.zzabm
            r1.<init>(r2, r3, r4)
            r0.post(r1)
        Lc:
            return
    }

    final /* synthetic */ void zzg(java.lang.String r8, long r9, long r11) {
            r7 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r1 = r7.zzb
            r2 = r8
            r3 = r9
            r5 = r11
            r1.zzp(r2, r3, r5)
            return
    }

    final /* synthetic */ void zzh(java.lang.String r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzq(r2)
            return
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzia r2) {
            r1 = this;
            r2.zza()
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzr(r2)
            return
    }

    final /* synthetic */ void zzj(int r2, long r3) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzl(r2, r3)
            return
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzia r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzs(r2)
            return
    }

    final /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzaf r2, com.google.android.gms.internal.ads.zzib r3) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzu(r2, r3)
            return
    }

    final /* synthetic */ void zzm(java.lang.Object r2, long r3) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzm(r2, r3)
            return
    }

    final /* synthetic */ void zzn(long r2, int r4) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzt(r2, r4)
            return
    }

    final /* synthetic */ void zzo(java.lang.Exception r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzo(r2)
            return
    }

    final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzcp r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzabq r0 = r1.zzb
            r0.zzv(r2)
            return
    }

    public final void zzq(java.lang.Object r5) {
            r4 = this;
            android.os.Handler r0 = r4.zza
            if (r0 == 0) goto L10
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.zzabi r3 = new com.google.android.gms.internal.ads.zzabi
            r3.<init>(r4, r5, r1)
            r0.post(r3)
        L10:
            return
    }

    public final void zzr(long r3, int r5) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzabj r1 = new com.google.android.gms.internal.ads.zzabj
            r1.<init>(r2, r3, r5)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzs(java.lang.Exception r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzabk r1 = new com.google.android.gms.internal.ads.zzabk
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }

    public final void zzt(com.google.android.gms.internal.ads.zzcp r3) {
            r2 = this;
            android.os.Handler r0 = r2.zza
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzabg r1 = new com.google.android.gms.internal.ads.zzabg
            r1.<init>(r2, r3)
            r0.post(r1)
        Lc:
            return
    }
}
