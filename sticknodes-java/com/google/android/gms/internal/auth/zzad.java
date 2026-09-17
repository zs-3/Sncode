package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzad extends com.google.android.gms.internal.auth.zzah {
    final /* synthetic */ com.google.android.gms.internal.auth.zzae zza;

    zzad(com.google.android.gms.internal.auth.zzae r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzb(android.accounts.Account r4) {
            r3 = this;
            com.google.android.gms.internal.auth.zzae r0 = r3.zza
            com.google.android.gms.internal.auth.zzai r1 = new com.google.android.gms.internal.auth.zzai
            if (r4 == 0) goto L9
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            goto Ld
        L9:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.internal.auth.zzal.zza()
        Ld:
            r1.<init>(r2, r4)
            r0.setResult(r1)
            return
    }
}
