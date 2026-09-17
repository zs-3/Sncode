package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzcf extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.auth.zzcg zza;

    zzcf(com.google.android.gms.internal.auth.zzcg r1, android.os.Handler r2) {
            r0 = this;
            r0.zza = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r1) {
            r0 = this;
            com.google.android.gms.internal.auth.zzcg r1 = r0.zza
            r1.zze()
            return
    }
}
