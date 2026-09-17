package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqz extends android.media.AudioTrack.StreamEventCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzra zza;

    zzqz(com.google.android.gms.internal.ads.zzra r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(android.media.AudioTrack r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzra r2 = r0.zza
            com.google.android.gms.internal.ads.zzrc r2 = r2.zza
            android.media.AudioTrack r2 = com.google.android.gms.internal.ads.zzrc.zzE(r2)
            r1.equals(r2)
            return
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(android.media.AudioTrack r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzra r0 = r1.zza
            com.google.android.gms.internal.ads.zzrc r0 = r0.zza
            android.media.AudioTrack r0 = com.google.android.gms.internal.ads.zzrc.zzE(r0)
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.zzra r2 = r1.zza
            com.google.android.gms.internal.ads.zzrc r2 = r2.zza
            r0 = 1
            com.google.android.gms.internal.ads.zzrc.zzH(r2, r0)
            return
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(android.media.AudioTrack r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzra r0 = r1.zza
            com.google.android.gms.internal.ads.zzrc r0 = r0.zza
            android.media.AudioTrack r0 = com.google.android.gms.internal.ads.zzrc.zzE(r0)
            r2.equals(r0)
            return
    }
}
