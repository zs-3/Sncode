package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqp {
    public final com.google.android.gms.internal.ads.zzaf zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final com.google.android.gms.internal.ads.zzcq zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;

    public zzqp(com.google.android.gms.internal.ads.zzaf r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, com.google.android.gms.internal.ads.zzcq r9, boolean r10, boolean r11, boolean r12) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r1 = 0
            r0.zzj = r1
            r0.zzk = r1
            r0.zzl = r1
            return
    }

    public final android.media.AudioTrack zza(com.google.android.gms.internal.ads.zzh r12, int r13) throws com.google.android.gms.internal.ads.zzpu {
            r11 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            r1 = 29
            r2 = 1
            if (r0 < r1) goto L42
            int r0 = r11.zze     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            int r1 = r11.zzf     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            int r3 = r11.zzg     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioFormat r0 = com.google.android.gms.internal.ads.zzeu.zzw(r0, r1, r3)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            com.google.android.gms.internal.ads.zzf r12 = r12.zza()     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioAttributes r12 = r12.zza     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioTrack$Builder r1 = new android.media.AudioTrack$Builder     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            r1.<init>()     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioTrack$Builder r12 = r1.setAudioAttributes(r12)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioTrack$Builder r12 = r12.setAudioFormat(r0)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioTrack$Builder r12 = r12.setTransferMode(r2)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            int r0 = r11.zzh     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioTrack$Builder r12 = r12.setBufferSizeInBytes(r0)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioTrack$Builder r12 = r12.setSessionId(r13)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            int r13 = r11.zzc     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            if (r13 != r2) goto L38
            r13 = 1
            goto L39
        L38:
            r13 = 0
        L39:
            android.media.AudioTrack$Builder r12 = r12.setOffloadedPlayback(r13)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioTrack r12 = r12.build()     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            goto L5d
        L42:
            android.media.AudioTrack r0 = new android.media.AudioTrack     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            com.google.android.gms.internal.ads.zzf r12 = r12.zza()     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioAttributes r4 = r12.zza     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            int r12 = r11.zze     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            int r1 = r11.zzf     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            int r3 = r11.zzg     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            android.media.AudioFormat r5 = com.google.android.gms.internal.ads.zzeu.zzw(r12, r1, r3)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            int r6 = r11.zzh     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            r7 = 1
            r3 = r0
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L7b java.lang.UnsupportedOperationException -> L7d
            r12 = r0
        L5d:
            int r4 = r12.getState()
            if (r4 != r2) goto L64
            return r12
        L64:
            r12.release()     // Catch: java.lang.Exception -> L67
        L67:
            int r5 = r11.zze
            int r6 = r11.zzf
            int r7 = r11.zzh
            com.google.android.gms.internal.ads.zzaf r8 = r11.zza
            com.google.android.gms.internal.ads.zzpu r12 = new com.google.android.gms.internal.ads.zzpu
            boolean r9 = r11.zzc()
            r10 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            throw r12
        L7b:
            r12 = move-exception
            goto L7e
        L7d:
            r12 = move-exception
        L7e:
            r7 = r12
            int r2 = r11.zze
            int r3 = r11.zzf
            int r4 = r11.zzh
            com.google.android.gms.internal.ads.zzaf r5 = r11.zza
            com.google.android.gms.internal.ads.zzpu r12 = new com.google.android.gms.internal.ads.zzpu
            r1 = 0
            boolean r6 = r11.zzc()
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            throw r12
    }

    public final com.google.android.gms.internal.ads.zzps zzb() {
            r9 = this;
            int r0 = r9.zzc
            com.google.android.gms.internal.ads.zzps r8 = new com.google.android.gms.internal.ads.zzps
            r1 = 1
            if (r0 != r1) goto L9
            r6 = 1
            goto Lb
        L9:
            r0 = 0
            r6 = 0
        Lb:
            int r4 = r9.zzf
            int r3 = r9.zze
            int r2 = r9.zzg
            r5 = 0
            int r7 = r9.zzh
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public final boolean zzc() {
            r2 = this;
            int r0 = r2.zzc
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }
}
