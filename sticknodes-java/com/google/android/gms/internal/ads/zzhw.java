package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzhw implements android.media.AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzhy zza;
    private final android.os.Handler zzb;

    public zzhw(com.google.android.gms.internal.ads.zzhy r1, android.os.Handler r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhv r0 = new com.google.android.gms.internal.ads.zzhv
            r0.<init>(r1, r2)
            android.os.Handler r2 = r1.zzb
            r2.post(r0)
            return
    }
}
