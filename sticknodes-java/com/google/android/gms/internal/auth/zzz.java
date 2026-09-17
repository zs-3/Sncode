package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzz extends com.google.android.gms.internal.auth.zzl {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzz(com.google.android.gms.internal.auth.zzab r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzm
    public final void zzb(com.google.android.gms.common.api.Status r2, com.google.android.gms.auth.AccountChangeEventsResponse r3) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            com.google.android.gms.internal.auth.zzab.zzf(r2, r3, r0)
            return
    }
}
