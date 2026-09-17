package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfoz extends android.database.ContentObserver {
    private final android.content.Context zza;
    private final android.media.AudioManager zzb;
    private float zzc;
    private final com.google.android.gms.internal.ads.zzfpl zzd;

    public zzfoz(android.os.Handler r1, android.content.Context r2, com.google.android.gms.internal.ads.zzfox r3, com.google.android.gms.internal.ads.zzfpl r4) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            java.lang.String r1 = "audio"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r0.zzb = r1
            r0.zzd = r4
            return
    }

    private final float zzc() {
            r4 = this;
            android.media.AudioManager r0 = r4.zzb
            r1 = 3
            int r2 = r0.getStreamVolume(r1)
            int r0 = r0.getStreamMaxVolume(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 <= 0) goto L1c
            if (r2 > 0) goto L13
            goto L1c
        L13:
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L1d
        L1b:
            return r2
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    private final void zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfpl r0 = r2.zzd
            float r1 = r2.zzc
            r0.zze(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r2) {
            r1 = this;
            super.onChange(r2)
            float r2 = r1.zzc()
            float r0 = r1.zzc
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L12
            r1.zzc = r2
            r1.zzd()
        L12:
            return
    }

    public final void zza() {
            r3 = this;
            float r0 = r3.zzc()
            r3.zzc = r0
            r3.zzd()
            android.content.Context r0 = r3.zza
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = android.provider.Settings.System.CONTENT_URI
            r2 = 1
            r0.registerContentObserver(r1, r2, r3)
            return
    }

    public final void zzb() {
            r1 = this;
            android.content.Context r0 = r1.zza
            android.content.ContentResolver r0 = r0.getContentResolver()
            r0.unregisterContentObserver(r1)
            return
    }
}
