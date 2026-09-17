package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzccn implements android.media.AudioManager.OnAudioFocusChangeListener {
    private final android.media.AudioManager zza;
    private final com.google.android.gms.internal.ads.zzccm zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf;

    public zzccn(android.content.Context r2, com.google.android.gms.internal.ads.zzccm r3) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.zzf = r0
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1.zza = r2
            r1.zzb = r3
            return
    }

    private final void zzf() {
            r5 = this;
            boolean r0 = r5.zzd
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2a
            boolean r0 = r5.zze
            if (r0 != 0) goto L2a
            float r0 = r5.zzf
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2a
            boolean r0 = r5.zzc
            if (r0 != 0) goto L40
            android.media.AudioManager r0 = r5.zza
            if (r0 == 0) goto L24
            r3 = 3
            r4 = 2
            int r0 = r0.requestAudioFocus(r5, r3, r4)
            if (r0 != r2) goto L22
            r1 = 1
        L22:
            r5.zzc = r1
        L24:
            com.google.android.gms.internal.ads.zzccm r0 = r5.zzb
            r0.zzn()
            return
        L2a:
            boolean r0 = r5.zzc
            if (r0 == 0) goto L40
            android.media.AudioManager r0 = r5.zza
            if (r0 == 0) goto L3b
            int r0 = r0.abandonAudioFocus(r5)
            if (r0 != 0) goto L39
            r1 = 1
        L39:
            r5.zzc = r1
        L3b:
            com.google.android.gms.internal.ads.zzccm r0 = r5.zzb
            r0.zzn()
        L40:
            return
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int r1) {
            r0 = this;
            if (r1 <= 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzccm r1 = r0.zzb
            r1.zzn()
            return
    }

    public final float zza() {
            r3 = this;
            boolean r0 = r3.zze
            r1 = 0
            if (r0 == 0) goto L7
            r0 = 0
            goto L9
        L7:
            float r0 = r3.zzf
        L9:
            boolean r2 = r3.zzc
            if (r2 == 0) goto Le
            return r0
        Le:
            return r1
    }

    public final void zzb() {
            r1 = this;
            r0 = 1
            r1.zzd = r0
            r1.zzf()
            return
    }

    public final void zzc() {
            r1 = this;
            r0 = 0
            r1.zzd = r0
            r1.zzf()
            return
    }

    public final void zzd(boolean r1) {
            r0 = this;
            r0.zze = r1
            r0.zzf()
            return
    }

    public final void zze(float r1) {
            r0 = this;
            r0.zzf = r1
            r0.zzf()
            return
    }
}
