package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhhx extends com.google.android.gms.internal.ads.zzhia {
    final java.util.logging.Logger zza;

    public zzhhx(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhia
    public final void zza(java.lang.String r5) {
            r4 = this;
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            java.util.logging.Logger r1 = r4.zza
            java.lang.String r2 = "com.googlecode.mp4parser.util.JuliLogger"
            java.lang.String r3 = "logDebug"
            r1.logp(r0, r2, r3, r5)
            return
    }
}
