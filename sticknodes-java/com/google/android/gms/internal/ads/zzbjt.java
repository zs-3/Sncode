package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbjt implements com.google.android.gms.internal.ads.zzbjw {
    zzbjt() {
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
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzchg r3 = r3.zzN()
            r3.zzl()
            return
        L16:
            java.util.Set r0 = r4.keySet()
            java.lang.String r1 = "stop"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a
            com.google.android.gms.internal.ads.zzchg r3 = r3.zzN()
            r3.zzm()
            return
        L2a:
            java.util.Set r4 = r4.keySet()
            java.lang.String r0 = "cancel"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L3d
            com.google.android.gms.internal.ads.zzchg r3 = r3.zzN()
            r3.zzk()
        L3d:
            return
    }
}
