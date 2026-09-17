package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbjs implements com.google.android.gms.internal.ads.zzbjw {
    zzbjs() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r2 = (com.google.android.gms.internal.ads.zzcfo) r2
            java.lang.String r0 = "action"
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "pause"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L16
            r2.zzdg()
            return
        L16:
            java.lang.String r0 = "resume"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L21
            r2.zzdh()
        L21:
            return
    }
}
