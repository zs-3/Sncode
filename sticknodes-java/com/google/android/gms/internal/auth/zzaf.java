package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzaf extends com.google.android.gms.internal.auth.zzah {
    final /* synthetic */ com.google.android.gms.internal.auth.zzag zza;

    zzaf(com.google.android.gms.internal.auth.zzag r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzc(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.auth.zzag r0 = r2.zza
            com.google.android.gms.internal.auth.zzak r1 = new com.google.android.gms.internal.auth.zzak
            if (r3 == 0) goto L9
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            goto Ld
        L9:
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.internal.auth.zzal.zza()
        Ld:
            r1.<init>(r3)
            r0.setResult(r1)
            return
    }
}
