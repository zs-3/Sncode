package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzoz {
    private final android.content.Context zza;
    private final android.os.Handler zzb;
    private final com.google.android.gms.internal.ads.zzov zzc;
    private final android.content.BroadcastReceiver zzd;
    private final com.google.android.gms.internal.ads.zzow zze;
    private com.google.android.gms.internal.ads.zzos zzf;
    private com.google.android.gms.internal.ads.zzpa zzg;
    private com.google.android.gms.internal.ads.zzh zzh;
    private boolean zzi;
    private final com.google.android.gms.internal.ads.zzqj zzj;

    zzoz(android.content.Context r2, com.google.android.gms.internal.ads.zzqj r3, com.google.android.gms.internal.ads.zzh r4, com.google.android.gms.internal.ads.zzpa r5) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.zza = r2
            r1.zzj = r3
            r1.zzh = r4
            r1.zzg = r5
            android.os.Looper r3 = com.google.android.gms.internal.ads.zzeu.zzy()
            android.os.Handler r4 = new android.os.Handler
            r5 = 0
            r4.<init>(r3, r5)
            r1.zzb = r4
            int r3 = com.google.android.gms.internal.ads.zzeu.zza
            r0 = 23
            if (r3 < r0) goto L27
            com.google.android.gms.internal.ads.zzov r3 = new com.google.android.gms.internal.ads.zzov
            r3.<init>(r1, r5)
            goto L28
        L27:
            r3 = r5
        L28:
            r1.zzc = r3
            com.google.android.gms.internal.ads.zzoy r3 = new com.google.android.gms.internal.ads.zzoy
            r3.<init>(r1, r5)
            r1.zzd = r3
            android.net.Uri r3 = com.google.android.gms.internal.ads.zzos.zza()
            if (r3 == 0) goto L40
            com.google.android.gms.internal.ads.zzow r5 = new com.google.android.gms.internal.ads.zzow
            android.content.ContentResolver r2 = r2.getContentResolver()
            r5.<init>(r1, r4, r2, r3)
        L40:
            r1.zze = r5
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zza(com.google.android.gms.internal.ads.zzoz r0) {
            android.content.Context r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzh zzb(com.google.android.gms.internal.ads.zzoz r0) {
            com.google.android.gms.internal.ads.zzh r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzpa zzd(com.google.android.gms.internal.ads.zzoz r0) {
            com.google.android.gms.internal.ads.zzpa r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzoz r0, com.google.android.gms.internal.ads.zzpa r1) {
            r1 = 0
            r0.zzg = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzoz r0, com.google.android.gms.internal.ads.zzos r1) {
            r0.zzj(r1)
            return
    }

    private final void zzj(com.google.android.gms.internal.ads.zzos r2) {
            r1 = this;
            boolean r0 = r1.zzi
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzos r0 = r1.zzf
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L15
            r1.zzf = r2
            com.google.android.gms.internal.ads.zzqj r0 = r1.zzj
            com.google.android.gms.internal.ads.zzrc r0 = r0.zza
            r0.zzJ(r2)
        L15:
            return
    }

    public final com.google.android.gms.internal.ads.zzos zzc() {
            r5 = this;
            boolean r0 = r5.zzi
            if (r0 == 0) goto La
            com.google.android.gms.internal.ads.zzos r0 = r5.zzf
            java.util.Objects.requireNonNull(r0)
            return r0
        La:
            r0 = 1
            r5.zzi = r0
            com.google.android.gms.internal.ads.zzow r0 = r5.zze
            if (r0 == 0) goto L14
            r0.zza()
        L14:
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 23
            if (r0 < r1) goto L25
            com.google.android.gms.internal.ads.zzov r0 = r5.zzc
            if (r0 == 0) goto L25
            android.content.Context r1 = r5.zza
            android.os.Handler r2 = r5.zzb
            com.google.android.gms.internal.ads.zzot.zza(r1, r0, r2)
        L25:
            android.content.Context r0 = r5.zza
            android.content.BroadcastReceiver r1 = r5.zzd
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.media.action.HDMI_AUDIO_PLUG"
            r2.<init>(r3)
            r3 = 0
            android.os.Handler r4 = r5.zzb
            android.content.Intent r0 = r0.registerReceiver(r1, r2, r3, r4)
            android.content.Context r1 = r5.zza
            com.google.android.gms.internal.ads.zzh r2 = r5.zzh
            com.google.android.gms.internal.ads.zzpa r3 = r5.zzg
            com.google.android.gms.internal.ads.zzos r0 = com.google.android.gms.internal.ads.zzos.zzd(r1, r0, r2, r3)
            r5.zzf = r0
            return r0
    }

    public final void zzg(com.google.android.gms.internal.ads.zzh r3) {
            r2 = this;
            r2.zzh = r3
            com.google.android.gms.internal.ads.zzpa r0 = r2.zzg
            android.content.Context r1 = r2.zza
            com.google.android.gms.internal.ads.zzos r3 = com.google.android.gms.internal.ads.zzos.zzc(r1, r3, r0)
            r2.zzj(r3)
            return
    }

    public final void zzh(android.media.AudioDeviceInfo r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzpa r0 = r2.zzg
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto L9
        L7:
            android.media.AudioDeviceInfo r0 = r0.zza
        L9:
            boolean r0 = java.util.Objects.equals(r3, r0)
            if (r0 == 0) goto L10
            return
        L10:
            if (r3 == 0) goto L17
            com.google.android.gms.internal.ads.zzpa r1 = new com.google.android.gms.internal.ads.zzpa
            r1.<init>(r3)
        L17:
            r2.zzg = r1
            android.content.Context r3 = r2.zza
            com.google.android.gms.internal.ads.zzh r0 = r2.zzh
            com.google.android.gms.internal.ads.zzos r3 = com.google.android.gms.internal.ads.zzos.zzc(r3, r0, r1)
            r2.zzj(r3)
            return
    }

    public final void zzi() {
            r2 = this;
            boolean r0 = r2.zzi
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.zzf = r0
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 23
            if (r0 < r1) goto L17
            com.google.android.gms.internal.ads.zzov r0 = r2.zzc
            if (r0 == 0) goto L17
            android.content.Context r1 = r2.zza
            com.google.android.gms.internal.ads.zzot.zzb(r1, r0)
        L17:
            android.content.Context r0 = r2.zza
            android.content.BroadcastReceiver r1 = r2.zzd
            r0.unregisterReceiver(r1)
            com.google.android.gms.internal.ads.zzow r0 = r2.zze
            if (r0 == 0) goto L25
            r0.zzb()
        L25:
            r0 = 0
            r2.zzi = r0
            return
    }
}
