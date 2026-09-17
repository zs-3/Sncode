package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdh implements com.google.android.gms.internal.ads.zzbjw {
    private final java.util.function.Consumer zza;

    public zzcdh(java.util.function.Consumer r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzccj r2 = (com.google.android.gms.internal.ads.zzccj) r2
            java.lang.String r2 = "action"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L12
            java.lang.String r2 = "Action missing from video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return
        L12:
            java.lang.String r0 = "src"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r3.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L28
            java.lang.String r2 = "src missing from video GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            return
        L28:
            java.util.function.Consumer r3 = r1.zza
            r3.accept(r2)
        L2d:
            return
    }
}
