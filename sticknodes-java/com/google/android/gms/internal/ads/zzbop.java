package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbop implements com.google.android.gms.internal.ads.zzcau {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcas zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnt zzb;

    zzbop(com.google.android.gms.internal.ads.zzbor r1, com.google.android.gms.internal.ads.zzcas r2, com.google.android.gms.internal.ads.zzbnt r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
            r2 = this;
            java.lang.String r0 = "callJs > getEngine: Promise rejected"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzboc r0 = new com.google.android.gms.internal.ads.zzboc
            java.lang.String r1 = "Unable to obtain a JavascriptEngine."
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzcas r1 = r2.zza
            r1.zzd(r0)
            com.google.android.gms.internal.ads.zzbnt r0 = r2.zzb
            r0.zzb()
            return
    }
}
