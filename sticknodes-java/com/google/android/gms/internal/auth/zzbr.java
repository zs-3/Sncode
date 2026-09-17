package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzbr extends com.google.android.gms.internal.auth.zzbd {
    final /* synthetic */ com.google.android.gms.internal.auth.zzbs zza;

    zzbr(com.google.android.gms.internal.auth.zzbs r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            com.google.android.gms.internal.auth.zzbs r0 = r2.zza
            com.google.android.gms.internal.auth.zzbv r1 = new com.google.android.gms.internal.auth.zzbv
            r1.<init>(r3)
            r0.setResult(r1)
            return
        Ld:
            com.google.android.gms.internal.auth.zzbs r3 = r2.zza
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 3006(0xbbe, float:4.212E-42)
            r0.<init>(r1)
            com.google.android.gms.internal.auth.zzbv r1 = new com.google.android.gms.internal.auth.zzbv
            r1.<init>(r0)
            r3.setResult(r1)
            return
    }
}
