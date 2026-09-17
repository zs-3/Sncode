package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzsb implements com.google.android.gms.internal.ads.zzsr {
    private final com.google.android.gms.internal.ads.zzfyp zza;
    private final com.google.android.gms.internal.ads.zzfyp zzb;
    private boolean zzc;

    public zzsb(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzrz r0 = new com.google.android.gms.internal.ads.zzrz
            r0.<init>(r3)
            com.google.android.gms.internal.ads.zzsa r1 = new com.google.android.gms.internal.ads.zzsa
            r1.<init>(r3)
            r2.<init>()
            r2.zza = r0
            r2.zzb = r1
            r3 = 1
            r2.zzc = r3
            return
    }

    static /* synthetic */ android.os.HandlerThread zza(int r1) {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = com.google.android.gms.internal.ads.zzsd.zzd(r1)
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ android.os.HandlerThread zzb(int r1) {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = com.google.android.gms.internal.ads.zzsd.zze(r1)
            r0.<init>(r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzsd zzc(com.google.android.gms.internal.ads.zzsq r12) throws java.io.IOException {
            r11 = this;
            com.google.android.gms.internal.ads.zzsw r0 = r12.zza
            java.lang.String r0 = r0.zza
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L83
            r2.<init>()     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = "createCodec:"
            r2.append(r3)     // Catch: java.lang.Exception -> L83
            r2.append(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L83
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Exception -> L83
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.Exception -> L83
            boolean r2 = r11.zzc     // Catch: java.lang.Exception -> L81
            r9 = 35
            if (r2 == 0) goto L3f
            com.google.android.gms.internal.ads.zzaf r2 = r12.zzc     // Catch: java.lang.Exception -> L81
            int r3 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Exception -> L81
            r4 = 34
            if (r3 >= r4) goto L2c
            goto L3f
        L2c:
            if (r3 >= r9) goto L36
            java.lang.String r2 = r2.zzn     // Catch: java.lang.Exception -> L81
            boolean r2 = com.google.android.gms.internal.ads.zzbn.zzi(r2)     // Catch: java.lang.Exception -> L81
            if (r2 == 0) goto L3f
        L36:
            com.google.android.gms.internal.ads.zztv r2 = new com.google.android.gms.internal.ads.zztv     // Catch: java.lang.Exception -> L81
            r2.<init>(r0)     // Catch: java.lang.Exception -> L81
            r3 = 4
            r6 = r2
            r2 = 4
            goto L51
        L3f:
            com.google.android.gms.internal.ads.zzsh r2 = new com.google.android.gms.internal.ads.zzsh     // Catch: java.lang.Exception -> L81
            com.google.android.gms.internal.ads.zzfyp r3 = r11.zzb     // Catch: java.lang.Exception -> L81
            com.google.android.gms.internal.ads.zzsa r3 = (com.google.android.gms.internal.ads.zzsa) r3     // Catch: java.lang.Exception -> L81
            int r3 = r3.zza     // Catch: java.lang.Exception -> L81
            android.os.HandlerThread r3 = zzb(r3)     // Catch: java.lang.Exception -> L81
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L81
            r3 = 0
            r6 = r2
            r2 = 0
        L51:
            com.google.android.gms.internal.ads.zzsd r10 = new com.google.android.gms.internal.ads.zzsd     // Catch: java.lang.Exception -> L81
            com.google.android.gms.internal.ads.zzfyp r3 = r11.zza     // Catch: java.lang.Exception -> L81
            com.google.android.gms.internal.ads.zzrz r3 = (com.google.android.gms.internal.ads.zzrz) r3     // Catch: java.lang.Exception -> L81
            int r3 = r3.zza     // Catch: java.lang.Exception -> L81
            android.os.HandlerThread r5 = zza(r3)     // Catch: java.lang.Exception -> L81
            com.google.android.gms.internal.ads.zzsp r7 = r12.zzf     // Catch: java.lang.Exception -> L81
            r8 = 0
            r3 = r10
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L81
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> L7e
            android.view.Surface r3 = r12.zzd     // Catch: java.lang.Exception -> L7e
            if (r3 != 0) goto L78
            com.google.android.gms.internal.ads.zzsw r4 = r12.zza     // Catch: java.lang.Exception -> L7e
            boolean r4 = r4.zzh     // Catch: java.lang.Exception -> L7e
            if (r4 == 0) goto L78
            int r4 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Exception -> L7e
            if (r4 < r9) goto L78
            r2 = r2 | 8
        L78:
            android.media.MediaFormat r12 = r12.zzb     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzsd.zzh(r10, r12, r3, r1, r2)     // Catch: java.lang.Exception -> L7e
            return r10
        L7e:
            r12 = move-exception
            r1 = r10
            goto L85
        L81:
            r12 = move-exception
            goto L85
        L83:
            r12 = move-exception
            r0 = r1
        L85:
            if (r1 != 0) goto L8d
            if (r0 == 0) goto L90
            r0.release()
            goto L90
        L8d:
            r1.zzm()
        L90:
            throw r12
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzst zzd(com.google.android.gms.internal.ads.zzsq r1) throws java.io.IOException {
            r0 = this;
            r1 = 0
            throw r1
    }

    public final void zze(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzc = r1
            return
    }
}
