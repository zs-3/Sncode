package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzca extends android.database.ContentObserver {
    zzca(android.os.Handler r1) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = com.google.android.gms.internal.auth.zzcb.zzb()
            r0 = 1
            r2.set(r0)
            return
    }
}
