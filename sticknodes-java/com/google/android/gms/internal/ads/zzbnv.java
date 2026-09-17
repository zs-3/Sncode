package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbnv implements com.google.android.gms.internal.ads.zzcau {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnt zza;

    zzbnv(com.google.android.gms.internal.ads.zzbny r1, com.google.android.gms.internal.ads.zzbnt r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
            r3 = this;
            java.lang.String r0 = "Rejecting reference for JS Engine."
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzho
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L26
            com.google.android.gms.internal.ads.zzbnt r0 = r3.zza
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to create JS engine reference."
            r1.<init>(r2)
            java.lang.String r2 = "SdkJavascriptFactory.createNewReference.FailureCallback"
            r0.zzh(r1, r2)
            return
        L26:
            com.google.android.gms.internal.ads.zzbnt r0 = r3.zza
            r0.zzg()
            return
    }
}
