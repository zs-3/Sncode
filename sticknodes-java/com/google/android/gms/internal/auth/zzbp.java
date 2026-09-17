package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzbp extends com.google.android.gms.internal.auth.zzbd {
    final /* synthetic */ com.google.android.gms.internal.auth.zzbq zza;

    zzbp(com.google.android.gms.internal.auth.zzbq r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(com.google.android.gms.auth.api.proxy.ProxyResponse r3) {
            r2 = this;
            com.google.android.gms.internal.auth.zzbq r0 = r2.zza
            com.google.android.gms.internal.auth.zzbu r1 = new com.google.android.gms.internal.auth.zzbu
            r1.<init>(r3)
            r0.setResult(r1)
            return
    }
}
