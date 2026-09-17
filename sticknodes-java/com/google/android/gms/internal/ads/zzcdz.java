package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdz extends com.google.android.gms.internal.ads.zzcdv {
    public zzcdz(com.google.android.gms.internal.ads.zzccj r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzf() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzt(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = com.google.android.gms.ads.internal.util.client.zzf.zzf(r4)
            java.lang.ref.WeakReference r1 = r3.zzc
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.zzccj r1 = (com.google.android.gms.internal.ads.zzccj) r1
            if (r1 == 0) goto L13
            if (r0 == 0) goto L13
            r1.zzt(r0, r3)
        L13:
            java.lang.String r1 = "VideoStreamNoopCache is doing nothing."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            java.lang.String r1 = "noop"
            java.lang.String r2 = "Noop cache is a noop."
            r3.zzg(r4, r0, r1, r2)
            r4 = 0
            return r4
    }
}
