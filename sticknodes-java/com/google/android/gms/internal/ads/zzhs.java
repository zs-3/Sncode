package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzhs extends android.content.BroadcastReceiver implements java.lang.Runnable {
    private final android.os.Handler zza;

    public zzhs(com.google.android.gms.internal.ads.zzhu r1, android.os.Handler r2, com.google.android.gms.internal.ads.zzht r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            java.lang.String r1 = r2.getAction()
            java.lang.String r2 = "android.media.AUDIO_BECOMING_NOISY"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L11
            android.os.Handler r1 = r0.zza
            r1.post(r0)
        L11:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            return
    }
}
