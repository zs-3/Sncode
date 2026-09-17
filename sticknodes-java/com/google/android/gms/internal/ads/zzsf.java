package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzsf extends android.os.Handler {
    final /* synthetic */ com.google.android.gms.internal.ads.zzsh zza;

    zzsf(com.google.android.gms.internal.ads.zzsh r1, android.os.Looper r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzsh r0 = r1.zza
            com.google.android.gms.internal.ads.zzsh.zza(r0, r2)
            return
    }
}
