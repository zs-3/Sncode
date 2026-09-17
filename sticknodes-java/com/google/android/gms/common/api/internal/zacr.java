package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zacr implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.signin.internal.zak zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zact zab;

    zacr(com.google.android.gms.common.api.internal.zact r1, com.google.android.gms.signin.internal.zak r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zact r0 = r2.zab
            com.google.android.gms.signin.internal.zak r1 = r2.zaa
            com.google.android.gms.common.api.internal.zact.zad(r0, r1)
            return
    }
}
