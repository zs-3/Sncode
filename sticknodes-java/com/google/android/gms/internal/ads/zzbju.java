package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbju implements com.google.android.gms.internal.ads.zzbjw {
    zzbju() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcfo r3 = (com.google.android.gms.internal.ads.zzcfo) r3
            java.util.Set r0 = r4.keySet()
            java.lang.String r1 = "start"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L12
            r0 = 1
            r3.zzax(r0)
        L12:
            java.util.Set r4 = r4.keySet()
            java.lang.String r0 = "stop"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L22
            r4 = 0
            r3.zzax(r4)
        L22:
            return
    }
}
