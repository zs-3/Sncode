package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzrh implements com.google.android.gms.internal.ads.zzpv {
    final /* synthetic */ com.google.android.gms.internal.ads.zzri zza;

    /* synthetic */ zzrh(com.google.android.gms.internal.ads.zzri r1, com.google.android.gms.internal.ads.zzrg r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzpv
    public final void zza(java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "MediaCodecAudioRenderer"
            java.lang.String r1 = "Audio sink error"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r1, r3)
            com.google.android.gms.internal.ads.zzri r0 = r2.zza
            com.google.android.gms.internal.ads.zzpq r0 = com.google.android.gms.internal.ads.zzri.zzae(r0)
            r0.zzb(r3)
            return
    }
}
